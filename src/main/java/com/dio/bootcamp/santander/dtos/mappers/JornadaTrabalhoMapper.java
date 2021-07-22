package com.dio.bootcamp.santander.dtos.mappers;

import com.dio.bootcamp.santander.dtos.requests.JornadaTrabalhoDTO;
import com.dio.bootcamp.santander.entities.JornadaTrabalho;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface JornadaTrabalhoMapper {

    JornadaTrabalhoMapper INSTANCE = Mappers.getMapper(JornadaTrabalhoMapper.class);

    JornadaTrabalho toModel(JornadaTrabalhoDTO jornadaTrabalhoDTO);

    JornadaTrabalhoDTO toDTO(JornadaTrabalho jornadaTrabalho);
}
