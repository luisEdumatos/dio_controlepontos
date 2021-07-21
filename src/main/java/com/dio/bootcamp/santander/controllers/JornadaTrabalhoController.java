package com.dio.bootcamp.santander.controllers;

import com.dio.bootcamp.santander.dtos.requests.JornadaTrabalhoDTO;
import com.dio.bootcamp.santander.dtos.response.MessageResponseDTO;
import com.dio.bootcamp.santander.exceptions.JornadaTrabalhoNotFoundException;
import com.dio.bootcamp.santander.services.JornadaTrabalhoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/jornada")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class JornadaTrabalhoController {

    private JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createJornadaTrabalho(@RequestBody @Valid JornadaTrabalhoDTO jornadaTrabalhoDTO) {
        return jornadaTrabalhoService.createJornadaTrabalho(jornadaTrabalhoDTO);
    }

    @GetMapping
    public List<JornadaTrabalhoDTO> listAll() {
        return jornadaTrabalhoService.listAll();
    }

    @GetMapping("/{id}")
    public JornadaTrabalhoDTO findById(@PathVariable Long id) throws JornadaTrabalhoNotFoundException {
        return jornadaTrabalhoService.findById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid JornadaTrabalhoDTO jornadaTrabalhoDTO) throws JornadaTrabalhoNotFoundException {
        return jornadaTrabalhoService.updateById(id, jornadaTrabalhoDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws JornadaTrabalhoNotFoundException {
        jornadaTrabalhoService.delete(id);
    }
}
