package org.example.Dao;

import org.example.Model.OrdemPeca;
import org.example.infra.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public void inserir(OrdemPeca ordemPeca)throws SQLException{
    String sql = """
            INSERT INTO OrdemPEca (idOrdem ,idPeca ,quantidade) VALUES (?,?,?)
            """;

    try(Connection conn = Conexao.getConnection();
    PreparedStatement stmt = conn.prepareStatement(sql)){
        stmt.setInt(1,ordemPeca.or);
    }
}