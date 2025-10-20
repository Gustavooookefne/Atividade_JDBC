package org.example.View;

import org.example.Dao.MaquinaDAO;
import org.example.Dao.PecaDao;
import org.example.Dao.TecnicoDao;
import org.example.Model.Maquina;
import org.example.Model.OrdemManutencao;
import org.example.Model.Tecnico;
import org.example.Service.OrdemManutencaoService;

import java.util.List;
import java.util.Scanner;

public class OrdemManutencaoView {

    private final Scanner sc;
    private final OrdemManutencaoService ordemManutencaoService;
    private final MaquinaDAO maquinaDAO;
    private final TecnicoDao tecnicoDao;
    private final PecaDao pecaDao;

    public OrdemManutencaoView(Scanner sc, MaquinaDAO maquinaDAO, TecnicoDao tecnicoDao, PecaDao pecaDao, OrdemManutencaoService ordemManutencaoService) {
        this.sc = sc;
        this.maquinaDAO = maquinaDAO;
        this.tecnicoDao = tecnicoDao;
        this.pecaDao = pecaDao;
        this.ordemManutencaoService = ordemManutencaoService;
    }

    public void CriarOrdemManutencao() {
        try{
            System.out.println("----------- Criar Ordem Manuteção -----------");

            Maquina maquinaSelecionada = selecionarMaquina();
            if (maquinaSelecionada == null) {
                System.out.println("Criação de Ordem de Manutenção cancelada.");
                return;
            }

            Tecnico tecnicoSelecionado = selecionarTecnico();
            if (tecnicoSelecionado == null) {
                System.out.println("Criação de Ordem de Manutenção cancelada.");
                return;
            }

            OrdemManutencao novaOrdem = ordemManutencaoService.criarOrdem(maquinaSelecionada, tecnicoSelecionado);

            System.out.println("\n-------------------------------------------");
            System.out.println("Ordem de Manutenção criada com sucesso!");
            System.out.println(novaOrdem.getDetalhesConfirmacao());
            System.out.println("Status da Máquina '" + maquinaSelecionada.getNome() + "' atualizado para EM_MANUTENCAO.");
            System.out.println("-------------------------------------------");

        } catch (Exception e) {
            System.out.println("Erro ao Criar ordem de manutenção: " + e.getMessage());
        }
    }

    private Maquina selecionarMaquina() {
        List<Maquina> maquinasOperacionais = maquinaDAO.buscarTodasOperacionais();

        if (maquinasOperacionais.isEmpty()) {
            System.out.println("ATENÇÃO: Não há máquinas com status 'OPERACIONAL' disponíveis.");
            return null;
        }

        System.out.println("\n--- Máquinas Disponíveis (Status: OPERACIONAL) ---");
        for (Maquina m : maquinasOperacionais) {
            System.out.println("ID: " + m.getId() + " - " + m.getNome());
        }
        System.out.println("-------------------------------------------------");

        Maquina maquinaSelecionada = null;
        while (maquinaSelecionada == null) {
            System.out.print("Digite o ID da máquina solicitada: ");
            if (!sc.hasNextInt()) {
                System.out.println("ID inválido. Por favor, digite um número.");
                sc.nextLine();
                continue;
            }
            int idMaquina = sc.nextInt();
            sc.nextLine();

            for (Maquina m : maquinasOperacionais) {
                if (m.getId() == idMaquina) {
                    maquinaSelecionada = m;
                    break;
                }
            }

            if (maquinaSelecionada == null) {
                System.out.println("ID " + idMaquina + " inválido ou a máquina não está OPERACIONAL. Tente novamente.");
            }
        }
        return maquinaSelecionada;
    }

    private Tecnico selecionarTecnico() {
        List<Tecnico> todosTecnicos = tecnicoDao.buscarTodos();

        if (todosTecnicos.isEmpty()) {
            System.out.println("ATENÇÃO: Não há técnicos cadastrados.");
            return null;
        }

        System.out.println("\n--- Técnicos Disponíveis ---");
        for (Tecnico t : todosTecnicos) {
            System.out.println("ID: " + t.getId() + " - " + t.getNome());
        }
        System.out.println("--------------------------");

        Tecnico tecnicoSelecionado = null;
        while (tecnicoSelecionado == null) {
            System.out.print("Digite o ID do Técnico: ");
            if (!sc.hasNextInt()) {
                System.out.println("ID inválido. Por favor, digite um número.");
                sc.nextLine();
                continue;
            }
            int idTecnico = sc.nextInt();
            sc.nextLine();

            for (Tecnico t : todosTecnicos) {
                if (t.getId() == idTecnico) {
                    tecnicoSelecionado = t;
                    break;
                }
            }

            if (tecnicoSelecionado == null) {
                System.out.println("ID " + idTecnico + " inválido. Tente novamente.");
            }
        }
        return tecnicoSelecionado;
    }
}