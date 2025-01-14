package com.dimidotdev.gestao_de_vagas.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorMessageDTO {
    
    private String message;
    private String field;

}
