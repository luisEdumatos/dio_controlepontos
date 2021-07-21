package com.dio.bootcamp.santander.entities;

import lombok.*;

import javax.persistence.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Localidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
