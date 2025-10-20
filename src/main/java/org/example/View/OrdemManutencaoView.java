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
        try{
            System.out.println("----------- Criar Ordem Manuteção -----------");

            System.out.println("Coloque o id da maquina Solicitada: ");
            int idMaquina = sc.nextInt();



            System.out.println("Coloque o id Tecnico para fazer a manutenção da maquina: ");
            int idTecnico = sc.nextInt();


        }catch (Exception e){
            System.out.println("Erro ao Criar ordem de manutenção!!");
        }
    }
}
