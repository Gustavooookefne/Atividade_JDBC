package org.example.Enum;

public enum StatusOrdemManutencao {

    EXECUTADA,
    CANCELADA;

    public enum StatusMaquina {
        PENDENTE,
        OPERACIONAL,
        EM_MANUTENCAO
    }
}
