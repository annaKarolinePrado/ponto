package org.ponto.DTO;

public class FuncionarioDTO {

    private Long id;
    private String nome;
    private Integer usuarioId;
    public FuncionarioDTO() {
    }

    public FuncionarioDTO(Long id, String nome, Integer usuarioId) {
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

    public Integer getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
}
