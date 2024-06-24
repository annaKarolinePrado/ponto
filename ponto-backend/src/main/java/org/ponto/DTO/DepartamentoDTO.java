package org.ponto.DTO;

import com.sun.org.apache.xpath.internal.operations.String;
import org.ponto.models.Funcionario;

public class DepartamentoDTO {
    private Long id;
    private String nome;
    private String descricao;
    private FuncionarioDTO gerente;
    private String localizacao;

    public DepartamentoDTO() {
    }

    public DepartamentoDTO(Long id, String nome, String descricao, FuncionarioDTO gerente, String localizacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.gerente = gerente;
        this.localizacao = localizacao;
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

    public FuncionarioDTO getGerente() {
        return gerente;
    }
    public void setGerente(FuncionarioDTO gerente) {
        this.gerente = gerente;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
