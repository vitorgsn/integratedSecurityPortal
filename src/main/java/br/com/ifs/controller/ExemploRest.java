package br.com.ifs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class ExemploRest {

    //Teste para o rest
    @GetMapping(value = "/olaMundo")
    public Object olaMudno() {
    	return "Olá Mundo";
    }
}
