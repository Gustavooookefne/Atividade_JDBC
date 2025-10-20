package org.example.Enum;

public enum StatusOperacional {

    OPERACIONAL,
    EM_ANDAMENTO;

    public enum StatusMaquina {
        PENDENTE,
        OPERACIONAL,
        EM_MANUTENCAO
    }

}

