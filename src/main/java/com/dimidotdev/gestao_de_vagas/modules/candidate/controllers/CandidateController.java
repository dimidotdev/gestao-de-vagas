package com.dimidotdev.gestao_de_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dimidotdev.gestao_de_vagas.modules.candidate.CanditateEntity;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

    @PostMapping
    public void create(@Valid @RequestBody CanditateEntity canditate) {
        System.out.println(canditate.getEmail());
    }
    
}
