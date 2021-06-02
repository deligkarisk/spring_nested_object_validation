package com.deligkarisk.validating_nested_objects.converter;


import com.deligkarisk.validating_nested_objects.domain.Owner;
import com.deligkarisk.validating_nested_objects.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StringToOwner implements Converter<String, Owner> {

    @Autowired
    OwnerRepository ownerRepository;

    @Override
    public Owner convert(String s) {

        Optional<Owner> optOwner = ownerRepository.findById(Integer.parseInt(s));
        if (optOwner.isEmpty()) {
            throw new IllegalArgumentException("Wrong value entered");
        }
        return optOwner.get();
    }
}
