package com.oliveiratrade.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@AllArgsConstructor
@Setter
@Getter
public class Usuario {

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
    @Size(max = 8)
    private String rg;

}
