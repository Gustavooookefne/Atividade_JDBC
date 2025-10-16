package org.example.Dao;

import org.example.Enum.StatusOrdemManutencao;
import org.example.Model.OrdemManutencao;
import org.example.infra.Conexao;

import java.net.URL;
import java.sql.*;

public class OrdemManutencaoDao {
    public int criacaoOrdem (OrdemManutencao ordem){
        String sql = "INSERT INTO OrdemManutencao (idMaquina ,idTecnico ,dataSolicitacao ,status) VALUES (?,?,?,?)";
        int idGerado = -1;

        try(Connection conn = Conexao.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){

            stmt.setInt(1,ordem.getIdMaquina());
            stmt.setInt(2,ordem.getIdTecnico());
            stmt.setDate(3, Date.valueOf(ordem.getDataSolicitacao()));
            stmt.setString(4, ordem.getStatus());

            int affectedRows = stmt.executeUpdate();

            if(affectedRows > 0){
                try (ResultSet rs = stmt.getGeneratedKeys()){
                    if(rs.next()){
                        idGerado = rs.getInt(1);
                        ordem.setId(idGerado);
                    }
                }
            }
        }catch (SQLException e){
            System.out.println("Erro ao Fazer a Ordem De Manutenção!!");
        }
        return idGerado;
    }

}
