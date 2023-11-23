package com.micro.training.msagreement.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/contact/management")
public class ContactDataManagementController {

    //CRUD: Datasal Dizayn

    //Data'dan ayrılın
    //Önce objeyi tasarlayın
    //PUT, PATCH ,DELETE, GET , POST

    //Body'de bişey göndermiyorsak
    @PostMapping("/update")
    public void update(){

    }
}
