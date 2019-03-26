package com.kklaczek.dentist_web_api.validators;

import com.kklaczek.dentist_web_api.entity.Address;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AddressValidator {

    private Map<String, String> errors = new HashMap<>();

    public Map<String, String> validate(Address address){
        errors.clear();

        if(address == null){
            errors.put("address", "Address is null");
        }

        if(!isCityValid(address)){
            errors.put("city", "Address city is not valid");
        }


        if(!isPostCodeValid(address)){
            errors.put("post code", "Address post code is not valid");
        }

        if(!isStreetValid(address)){
            errors.put("street", "Address street is not valid");
        }

        if(!isHouseNumberValid(address)){
            errors.put("house number", "Address house number is not valid");
        }

        return errors;
    }

    private boolean isCityValid(Address address){
        return address.getCity() != null && address.getCity().matches("[A-Z][a-z]+");
    }

    private boolean isPostCodeValid(Address address){
        return address.getPostCode().matches("\\d{2}-\\d{3}");
    }

    private boolean isStreetValid(Address address){
        return address.getStreet().matches("([A-Z][a-z]+)([A-Z][a-z]+ [A-Z][a-z]+)");
    }

    private boolean isHouseNumberValid(Address address){
        return address.getHouseNumber().matches("\\d+|\\d+[a-z]|(\\d+/\\d+([a-z]))");
    }

}
