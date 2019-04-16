package com.kklaczek.dentist_web_api.serviceImpl;

import com.kklaczek.dentist_web_api.dto.DentistDto;
import com.kklaczek.dentist_web_api.dto.ReviewsDto;
import com.kklaczek.dentist_web_api.entity.Dentist;
import com.kklaczek.dentist_web_api.repository.AddressRepository;
import com.kklaczek.dentist_web_api.repository.DentistRepository;
import com.kklaczek.dentist_web_api.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchServiceImpl implements SearchService {

    private final DentistRepository dentistRepository;
    private final AddressRepository addressRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<DentistDto> findDentistBySpecialtiesAndCity(List<String> specialties, String city) {
        return dentistRepository.findAllBySpecialtiesAndDentalOffice_Address_City(specialties, city)
                .stream().map(d -> modelMapper.map(d, DentistDto.class))
                .peek(dentist -> dentist.setReviewsDtos(
                        dentist.getReviewsDtos()
                                .stream()
                                .sorted(Comparator.comparing(ReviewsDto::getRate))
                                .collect(Collectors.toCollection(LinkedHashSet::new))))
                .collect(Collectors.toList());
    }

    
}
