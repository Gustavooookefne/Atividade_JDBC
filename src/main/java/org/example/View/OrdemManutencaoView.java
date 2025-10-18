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

    public void CriarOrdemManutencao(){
        System.out.println("----------- Criar Ordem Manuteção -----------");

        int idMaquina =
        if (idMaquina == -1) return;

        int idTecnico = selecionarTecnico();
        if (idTecnico == -1) return;

        try {
            // 4. Data de solicitação = data atual
            // 5. Status inicial = PENDENTE
            OrdemManutencao novaOrdem = new OrdemManutencao(idMaquina, idTecnico);

            // 6. Inserção no banco e 7. Atualizar status da máquina (Service)
            int idOrdem = ordemService.criarOrdem(novaOrdem);

            // 8. Confirmação
            System.out.println("\n[SUCESSO] Ordem de Manutenção ID " + idOrdem + " criada e máquina atualizada!");

        } catch (RegraNegocioException e) {
            System.err.println("[ERRO DE REGRA] " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("[ERRO DE BANCO] Falha na criação da Ordem: " + e.getMessage());
        }
    }
    }
}
