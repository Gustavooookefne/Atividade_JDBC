package org.example.Service;

import org.example.Dao.TecnicoDao;
import org.example.Model.Tecnico;

import java.sql.SQLException;

public class TecnicoService {

    private final TecnicoDao tecnicoDao = new TecnicoDao();

    public void CadastrarTecnico(Tecnico tecnico){
        try{
            TecnicoDao.inserirTecnico(tecnico);
        }catch (SQLException e){
            System.out.println("Falha ao Cadastrar!!");
            e.printStackTrace();
        }
    }


}
