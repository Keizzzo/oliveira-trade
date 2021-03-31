package com.oliveiratrade.repositories;


import com.oliveiratrade.models.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class UsuarioDaoImpl implements InterfaceDAO<Usuario> {

    private JdbcTemplate jdbcTemplate;

    @Override
    public void inserir(Usuario usuario) {

        //TESTE
        jdbcTemplate.update("INSERT INTO cadastro_cliente(nome, email) VALUES(?, ?)",
                    "keizo",
                    "keizo@gmail.com"
                );
    }

    @Override
    public Usuario buscar(Long id) {
        return null;
    }

    @Override
    public void alterar(Usuario usuario) {

    }

    @Override
    public void remover(Long id) {

    }

    @Override
    public List<Usuario> listar() {
        return null;
    }
}
