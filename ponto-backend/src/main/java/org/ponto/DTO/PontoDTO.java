package org.ponto.DTO;

import org.ponto.enums.TipoAcaoPonto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PontoDTO {
    private Long id;
    private Long bancoDeHoras;
    private LocalDateTime dataCriacaoPonto;
    private LocalDate dataPonto;
    private FuncionarioDTO funcionario;
    private LocalTime minutoPonto;
    private TipoAcaoPonto tipoAcaoPonto;
    private String diaSemanaPonto;

    public PontoDTO() {
    }

    public PontoDTO(Long id, Long bancoDeHoras, LocalDateTime dataCriacaoPonto, LocalDate dataPonto, FuncionarioDTO funcionario,
                    LocalTime minutoPonto, TipoAcaoPonto tipoAcaoPonto, String diaSemanaPonto) {
        this.id = id;
        this.bancoDeHoras = bancoDeHoras;
        this.dataCriacaoPonto = dataCriacaoPonto;
        this.dataPonto = dataPonto;
        this.funcionario = funcionario;
        this.minutoPonto = minutoPonto;
        this.tipoAcaoPonto = tipoAcaoPonto;
        this.diaSemanaPonto = diaSemanaPonto;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getBancoDeHoras() {
        return bancoDeHoras;
    }
    public void setBancoDeHoras(Long bancoDeHoras) {
        this.bancoDeHoras = bancoDeHoras;
    }

    public LocalDateTime getDataCriacaoPonto() {
        return dataCriacaoPonto;
    }
    public void setDataCriacaoPonto(LocalDateTime dataCriacaoPonto) {
        this.dataCriacaoPonto = dataCriacaoPonto;
    }

    public LocalDate getDataPonto() {
        return dataPonto;
    }
    public void setDataPonto(LocalDate dataPonto) {
        this.dataPonto = dataPonto;
    }

    public FuncionarioDTO getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(FuncionarioDTO funcionario) {
        this.funcionario = funcionario;
    }

    public LocalTime getMinutoPonto() {
        return minutoPonto;
    }
    public void setMinutoPonto(LocalTime minutoPonto) {
        this.minutoPonto = minutoPonto;
    }

    public TipoAcaoPonto getTipoAcaoPonto() {
        return tipoAcaoPonto;
    }
    public void setTipoAcaoPonto(TipoAcaoPonto tipoAcaoPonto) {
        this.tipoAcaoPonto = tipoAcaoPonto;
    }

    public String getDiaSemanaPonto() {
        return diaSemanaPonto;
    }
    public void setDiaSemanaPonto(String diaSemanaPonto) {
        this.diaSemanaPonto = diaSemanaPonto;
    }
}

