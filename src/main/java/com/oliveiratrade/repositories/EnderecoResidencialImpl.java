package com.oliveiratrade.repositories;

import com.oliveiratrade.models.EnderecoResidencial;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class EnderecoResidencialImpl implements InterfaceDAO<EnderecoResidencial> {

    private JdbcTemplate jdbcTemplate;

    @Override
    public Long inserir(EnderecoResidencial enderecoResidencial) {

        jdbcTemplate.update("insert into endereco_residencial(id_usuario, logradouro, numero, complemento, bairro, cidade, uf, cep) values (?, ?, ?, ?, ?, ?, ?, ?)",
                    enderecoResidencial.getIdUsuario(),
                    enderecoResidencial.getLogradouro(),
                    enderecoResidencial.getNumero(),
                    enderecoResidencial.getComplemento(),
                    enderecoResidencial.getBairro(),
                    enderecoResidencial.getCidade(),
                    enderecoResidencial.getUf(),
                    enderecoResidencial.getCep()
                );

        //REFATORAR
        return enderecoResidencial.getIdUsuario();
    }

    @Override
    public EnderecoResidencial buscar(Long id) {
        return null;
    }

    @Override
    public void alterar(EnderecoResidencial objeto) {

    }

    @Override
    public void remover(Long id) {

    }

    @Override
    public List<EnderecoResidencial> listar() {
        return null;
    }
}
