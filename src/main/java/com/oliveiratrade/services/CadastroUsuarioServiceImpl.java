package com.oliveiratrade.services;

import com.oliveiratrade.models.DadosLogin;
import com.oliveiratrade.models.EnderecoResidencial;
import com.oliveiratrade.models.Usuario;
import com.oliveiratrade.repositories.InterfaceDAO;
import com.oliveiratrade.repositories.UsuarioDaoImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CadastroUsuarioServiceImpl implements CadastroUsuarioService {

    @Autowired
    private InterfaceDAO<Usuario> usuarioInterfaceDAO;

    @Override
    public void criarCadastro(Usuario usuario) {

        usuarioInterfaceDAO.inserir(usuario);

    }
}
