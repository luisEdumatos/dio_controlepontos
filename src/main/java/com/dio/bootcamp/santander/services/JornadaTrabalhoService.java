package com.dio.bootcamp.santander.services;

import com.dio.bootcamp.santander.dtos.mappers.JornadaTrabalhoMapper;
import com.dio.bootcamp.santander.dtos.requests.JornadaTrabalhoDTO;
import com.dio.bootcamp.santander.dtos.response.MessageResponseDTO;
import com.dio.bootcamp.santander.entities.JornadaTrabalho;
import com.dio.bootcamp.santander.exceptions.JornadaTrabalhoNotFoundException;
import com.dio.bootcamp.santander.repository.JornadaTrabalhoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class JornadaTrabalhoService {

    private JornadaTrabalhoRepository jornadaTrabalhoRepository;
    private final JornadaTrabalhoMapper jornadaTrabalhoMapper = JornadaTrabalhoMapper.INSTANCE;


    public MessageResponseDTO createJornadaTrabalho(JornadaTrabalhoDTO jornadaTrabalhoDTO) {
        JornadaTrabalho jornadaTrabalhoToSave = jornadaTrabalhoMapper.toModel(jornadaTrabalhoDTO);
        JornadaTrabalho savedJornadaTrabalho = jornadaTrabalhoRepository.save(jornadaTrabalhoToSave);
        return createMessageResponse(savedJornadaTrabalho.getId(), "Jornada de trabalho criada com sucesso. ID: ");
    }

    public List<JornadaTrabalhoDTO> listAll() {
        List<JornadaTrabalho> listaJornadas = jornadaTrabalhoRepository.findAll();
        return listaJornadas.stream()
                .map(jornadaTrabalhoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public JornadaTrabalhoDTO findById(Long id) throws JornadaTrabalhoNotFoundException {
        JornadaTrabalho jornadaTrabalho = verifyExists(id);
        return jornadaTrabalhoMapper.toDTO(jornadaTrabalho);
    }

    public MessageResponseDTO updateById(Long id, JornadaTrabalhoDTO jornadaTrabalhoDTO) throws JornadaTrabalhoNotFoundException {
        verifyExists(id);
        jornadaTrabalhoDTO.setId(id); //Evitar passagem de ID pelo corpo do JSON
        JornadaTrabalho jornadaTrabalhoToUpdate = jornadaTrabalhoMapper.toModel(jornadaTrabalhoDTO);
        JornadaTrabalho updatedJornada = jornadaTrabalhoRepository.save(jornadaTrabalhoToUpdate);
        return createMessageResponse(updatedJornada.getId(), "Jornada atualizada. ID: ");
    }

    public void delete(Long id) throws JornadaTrabalhoNotFoundException {
        verifyExists(id);
        jornadaTrabalhoRepository.deleteById(id);
    }

    private JornadaTrabalho verifyExists(Long id) throws JornadaTrabalhoNotFoundException {
        Optional<JornadaTrabalho> optionalJornadaTrabalho = jornadaTrabalhoRepository.findById(id);
        if (optionalJornadaTrabalho.isEmpty()) {
            throw new JornadaTrabalhoNotFoundException(id);
        }
        return optionalJornadaTrabalho.get();
    }

    private MessageResponseDTO createMessageResponse(Long id, String msg) {
        return MessageResponseDTO
                .builder()
                .message(msg + id)
                .build();
    }

}
