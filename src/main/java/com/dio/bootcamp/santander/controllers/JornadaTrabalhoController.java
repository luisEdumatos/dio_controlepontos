package com.dio.bootcamp.santander.controllers;

import com.dio.bootcamp.santander.entities.JornadaTrabalho;
import com.dio.bootcamp.santander.services.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    JornadaTrabalhoService jornadaTrabalhoService;

    @Autowired
    public JornadaTrabalhoController(JornadaTrabalhoService jornadaTrabalhoService) {
        this.jornadaTrabalhoService = jornadaTrabalhoService;
    }

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.saveJornada(jornadaTrabalho);
    }
}
