package org.ponto.models;

import org.ponto.converters.DiaSemanaConverter;
import org.ponto.converters.PontoConverter;
import org.ponto.enums.DiaSemana;
import org.ponto.enums.TipoAcaoPonto;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Timer;

@Entity
@Table(name = "pontos")
public class Ponto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="banco_horas")
    private Long bancoDeHoras;
    private LocalDateTime dataCriacaoPonto;
    private LocalDate dataPonto;
    @ManyToOne
    private Funcionario funcionario;
    private LocalTime minutoPonto;
    @Convert(converter = PontoConverter.class)
    private TipoAcaoPonto tipoAcaoPonto;
    @Convert(converter = DiaSemanaConverter.class)
    private DiaSemana diaSemanaPonto;

    public Ponto() {
    }

    public Ponto(Long id, Long bancoDeHoras, LocalDateTime dataCriacaoPonto, LocalDate dataPonto, Funcionario funcionario,
                 LocalTime minutoPonto, TipoAcaoPonto tipoAcaoPonto, DiaSemana diaSemana) {

        this.id = id;
        this.bancoDeHoras = bancoDeHoras;
        this.dataCriacaoPonto = dataCriacaoPonto;
        this.dataPonto = dataPonto;
        this.funcionario = funcionario;
        this.minutoPonto = minutoPonto;
        this.tipoAcaoPonto = tipoAcaoPonto;
        this.diaSemanaPonto = diaSemana;
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

    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
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

    public DiaSemana getDiaSemanaPonto() {
        return diaSemanaPonto;
    }
    public void setDiaSemanaPonto(DiaSemana diaSemanaPonto) {
        this.diaSemanaPonto = diaSemanaPonto;
    }

    @Override
    public String toString() {
        return "Ponto{" +
                "id=" + id +
                ", bancoDeHoras=" + bancoDeHoras +
                ", dataCriacaoPonto=" + dataCriacaoPonto +
                ", dataPonto=" + dataPonto +
                ", funcionario=" + funcionario +
                ", minutoPonto=" + minutoPonto +
                ", tipoAcaoPonto=" + tipoAcaoPonto +
                '}';
    }
}

