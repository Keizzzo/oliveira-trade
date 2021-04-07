package com.oliveiratrade.controllers;

import com.oliveiratrade.models.Usuario;
import com.oliveiratrade.services.CadastroUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

@RestController
public class CadastroController {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();

    @Autowired
    CadastroUsuarioService cadastroUsuarioService;

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    @RequestMapping(value = "/novo-cadastro", method = RequestMethod.POST)
    public void cadastrarNovoCliente(@RequestBody Usuario usuario) {

        if (validator.validate(usuario).size() != 0) {
            throw new RuntimeException("Erro na Validação de Parâmetro Usuário.");
        }

        System.out.println(usuario.getEnderecoResidencial().getNumero());
        System.out.println(usuario.getDadosLogin().getNickName());

        cadastroUsuarioService.criarCadastro(usuario);

    }

}
