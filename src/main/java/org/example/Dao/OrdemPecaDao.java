package org.example.Dao;

import org.example.Model.OrdemPeca;
import org.example.infra.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdemPecaDao {
    public static void gerarOrdem(OrdemPeca ordemPeca){
        String slq = """
                INSERT INTO OrdemPeca
                (idOrdem , idPeca ,quantidade) VALUES (?,?,?)
                """;
        List<OrdemPeca> ordem = new ArrayList<>();
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt  = conn.prepareStatement(slq)){

                stmt.setString(1,ordemPeca);


    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
