package org.example.Service;

import org.example.Dao.PecaDao;
import org.example.Model.Peca;

import java.sql.SQLException;

public class PecaService {
    private final PecaDao pecaDao = new PecaDao();

    public void CadastrarPeca(Peca peca){
        try{
            PecaDao.inserirPeca(peca);
        }catch (SQLException e){
            System.out.println("Falha ao cadastrar Peca!!");
            e.printStackTrace();
        }
    }

}
