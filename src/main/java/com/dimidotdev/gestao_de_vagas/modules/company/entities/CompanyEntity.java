package com.dimidotdev.gestao_de_vagas.modules.company.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "company")
@Getter
@Setter
public class CompanyEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Username is required")
    @Pattern(regexp = "^[a-z0-9_-]{3,15}$", message = "Username must be between 3 and 15 characters and can only contain lowercase letters, numbers, underscores and hyphens")
    private String username;

    @NotBlank(message = "Password is required")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$", message = "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter and one number")
    private String password;

    @Email(message = "Invalid email")
    private String email;

    private String website;

    @Length(max = 255, message = "Description must be at most 255 characters long")
    private String description;

    @CreationTimestamp
    private LocalDateTime createdAt;
    
}
