package com.dio.bootcamp.santander.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JornadaTrabalhoDTO {

    private Long id;

    @NotEmpty
    @Size(min = 5, max = 50)
    private String descricao;
}
