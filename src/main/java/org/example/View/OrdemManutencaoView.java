package org.example.View;

import org.example.Dao.MaquinaDAO;
import org.example.Dao.PecaDao;
import org.example.Dao.TecnicoDao;
import org.example.Model.OrdemManutencao;
import org.example.Service.OrdemManutencaoService;

import java.util.Scanner;

public class OrdemManutencaoView {

    private final Scanner sc;
    private OrdemManutencaoService ordemManutencaoService;

    private final MaquinaDAO maquinaDAO;
    private final TecnicoDao tecnicoDao;
    private final PecaDao pecaDao;

    public OrdemManutencaoView(Scanner sc, MaquinaDAO maquinaDAO, TecnicoDao tecnicoDao, PecaDao pecaDao) {
        this.sc = sc;
        this.maquinaDAO = maquinaDAO;
        this.tecnicoDao = tecnicoDao;
        this.pecaDao = pecaDao;
    }

    public void CriarOrdemManutencao() {
        System.out.println("----------- Criar Ordem Manuteção -----------");

    }
}
