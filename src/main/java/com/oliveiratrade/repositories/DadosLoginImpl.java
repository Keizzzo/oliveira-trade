package com.oliveiratrade.repositories;

import com.oliveiratrade.models.DadosLogin;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class DadosLoginImpl implements  InterfaceDAO<DadosLogin> {

    private JdbcTemplate jdbcTemplate;

    @Override
    public Long inserir(DadosLogin dadosLogin) {

        jdbcTemplate.update("insert into DADOS_LOGIN(ID_USUARIO, NICKNAME, EMAIL, PASSWORD) values (?, ?, ?, ?)",
                    dadosLogin.getIdUsuario(),
                    dadosLogin.getNickName(),
                    dadosLogin.getEmail(),
                    dadosLogin.getPassword()
                );

        //REFATORAR
        return dadosLogin.getIdUsuario();
    }

    @Override
    public DadosLogin buscar(Long id) {
        return null;
    }

    @Override
    public void alterar(DadosLogin dadosLogin) {

    }

    @Override
    public void remover(Long id) {

    }

    @Override
    public List<DadosLogin> listar() {
        return null;
    }
}
