package org.ponto.DTO;

import java.time.LocalDate;

public class FuncionarioDTO {

    private Long id;
    private String nome;
    private Integer usuarioId;
    private Double salario;
    private LocalDate dataNascimento;
    private String cpf;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String email;
    private CargoDTO cargo;
    private DepartamentoDTO departamento;
    private LocalDate data_adimissao;
    private EmpresaDTO empresa;


    public FuncionarioDTO() {
    }

    public FuncionarioDTO(Long id, String nome, Integer usuarioId, Double salario, LocalDate dataNascimento, String cpf,
                          String endereco, String cidade, String estado, String cep, String telefone, String email,
                          CargoDTO cargo, DepartamentoDTO departamento, LocalDate data_adimissao, EmpresaDTO empresa) {
        this.id = id;
        this.nome = nome;
        this.usuarioId = usuarioId;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.cargo = cargo;
        this.departamento = departamento;
        this.data_adimissao = data_adimissao;
        this.empresa = empresa;
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

    public Integer getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public CargoDTO getCargo() {
        return cargo;
    }
    public void setCargo(CargoDTO cargo) {
        this.cargo = cargo;
    }

    public DepartamentoDTO getDepartamento() {
        return departamento;
    }
    public void setDepartamento(DepartamentoDTO departamento) {
        this.departamento = departamento;
    }

    public LocalDate getData_adimissao() {
        return data_adimissao;
    }
    public void setData_adimissao(LocalDate data_adimissao) {
        this.data_adimissao = data_adimissao;
    }

    public EmpresaDTO getEmpresa() {
        return empresa;
    }
    public void setEmpresa(EmpresaDTO empresa) {
        this.empresa = empresa;
    }
}
