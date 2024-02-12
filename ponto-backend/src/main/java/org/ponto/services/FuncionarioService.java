package org.ponto.services;

import org.ponto.DTO.FuncionarioDTO;
import org.ponto.models.Funcionario;
import org.ponto.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> buscarTodosFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Optional<Funcionario> buscarFuncionarioPorId(Long id) {
        return funcionarioRepository.findById(id);
    }

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

    public Funcionario getFuncionarioById(Long funcionarioId) {
        Funcionario funcionario = funcionarioRepository.findById(funcionarioId).get();
        return funcionario;
    }

    public void excluirFuncionario(Long id) {
        funcionarioRepository.deleteById(id);
    }

    public List<Funcionario> buscarFuncionariosPorNome(String nome) {
        return funcionarioRepository.findByNome(nome);
    }
}