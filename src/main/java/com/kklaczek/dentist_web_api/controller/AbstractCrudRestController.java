package com.kklaczek.dentist_web_api.controller;


import com.kklaczek.dentist_web_api.serviceImpl.AbstractCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractCrudRestController<T, U> {


    private AbstractCrudService<T, U> abstractCrudService;

    @Autowired
    public void setAbstractCrudService(AbstractCrudService<T,U> abstractCrudService){
        this.abstractCrudService = abstractCrudService;
    }

    @PostMapping("/add")
    public ResponseEntity<U> save(@RequestBody U u){
        return new ResponseEntity<>(abstractCrudService.save(u), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<U> findById(@PathVariable Long id){
        return new ResponseEntity<>(abstractCrudService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/edit}")
    public ResponseEntity<U> edit(@RequestBody U u){
        return new ResponseEntity<>(abstractCrudService.edit(u), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<U> delete(@PathVariable Long id){
        return new ResponseEntity<>(abstractCrudService.delete(id), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public  ResponseEntity<List<U>> findAll(){
        return new ResponseEntity<>(abstractCrudService.findAll(), HttpStatus.OK);
    }
}
