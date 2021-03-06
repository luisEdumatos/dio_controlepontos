package com.dio.bootcamp.santander.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Audited
public class Calendario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;

}
