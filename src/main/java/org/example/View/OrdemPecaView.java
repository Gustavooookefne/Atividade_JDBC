package org.example.View;

import org.example.Dao.PecaDao;
import org.example.Model.OrdemPeca;
import org.example.Model.Peca;
import org.example.Service.OrdemPecaService;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;

public class OrdemPecaView {
    private final Scanner sc;
    private final OrdemPecaService ordemPecaService;
    private final PecaDao pecaDao;

    public OrdemPecaView(Scanner sc, OrdemPecaService ordemPecaService, PecaDao pecaDao) {
        this.sc = sc;
        this.ordemPecaService = ordemPecaService;
        this.pecaDao = pecaDao;
    }

    public void OrdemPeca(){
        try {
            System.out.println("----------- Ordem Peça -----------");

            Peca pecaSelecionada = selecionarPeca();
            if(pecaSelecionada == null){
                System.out.println("Criação de ordem peça cancelada.");
                return;
            }

            OrdemPeca novaOrdem = OrdemPecaService.criarOrdem(pecaSelecionada);

            System.out.println("\n ------------------------------------------");
            System.out.println("Ordem de Peça criada com sucesso!");
            System.out.println(novaOrdem.getDetalhesConfirmacao());
            System.out.println("\n ------------------------------------------");

        }catch (Exception e){
            System.out.println("");
        }
    }

    private Peca selecionarPeca(){
        List<Peca> pecaList = pecaDao.buscarTodasPecas();

        if(pecaList.isEmpty()){
            System.out.println("A aordem Peças esta em Em_Andamento");
            return null;
        }
        System.out.println("\n ---- Peças Disponiveis -----");
        for(Peca p : pecaList){
            System.out.println("ID: "+ p.getId() + " - " + p.getNome());
        }
        System.out.println("-------------------------------");

        Peca pecaSelecionada = null;
        while (pecaSelecionada == null){
            System.out.println("Digite o ID da Peça: ");
            if(!sc.hasNextInt()){
                System.out.println("ID invalido. Por favor, Digite um numero");
                sc.nextLine();
                continue;
            }
            int idPeca = sc.nextInt();
            sc.nextLine();

            for (Peca p : pecaList){
                if(p.getId() == idPeca){
                    pecaSelecionada = p;
                    break;
                }
            }
            if (pecaSelecionada == null){
                System.out.println("ID " + idPeca + "Invalido. Tente novamente");
            }
        }
        return pecaSelecionada;

    }


}
