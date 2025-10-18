package org.example.Service;

import org.example.Dao.MaquinaDAO;
import org.example.Dao.OrdemManutencaoDao;
import org.example.Model.OrdemManutencao;

public class OrdemManutencaoService {
    private final OrdemManutencaoDao ordemDao = new OrdemManutencaoDao();
    private final MaquinaDAO maquinaDAO = new MaquinaDAO();

    public void OrdemManutencao (OrdemManutencao ordemManutencao){
        this.ordemDao = new OrdemManutencaoDao();
        this.maquinaDAO = new MaquinaDAO();

    }

}
