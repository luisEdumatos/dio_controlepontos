package com.dio.bootcamp.santander.dtos.requests;

import com.dio.bootcamp.santander.entities.CategoriaUsuario;
import com.dio.bootcamp.santander.entities.Empresa;
import com.dio.bootcamp.santander.entities.JornadaTrabalho;
import com.dio.bootcamp.santander.entities.NivelAcesso;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class UsuarioDTO {
    private Long id;
    private String nome;
    private CategoriaUsuario categoriaUsuario;
    private Empresa empresa;
    private NivelAcesso nivelAcesso;
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;
}
