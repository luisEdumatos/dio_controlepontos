package com.dio.bootcamp.santander.entities;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Audited
public class BancoHoras {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Data
    @Embeddable
    public  class BancoHorasId implements Serializable {
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;
    }

    @EmbeddedId
    private BancoHorasId bancoHorasId;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}
