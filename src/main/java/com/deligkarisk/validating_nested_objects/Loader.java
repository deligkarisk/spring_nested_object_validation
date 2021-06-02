package com.deligkarisk.validating_nested_objects;


import com.deligkarisk.validating_nested_objects.domain.Owner;
import com.deligkarisk.validating_nested_objects.domain.Pet;
import com.deligkarisk.validating_nested_objects.repository.OwnerRepository;
import com.deligkarisk.validating_nested_objects.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Loader implements CommandLineRunner {

    @Autowired
    OwnerRepository ownerRepository;

    @Autowired
    PetRepository petRepository;


    @Override
    public void run(String... args) throws Exception {


        Owner John = new Owner(1, "John", "Doe");
        Owner Maria = new Owner(2,"Maria","Doe");
        Pet Max = new Pet(1, "Max", John);


        ownerRepository.save(John);
        ownerRepository.save(Maria);
        petRepository.save(Max);





    }
}
