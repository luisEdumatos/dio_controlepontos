package com.dio.bootcamp.santander.dtos.mappers;

import com.dio.bootcamp.santander.dtos.requests.JornadaTrabalhoDTO;
import com.dio.bootcamp.santander.entities.JornadaTrabalho;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-22T09:39:14-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.9 (Oracle Corporation)"
)
public class JornadaTrabalhoMapperImpl implements JornadaTrabalhoMapper {

    @Override
    public JornadaTrabalho toModel(JornadaTrabalhoDTO jornadaTrabalhoDTO) {
        if ( jornadaTrabalhoDTO == null ) {
            return null;
        }

        JornadaTrabalho jornadaTrabalho = new JornadaTrabalho();

        return jornadaTrabalho;
    }

    @Override
    public JornadaTrabalhoDTO toDTO(JornadaTrabalho jornadaTrabalho) {
        if ( jornadaTrabalho == null ) {
            return null;
        }

        JornadaTrabalhoDTO jornadaTrabalhoDTO = new JornadaTrabalhoDTO();

        return jornadaTrabalhoDTO;
    }
}
