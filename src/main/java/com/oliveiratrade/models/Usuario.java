package com.oliveiratrade.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@AllArgsConstructor
@Setter
@Getter
public class Usuario {

    private Long id;

    @NotNull
    @Size(max = 30)
    private String nome;

    @NotNull
    @Size(max = 70)
    private String nomeCompleto;

    @NotNull
    @Size(min = 11, max = 11)
    private String cpf;

    @NotNull
    @Size(max = 9)
    private String rg;

    private EnderecoResidencial enderecoResidencial;

    private DadosLogin dadosLogin;

}
