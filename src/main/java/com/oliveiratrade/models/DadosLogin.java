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
public class DadosLogin {

    @NotNull
    @Size(min = 6, max = 20)
    private String nickName;

    @NotNull
    @Size(max = 30)
    private String email;

    @NotNull
    @Size(min = 8, max = 20)
    private String password;



}
