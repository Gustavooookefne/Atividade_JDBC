package org.example.View;

import org.example.Dao.MaquinaDAO;
import org.example.Model.Maquina;
import org.example.Service.MaquinaService;

import java.util.Scanner;

public class MaquinaView {

    private MaquinaService maquinaService;
    private Scanner sc;

    public MaquinaView(MaquinaService maquinaService){
        this.maquinaService = maquinaService;
        this.sc = new Scanner(System.in);

    }

    public void CadastrarMaquina(){
        try{
            System.out.println("----------- Cadastro Maquina -----------");
            System.out.println("Coloque o nome da Maquina: ");
            String nome = sc.next();

            System.out.println("Coloque o setor da Maquina: ");
            String setor = sc.next();

            System.out.println("Coloque o status da Maquina: ");
            String status = sc.next();

            Maquina maquina = new Maquina(1, "Nome", "Setor", "Status");
            maquinaService.CadastrarMaquina(maquina);

        }catch (Exception e ){
            System.out.println("Falaha ao cadastrar!!");
            e.printStackTrace();
        }
    }




}
