package org.ponto.controllers;

import org.ponto.DTO.FuncionarioDTO;
import org.ponto.DTO.PontoDTO;
import org.ponto.models.Funcionario;
import org.ponto.models.Ponto;
import org.ponto.repositories.PontoRepository;
import org.ponto.services.FuncionarioService;
import org.ponto.services.PontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/ponto/pontos")
public class PontoController {

    @Autowired
    private PontoService pontoService;

    @GetMapping()
    public List<Ponto> buscarTodosFuncionarios() {
        return pontoService.buscarTodosPontos();
    }
    @PostMapping()
    public ResponseEntity<Ponto> criarPonto(@RequestBody PontoDTO pontoDTO) {
        return new ResponseEntity<>(pontoService.criarPonto(pontoDTO), HttpStatus.OK);
    }

    @Autowired
    private PontoRepository pontoRepository;

    @GetMapping("/dia-atual")
    public ResponseEntity<List<Ponto>> getPontosDoDiaAtual() {
        List<Ponto> pontosDoDia = pontoService.getPontosDoDiaAtual();
        return new ResponseEntity<>(pontosDoDia, HttpStatus.OK);
    }

    @DeleteMapping()
    public void excluirPonto(@RequestBody PontoDTO pontoDTO) {
        pontoService.excluirPonto(pontoDTO.getId());
    }
}