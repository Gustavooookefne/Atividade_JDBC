package org.example.View;

import org.example.Model.OrdemPeca;
import org.example.Service.MaquinaService;
import org.example.Service.OrdemManutencaoService;
import org.example.Service.OrdemPecaService;
import org.example.Service.PecaService;
import org.example.Service.TecnicoService;

import java.util.Scanner;

public class menuView {
    Scanner sc = new Scanner(System.in);

    MaquinaService maquinaService = new MaquinaService();
    TecnicoService tecnicoService = new TecnicoService();
    PecaService pecaService = new PecaService();
    OrdemManutencaoService ordemManutencaoService = new OrdemManutencaoService();
    OrdemPecaService ordemPecaService = new OrdemPecaService();


    MaquinaView maquinaView = new MaquinaView(maquinaService);
    TecnicoView tecnicoView = new TecnicoView(tecnicoService);
    PecaView pecaView = new PecaView(pecaService);
    OrdemManutencaoView ordemManutencaoView = new OrdemManutencaoView(ordemManutencaoService);
    OrdemPecaView ordemPecaView = new OrdemPecaView(ordemPecaService);



    public void exibirMenu(){
        int opicao;


        do{
            System.out.println("\n\n ---------------------- Sistema Manutenção Industrial ----------------------");
            System.out.println("1 - Cadastrar Maquina");
            System.out.println("2 - Cadastrar Técinico");
            System.out.println("3 - Cadastrar Peça");
            System.out.println("4 - Criar Ordem de Manutenção");
            System.out.println("5 - Associar Peças á ordem");
            System.out.println("6 - Executar Manutenção\n");

            System.out.println("0 - Sair");

            opicao = sc.nextInt();
            sc.nextLine();

            switch (opicao){

                case 1:{
                    maquinaView.CadastrarMaquina();
                }

                case 2:{
                    tecnicoView.cadastrarTecnico();
                }

                case 3:{
                    pecaView.CadastrarPeca();
                }

                case 4:{
                    ordemManutencaoView.CriarOrdemManutencao();
                }

                case 5:{
                    ordemPecaView.OrdemPeca();
                }

                case 6:{

                }

                case 0:{
                    System.out.println("Finalizando o sistema...");
                }

            }
        }while (opicao !=0);
    }


}

