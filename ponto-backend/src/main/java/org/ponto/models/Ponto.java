package org.ponto.models;

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
    private String diaSemanaPonto;
    @ManyToOne
    private Funcionario funcionario;
    private LocalTime minutoPonto;
    private TipoAcaoPonto tipoAcaoPonto;

    public Ponto() {
    }

    public Ponto(Long id, Long bancoDeHoras, LocalDateTime dataCriacaoPonto, LocalDate dataPonto, String diaSemanaPonto, Funcionario funcionario, LocalTime minutoPonto, TipoAcaoPonto tipoAcaoPonto) {
        this.id = id;
        this.bancoDeHoras = bancoDeHoras;
        this.dataCriacaoPonto = dataCriacaoPonto;
        this.dataPonto = dataPonto;
        this.diaSemanaPonto = diaSemanaPonto;
        this.funcionario = funcionario;
        this.minutoPonto = minutoPonto;
        this.tipoAcaoPonto = tipoAcaoPonto;
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

    public String getDiaSemanaPonto() {
        return diaSemanaPonto;
    }
    public void setDiaSemanaPonto(String diaSemanaPonto) {
        this.diaSemanaPonto = diaSemanaPonto;
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

    @Override
    public String toString() {
        return "Ponto{" +
                "id=" + id +
                ", bancoDeHoras=" + bancoDeHoras +
                ", dataCriacaoPonto=" + dataCriacaoPonto +
                ", dataPonto=" + dataPonto +
                ", diaSemanaPonto='" + diaSemanaPonto + '\'' +
                ", funcionario=" + funcionario +
                ", minutoPonto=" + minutoPonto +
                ", tipoAcaoPonto=" + tipoAcaoPonto +
                '}';
    }
}

