package com.dio.bootcamp.santander.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JornadaTrabalhoDTO {

    private long id;

    @NotEmpty
    private String descricao;
}
