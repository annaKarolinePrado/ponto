package org.ponto.controllers;

import org.ponto.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ponto/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;
    // Injeção de dependência do FuncionarioService no construtor

    @GetMapping()
    public String getFuncionario() {
        // Chama o método getFuncionario da classe FuncionarioService
        return funcionarioService.getFuncionario();
    }
}
