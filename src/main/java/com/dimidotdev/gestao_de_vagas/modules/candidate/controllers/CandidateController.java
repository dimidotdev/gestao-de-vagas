package com.dimidotdev.gestao_de_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dimidotdev.gestao_de_vagas.modules.candidate.CandidateEntity;
import com.dimidotdev.gestao_de_vagas.modules.candidate.CandidateRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

    private final CandidateRepository candidateRepository;

    public CandidateController(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @PostMapping
    public CandidateEntity create(@Valid @RequestBody CandidateEntity candidateEntity) {
        return this.candidateRepository.save(candidateEntity);
    }
    
}
