package org.ponto.controllers;

import org.ponto.DTO.FuncionarioDTO;
import org.ponto.models.Funcionario;
import org.ponto.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ponto/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;
    @GetMapping()
    public List<Funcionario> buscarTodosFuncionarios() {
        return funcionarioService.buscarTodosFuncionarios();
    }
    @GetMapping("/{id}")
    public Optional<Funcionario> buscarFuncionarioPorId(@PathVariable Long id) {
        return funcionarioService.buscarFuncionarioPorId(id);
    }

    @PostMapping()
    public ResponseEntity<Funcionario> criarFuncionario(@RequestBody FuncionarioDTO funcionarioDTO) {
        return new ResponseEntity<>(funcionarioService.criarFuncionario(funcionarioDTO), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Funcionario> alterarFuncionario(@RequestBody FuncionarioDTO funcionarioDTO) throws Exception {
        return new ResponseEntity<>(funcionarioService.alterarFuncionario(funcionarioDTO), HttpStatus.CREATED);
    }
    @DeleteMapping()
    public void excluirFuncionario(@RequestBody FuncionarioDTO funcionarioDTO) {
        funcionarioService.excluirFuncionario(funcionarioDTO.getId());
    }
}
