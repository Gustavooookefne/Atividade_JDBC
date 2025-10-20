package org.example.Dao;

import org.example.infra.Conexao;
import org.example.Model.Peca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PecaDao {
    public static void inserirPeca(Peca peca) throws SQLException{
        String query = """
                INSERT INTO Peca
                (nome, estoque) VALUE (?,?)
                """;

        try(Connection conn = Conexao.getConnection();
        PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1,peca.getNome());
            stmt.setString(2,peca.getEstoque());
        }
    }

    public List<Peca> buscarTodasPecas(){
        return List.of();
    }


}
