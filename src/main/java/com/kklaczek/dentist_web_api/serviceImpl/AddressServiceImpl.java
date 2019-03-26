package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.AddressDto;
import com.kklaczek.dentist_web_api.entity.Address;
import com.kklaczek.dentist_web_api.repository.AddressRepository;
import com.kklaczek.dentist_web_api.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final ModelMapper modelMapper;
    private final AddressRepository addressRepository;

    @Override
    public AddressDto save(AddressDto addressDto) {
        Address address = modelMapper.map(addressDto, Address.class);
        return modelMapper.map(addressRepository.save(address), AddressDto.class);
    }

    @Override
    public AddressDto findById(Long id) {
        Address address = addressRepository.findById(id).orElseThrow(NullPointerException::new);
        return modelMapper.map(address, AddressDto.class);
    }

    @Override
    public AddressDto edit(Long id, AddressDto addressDto) {
        Address address = modelMapper.map(addressDto, Address.class);
        address.setId(id);
        return modelMapper.map(addressRepository.save(address), AddressDto.class);
    }

    @Override
    public AddressDto delete(Long id) {
        AddressDto addressDto = modelMapper.map(addressRepository.findById(id).orElseThrow(NullPointerException::new), AddressDto.class);
        addressRepository.deleteById(id);
        return addressDto;
    }
}
