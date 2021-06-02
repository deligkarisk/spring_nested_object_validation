package com.deligkarisk.validating_nested_objects.repository;


import com.deligkarisk.validating_nested_objects.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PetRepository extends JpaRepository<Pet,Integer> {
}
