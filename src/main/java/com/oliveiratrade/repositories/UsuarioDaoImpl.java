package com.oliveiratrade.repositories;


import com.oliveiratrade.models.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Repository
@AllArgsConstructor
public class UsuarioDaoImpl implements InterfaceDAO<Usuario> {

    private JdbcTemplate jdbcTemplate;

    @Override
    public Long inserir(Usuario usuario) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
                    PreparedStatement ps = connection
                            .prepareStatement("INSERT INTO usuario(nome, nome_completo, cpf, rg) VALUES(?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

                    ps.setString(1, "keizo");
                    ps.setString(2, "keizo kobayashi");
                    ps.setString(3, "85231649785");
                    ps.setString(4, "852639745");

                    return ps;
                },
                keyHolder);

        System.out.println(keyHolder.getKey().longValue());
        return keyHolder.getKey().longValue();
    }

    @Override
    public Usuario buscar(Long id) {
        return null;
    }

    @Override
    public void alterar(Usuario usuario) {
        jdbcTemplate.update("INSERT INTO usuario(nome, nome_completo, cpf, rg) VALUES(?, ?, ?, ?)",
                "keizo",
                "keizo kobayashi",
                "39402850805",
                "495501086"
        );
    }

    @Override
    public void remover(Long id) {

    }

    @Override
    public List<Usuario> listar() {
        return null;
    }
}
