package org.example.View;

import org.example.Model.Tecnico;
import org.example.Service.TecnicoService;

import java.util.Scanner;

public class TecnicoView {

    private TecnicoService tecnicoService;
    private Scanner sc;

    public TecnicoView(TecnicoService tecnicoService){
        this.tecnicoService = tecnicoService;
        this.sc = new Scanner(System.in);

    }

    public void cadastrarTecnico(){
        try{
            System.out.println("----------- Cadastro Técinico -----------");
            System.out.println("Coloque o nome do Técinico: ");
            String nome = sc.next();

            System.out.println("Coloque a especialidade do Técinico: ");
            String especialidade = sc.next();

            Tecnico tecnico = new Tecnico(0,nome,especialidade);
            tecnicoService.CadastrarTecnico(tecnico);

        }catch (Exception e){
            System.out.println("Erro ao cadastrar Técinico");
            e.printStackTrace();
        }
    }
}
