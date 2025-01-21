package com.dimidotdev.gestao_de_vagas.modules.candidate.usecases;

import org.springframework.stereotype.Service;

import com.dimidotdev.gestao_de_vagas.exceptions.UserFoundException;
import com.dimidotdev.gestao_de_vagas.modules.candidate.CandidateEntity;
import com.dimidotdev.gestao_de_vagas.modules.candidate.CandidateRepository;

@Service
public class CreateCandidateUseCase {

    private final CandidateRepository candidateRepository;

    public CreateCandidateUseCase(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }
    
    public CandidateEntity execute(CandidateEntity candidateEntity) {
        this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
            .ifPresent(candidate -> {
                throw new UserFoundException("Username or email already exists");
            });
        return this.candidateRepository.save(candidateEntity);
    }

}
