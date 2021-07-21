package com.dio.bootcamp.santander.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class JornadaTrabalhoNotFoundException extends Exception{
    public JornadaTrabalhoNotFoundException(Long id) {
        super("Jornada de trabalho não encontrada com o ID " + id);
    }
}
