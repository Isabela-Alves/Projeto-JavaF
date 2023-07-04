package org.exemplo.persistencia.database.enumerator;

public enum TipoConta {
    POUPANCA("Poupan�a"),
    CORRENTE("Corrente");

    private final String descricao;

    private TipoConta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
