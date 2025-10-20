package org.example.Dao;

import org.example.infra.Conexao;
import org.example.Model.Tecnico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TecnicoDao {
    public static void inserirTecnico (Tecnico tecnico) throws SQLException{
        String query = """
                INSERT INTO Tecnico
                (nome, especialidade) 
                VALUES (?,?)
                """;

        try (Connection conn = Conexao.getConnection();
        PreparedStatement stmt  = conn.prepareStatement(query)){

            stmt.setString(1,tecnico.getNome());
            stmt.setString(2,tecnico.getEspecialidade());
            stmt.executeUpdate();
        }

    }

    public List<Tecnico> buscarTodos() {
    }
}
