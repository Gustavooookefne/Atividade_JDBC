package org.example.Service;

import org.example.Dao.MaquinaDAO;
import org.example.Model.Maquina;

import java.sql.SQLException;

public class MaquinaService {

    private final MaquinaDAO maquinaDAO = new MaquinaDAO();

    public void CadastrarMaquina(Maquina maquina){
        try {
            MaquinaDAO.inserirMaquina(maquina);
        }catch (SQLException e){
            System.out.println("Falha ao cadastrar Maquina!!");
            e.printStackTrace();
        }
    }


}
