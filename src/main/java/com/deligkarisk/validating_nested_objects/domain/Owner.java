package com.deligkarisk.validating_nested_objects.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.annotation.security.RolesAllowed;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Owner {

    @Id
    @NotNull
    @NonNull
    private int id;

    private String firstName;

    private String lastName;

}
