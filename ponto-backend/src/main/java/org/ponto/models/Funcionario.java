package org.ponto.models;

import org.ponto.DTO.CargoDTO;
import org.ponto.DTO.DepartamentoDTO;
import org.ponto.DTO.EmpresaDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "funcionarios")
public class Funcionario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int usuarioId;
    private Double salario;
    private LocalDate dataNascimento;
    private String cpf;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String email;
    //private Cargo cargo;
    //private Departamento departamento;
    private LocalDate data_adimissao;
    //private Empresa empresa;


    public Funcionario() {
    }
    public Funcionario(Long id, String nome, int usuarioId) {
        this.id = id;
        this.nome = nome;
        this.usuarioId = usuarioId;
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

    public int getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + ", usuarioId=" + usuarioId + "]";
    }
}
