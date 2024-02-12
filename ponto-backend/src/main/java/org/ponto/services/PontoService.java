package org.ponto.services;

import org.ponto.DTO.FuncionarioDTO;
import org.ponto.DTO.PontoDTO;
import org.ponto.enums.DiaSemana;
import org.ponto.enums.TipoAcaoPonto;
import org.ponto.models.Funcionario;
import org.ponto.models.Ponto;
import org.ponto.repositories.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

        ponto.setBancoDeHoras(pontoDTO.getBancoDeHoras());
        ponto.setDataCriacaoPonto(pontoDTO.getDataCriacaoPonto());
        ponto.setDataPonto(pontoDTO.getDataPonto());
        ponto.setMinutoPonto(pontoDTO.getMinutoPonto());
        Funcionario funcionario = funcionarioService.getFuncionarioById(pontoDTO.getFuncionario().getId());
        ponto.setFuncionario(funcionario);
        ponto.setTipoAcaoPonto(pontoDTO.getTipoAcaoPonto());
        ponto.setDiaSemanaPonto(DiaSemana.valueOf(pontoDTO.getDiaSemanaPonto()));
        pontoRepository.save(ponto);
        return ponto;
    }

    public List<Ponto> getPontosDoDiaAtual(){
        LocalDate dataAtual = LocalDate.now();
        List<Ponto> pontosDoDia = pontoRepository.findAllByDataPonto(dataAtual);
        return  pontosDoDia;
    }
}
