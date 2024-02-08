package org.ponto.DTO;

public class FuncionarioDTO {

    private Long id;
    private String nome;
    private Integer usuarioId;
    // Construtor vazio (pode ser omitido se não for necessário)
    public FuncionarioDTO() {
    }

    // Construtor com parâmetros
    public FuncionarioDTO(Long id, String nome, Integer usuarioId) {
        this.id = id;
        this.nome = nome;
        this.usuarioId = usuarioId;
    }

    // Métodos getter e setter para id
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Métodos getter e setter para nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getter e setter para usuarioId
    public Integer getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
}
