package com.micro.training.msagreement.rest.models;

import com.micro.training.msagreement.validation.BadWords;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;


import java.util.List;

@Data  //Encapsulation
public class ContactDto {
    @NotEmpty
    @NotBlank
    @Size(min=2, max=15)
    @BadWords(value = {"abc", "123", "qwe"})
    private String firstName;

    @NotEmpty
    @NotBlank
    @Size(min=3, max=20)
    private String lastName;

    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")
    private String password;

    @Email
    private String email;

    @Size(min = 1)
    @Valid //Alt anatosyanların devreye girmesi için Valid etmek gerekiyor.
    private List<PhoneDto> phoneNumbers;
}
