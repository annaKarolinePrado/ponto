package org.ponto.services;

import org.ponto.DTO.PontoDTO;
import org.ponto.models.Funcionario;
import org.ponto.models.Ponto;
import org.ponto.repositories.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PontoService {
    @Autowired
    private PontoRepository pontoRepository;
    @Autowired
    private FuncionarioService funcionarioService;

    public List<Ponto> buscarTodosPontos() {
        return pontoRepository.findAll();
    }

    public Ponto criarPonto(PontoDTO pontoDTO){
        Ponto ponto = new Ponto();

        ponto.setBancoDeHoras(calcularSaldo());
        ponto.setDataCriacaoPonto(LocalDateTime.now());
        ponto.setDataPonto(pontoDTO.getDataPonto());
        ponto.setMinutoPonto(pontoDTO.getMinutoPonto());
        Funcionario funcionario = funcionarioService.getFuncionarioById(pontoDTO.getFuncionario().getId());
        ponto.setFuncionario(funcionario);
        ponto.setTipoAcaoPonto(pontoDTO.getTipoAcaoPonto());
        ponto.setDiaSemanaPonto(pontoDTO.getDiaSemanaPonto());
        pontoRepository.save(ponto);
        return ponto;
    }

    public List<Ponto> getPontosDoDiaAtual(){
        LocalDate dataAtual = LocalDate.now();
        List<Ponto> pontosDoDia = pontoRepository.findAllByDataPonto(dataAtual);
        return  pontosDoDia;
    }

    public void excluirPonto(Long id) {
        pontoRepository.deleteById(id);
    }

    private Long calcularSaldo(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataBase = dataAtual.minusDays(1);
        Ponto ultimoPontoComSaldo = pontoRepository.findTop1ByDataPontoBeforeAndBancoDeHorasGreaterThanOrderByIdDesc(dataBase, 0l);

        return ultimoPontoComSaldo.getBancoDeHoras();
    }
}
