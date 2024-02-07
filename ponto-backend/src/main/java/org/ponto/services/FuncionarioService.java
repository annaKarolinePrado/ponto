package org.ponto.services;

import org.ponto.DTO.FuncionarioDTO;
import org.ponto.models.Funcionario;
import org.ponto.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// FuncionarioService.java
@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    public FuncionarioDTO getFuncionario() {
        FuncionarioDTO funcionario = new FuncionarioDTO(1, "dois",1);
        return funcionario;
    }

    public Funcionario criarFuncionario(FuncionarioDTO funcionarioDTO){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(funcionarioDTO.getNome());
        funcionario.setUsuarioId(funcionarioDTO.getUsuarioId());
        funcionarioRepository.save(funcionario);
        return funcionario;
    }

    public Funcionario alterarFuncionario(FuncionarioDTO funcionarioDTO){
        Funcionario funcionario = new Funcionario();
        funcionario.setId(funcionarioDTO.getId());
        funcionario.setNome(funcionarioDTO.getNome());
        funcionario.setUsuarioId(funcionarioDTO.getUsuarioId());
        return funcionario;
    }

}