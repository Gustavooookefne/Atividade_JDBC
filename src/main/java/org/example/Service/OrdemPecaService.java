package org.example.Service;

import org.example.Dao.OrdemPecaDao;
import org.example.Model.OrdemPeca;
import org.example.Model.Peca;

public class OrdemPecaService {
    private OrdemPecaDao pecaDao = new OrdemPecaDao();

    public OrdemPecaService() {
        this.pecaDao = new OrdemPecaDao();
    }

    public static OrdemPeca criarOrdem(Peca pecaSelecionada){
        return null;
    }
}
