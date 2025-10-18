package org.example.Service;

import org.example.Dao.MaquinaDAO;
import org.example.Dao.OrdemManutencaoDao;
import org.example.Model.OrdemManutencao;

public class OrdemManutencaoService {
    private OrdemManutencaoDao ordemDao = new OrdemManutencaoDao();
    private MaquinaDAO maquinaDAO = new MaquinaDAO();

    public OrdemManutencaoService(){
        this.ordemDao = new OrdemManutencaoDao();
        this.maquinaDAO = new MaquinaDAO();

    }

}
