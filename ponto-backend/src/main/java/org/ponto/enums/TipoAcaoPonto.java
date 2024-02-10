package org.ponto.enums;

public enum TipoAcaoPonto {
    AMAMENTACAO("Amamentação"),
    AUSENCIAS_LEGAIS("Ausências Legais"),
    ENTRADA_SAIDA("Entrada / Saída"),
    MEDICO("Médico"),
    PONTO_ESTAGIARIO_JOVEM("Ponto Estagiário / Jovem"),
    SAIDA_RETORNO_PARTICULAR("Saída / Retorno Particular"),
    SERVICO("Serviço"),
    CANCELAR("Cancelar");


    private final String descricao;

    TipoAcaoPonto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
