package org.ponto.services;

import org.ponto.DTO.FuncionarioDTO;
import org.ponto.models.Funcionario;
import org.ponto.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario criarFuncionario(FuncionarioDTO funcionarioDTO){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(funcionarioDTO.getNome());
        funcionario.setUsuarioId(funcionarioDTO.getUsuarioId());
        funcionarioRepository.save(funcionario);
        return funcionario;
    }

    public Funcionario alterarFuncionario(FuncionarioDTO funcionarioDTO) throws Exception {
        Funcionario funcionarioAntigo = getFuncionarioById(funcionarioDTO.getId());
        funcionarioAntigo.setNome(funcionarioDTO.getNome());
        funcionarioAntigo.setUsuarioId(funcionarioDTO.getUsuarioId());
        funcionarioRepository.save(funcionarioAntigo);
        return funcionarioAntigo;
    }

    public Funcionario getFuncionarioById(Long funcionarioId) throws Exception {
        Funcionario funcionario = funcionarioRepository.findById(funcionarioId).get();
        if(funcionario == null) {
            throw new Exception("Funcionario não encontrado.");
        }
        return funcionario;
    }

}