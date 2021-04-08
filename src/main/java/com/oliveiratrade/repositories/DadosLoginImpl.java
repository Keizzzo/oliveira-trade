package com.oliveiratrade.repositories;

import com.oliveiratrade.models.DadosLogin;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class DadosLoginImpl implements  InterfaceDAOComIdExistente<DadosLogin> {

    private JdbcTemplate jdbcTemplate;

    @Override
    public void inserir(Long id, DadosLogin dadosLogin) {

        jdbcTemplate.update("insert into DADOS_LOGIN(ID_USUARIO, NICKNAME, EMAIL, PASSWORD) values (?, ?, ?, ?)",
                    id,
                    dadosLogin.getNickName(),
                    dadosLogin.getEmail(),
                    dadosLogin.getPassword()
                );

    }

    @Override
    public DadosLogin buscar(Long id) {
        return null;
    }

    @Override
    public void alterar(Long id, DadosLogin dadosLogin) {

    }

    @Override
    public void remover(Long id) {

    }

    @Override
    public List<DadosLogin> listar() {
        return null;
    }
}
