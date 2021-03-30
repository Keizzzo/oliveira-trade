package com.oliveiratrade.controllers;

import com.oliveiratrade.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

@RestController
public class CadastroController {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        @RequestMapping("/novo-cadastro")
        public void cadastrarNovoCliente(Usuario usuario){

            if(validator.validate(usuario).size() != 0){
                throw new RuntimeException("Erro na Validação de Parâmetro Usuário.");
            }

        }

}
