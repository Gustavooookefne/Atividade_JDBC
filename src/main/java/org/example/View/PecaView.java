package org.example.View;

import org.example.Service.PecaService;

import java.util.Scanner;

public class PecaView {
    private PecaService pecaService;
    private Scanner sc;

    public PecaView(PecaService pecaService){
        this.pecaService = pecaService;
        this.sc = new Scanner(System.in);
    }

    public void CadastrarPeca(){
        try{
            System.out.println("------- Cadastro Peça -------");
            System.out.println("Cooque o nome da Peça: ");
            String nome = sc.nextLine();

            System.out.println("Coloque a quantidade de Peça: ");
            String quantidade = sc.nextLine();
        }catch (Exception e){
            System.out.println("Falha ao cadastrar Peça!!!");
            e.printStackTrace();
        }
    }
}
