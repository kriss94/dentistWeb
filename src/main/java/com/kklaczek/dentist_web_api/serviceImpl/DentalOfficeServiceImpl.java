package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.DentalOfficeDto;
import com.kklaczek.dentist_web_api.entity.DentalOffice;
import com.kklaczek.dentist_web_api.repository.DentalOfficeRepository;
import com.kklaczek.dentist_web_api.service.DentalOfficeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DentalOfficeServiceImpl implements DentalOfficeService {
    private final ModelMapper modelMapper;
    private final DentalOfficeRepository dentalOfficeRepository;

    @Override
    public DentalOfficeDto save(DentalOfficeDto dentalOfficeDto) {
        DentalOffice dentalOffice = modelMapper.map(dentalOfficeDto, DentalOffice.class);
        return modelMapper.map(dentalOfficeRepository.save(dentalOffice), DentalOfficeDto.class);
    }

    @Override
    public DentalOfficeDto findById(Long id) {
        return modelMapper.map(dentalOfficeRepository.findById(id).orElseThrow(NullPointerException::new), DentalOfficeDto.class);
    }

    @Override
    public DentalOfficeDto edit(Long id, DentalOfficeDto dentalOfficeDto) {
        DentalOffice dentalOffice = modelMapper.map(dentalOfficeDto, DentalOffice.class);
        dentalOffice.setId(id);
        return modelMapper.map(dentalOfficeRepository.save(dentalOffice), DentalOfficeDto.class);
    }

    @Override
    public DentalOfficeDto delete(Long id) {
        DentalOfficeDto dentalOfficeDto = modelMapper.map(dentalOfficeRepository.findById(id).orElseThrow(NullPointerException::new), DentalOfficeDto.class);
        dentalOfficeRepository.deleteById(id);
        return dentalOfficeDto;
    }
}
