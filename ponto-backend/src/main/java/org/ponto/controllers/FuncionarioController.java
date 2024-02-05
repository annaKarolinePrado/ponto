package org.ponto.controllers;

import org.ponto.DTO.FuncionarioDTO;
import org.ponto.models.Funcionario;
import org.ponto.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ponto/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;
    @GetMapping()
    public FuncionarioDTO getFuncionario() {
        // Chama o método getFuncionario da classe FuncionarioService
        return funcionarioService.getFuncionario();
    }

    @PostMapping()
    public ResponseEntity<Funcionario> criarFuncionario(@RequestBody FuncionarioDTO funcionarioDTO) {

        return new ResponseEntity<>(funcionarioService.criarFuncionario(funcionarioDTO), HttpStatus.CREATED);
    }
}
