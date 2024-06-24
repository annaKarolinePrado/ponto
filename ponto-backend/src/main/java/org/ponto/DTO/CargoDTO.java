package org.ponto.DTO;

import java.math.BigDecimal;

public class CargoDTO {
    private Long id;
    private String nome;
    private String descricao;
    private String nivel;
    private String departamento;
    private BigDecimal salario_base;

    public CargoDTO() {
    }

    public CargoDTO(Long id, String nome, String descricao, String nivel, String departamento, BigDecimal salario_base) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.nivel = nivel;
        this.departamento = departamento;
        this.salario_base = salario_base;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public BigDecimal getSalario_base() {
        return salario_base;
    }
    public void setSalario_base(BigDecimal salario_base) {
        this.salario_base = salario_base;
    }
}
