package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.InformationDto;
import com.kklaczek.dentist_web_api.entity.Information;
import com.kklaczek.dentist_web_api.repository.InformationRepository;
import com.kklaczek.dentist_web_api.service.InformationService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InformationServiceImpl implements InformationService {

    private final ModelMapper modelMapper;
    private final InformationRepository informationRepository;

    @Override
    public InformationDto save(InformationDto informationDto) {
        Information information = modelMapper.map(informationDto, Information.class);
        return modelMapper.map(informationRepository.save(information), InformationDto.class);
    }

    @Override
    public InformationDto findById(Long id) {
        return modelMapper.map(informationRepository.findById(id).orElseThrow(NullPointerException::new), InformationDto.class);
    }

    @Override
    public InformationDto edit(Long id, InformationDto informationDto) {
        Information information = modelMapper.map(informationDto, Information.class);
        information.setId(id);
        return modelMapper.map(informationRepository.save(information), InformationDto.class);
    }

    @Override
    public InformationDto delete(Long id) {
        InformationDto informationDto = modelMapper.map(informationRepository.findById(id).orElseThrow(NullPointerException::new),InformationDto.class);
        informationRepository.deleteById(id);
        return informationDto;
    }
}
