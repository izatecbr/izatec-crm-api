package com.izatec.crm.api;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
@Entity
@Table(name = "tab_cliente")
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer id;
    @Column(name = "nome_completo")
    private String nome;
    @Column(name = "dt_aniversario")
    private LocalDate aniversario;
    @Column(name = "renda_media")
    private Double renda;
    @Column(name = "nome_cidade")
    private String cidade;
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", aniversario=" + aniversario +
                ", renda=" + renda +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}

