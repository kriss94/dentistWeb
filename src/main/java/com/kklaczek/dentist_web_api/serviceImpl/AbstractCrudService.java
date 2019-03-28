package com.kklaczek.dentist_web_api.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.lang.reflect.ParameterizedType;


@RequiredArgsConstructor
public abstract class AbstractCrudService<T, U> {

    private final JpaRepository<T, Long> jpaRepository;
    private final ModelMapper modelMapper;


    private Class<T> typeT = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    private Class<U> typeU = (Class<U>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1];

    public U save(U u) {
        T t = modelMapper.map(u, typeT);
        return modelMapper.map(jpaRepository.save(t), typeU);
    }

    public U findById(Long id) {
        T t = jpaRepository.findById(id).orElseThrow(NullPointerException::new);
        return modelMapper.map(t, typeU);
    }

    public U edit(Long id, U u) {
        T t = jpaRepository.findById(id).orElseThrow(NullPointerException::new);
        t = modelMapper.map(u, typeT);
        return modelMapper.map(jpaRepository.save(t),typeU);
    }

    public U delete(Long id) {
        U u = modelMapper.map(jpaRepository.findById(id).orElseThrow(NullPointerException::new), typeU);
        jpaRepository.deleteById(id);
        return u;
    }

}
