package com.oliveiratrade.controllers;

import com.oliveiratrade.models.Usuario;
import com.oliveiratrade.services.CadastroUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/novo-cadastro", method = RequestMethod.POST)
    public void cadastrarNovoCliente(@RequestBody Usuario usuario) {

        System.out.println(usuario.getNome());

        if (validator.validate(usuario).size() != 0) {
            throw new RuntimeException("Erro na Validação de Parâmetro Usuário.");
        }

        cadastroUsuarioService.criarCadastro(usuario);

    }

}
