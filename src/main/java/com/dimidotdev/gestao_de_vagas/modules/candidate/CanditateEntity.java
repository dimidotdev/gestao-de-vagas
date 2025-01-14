package com.dimidotdev.gestao_de_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CanditateEntity {
    
    private UUID id;
    private String name;
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Nome de usuário deve conter apenas letras e números")
    private String username;
    @Length(min = 4, message = "Senha deve ter no mínimo 4 caracteres")
    private String password;
    @Email(message = "Email deve ser válido")
    private String email;
    private String description;
    private String curriculum;

}
