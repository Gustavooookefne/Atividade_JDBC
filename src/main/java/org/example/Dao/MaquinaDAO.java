package org.example.Dao;

import org.example.Model.Maquina;
import org.example.infra.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MaquinaDAO {
    public static void inserirMaquina(Maquina maquina) throws SQLException {
        String query = """ 
                INSERT INTO Maquina 
                (nome ,setor ,status) VALUES (?,?,?)
                """;

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, maquina.getNome());
            stmt.setString(2, maquina.getSetor());
            stmt.setString(3, maquina.setStatus().name());
            stmt.executeUpdate();
        }
    }


    public List<Maquina> buscarTodasOperacionais() {
    }
}


