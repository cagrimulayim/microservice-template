package com.micro.training.msagreement.rest;

import com.micro.training.msagreement.rest.models.ContactDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/contact/provision")
public class ContactProvisionController {

    //Best Pricties : Komut controllerlarda  en fazla 5 tane method
    //Querylerde max 10 tane.

    //Provision işi sisteme ekleme işidir sadece.

    //Cohesion : Anlam bütünlüğü


    @PostMapping("/add")
    public String add(@Valid @RequestBody ContactDto contactDtoParam){
        // Sonuca göre isim vermiyoruz.
        return "OK";

    }
}
