package com.deligkarisk.validating_nested_objects.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.Valid;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    @Id
    private int id;
    private String name;

    @ManyToOne
    @Valid
    private Owner owner;

}
