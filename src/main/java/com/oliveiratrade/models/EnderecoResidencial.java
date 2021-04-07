package com.oliveiratrade.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class EnderecoResidencial {

    @NotNull
    private Long idUsuario;

    @NotNull
    @Size(max = 40)
    private String logradouro;

    @NotNull
    @Size(max = 10)
    private String numero;

    @NotNull
    @Size(max = 20)
    private String complemento;

    @NotNull
    @Size(max = 40)
    private String bairro;

    @NotNull
    @Size(max = 40)
    private String cidade;

    @NotNull
    @Size(min = 2,max = 2)
    private String uf;

    @NotNull
    @Size(min = 11, max = 11)
    private String cep;

}
