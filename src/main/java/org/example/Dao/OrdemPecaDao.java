package org.example.Dao;
import org.example.Model.OrdemManutencao;
import org.example.Model.OrdemPeca;
import org.example.infra.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdemPecaDao {
    public void inserir(OrdemPeca ordemPeca)throws SQLException {
        String sql = """
                INSERT INTO OrdemPEca (idOrdem ,idPeca ,quantidade) VALUES (?,?,?)
                """;
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, ordemPeca.getIdOrdem());
            stmt.setInt(2, ordemPeca.getIdPeca());
            stmt.setInt(3, ordemPeca.getQuanidade());
            stmt.executeUpdate();
        }

    }

    public List<OrdemPeca> listarPecasPorOrdem(int idOrdem)throws SQLException{
        List<OrdemPeca> pecasDaOrdem = new ArrayList<>();
        String sql = "SELECT * FROM OrdemPeca WHERE idOrdem = ?";
        try(Connection conn = Conexao.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1,idOrdem);

            try(ResultSet rs = stmt.executeQuery()){
                while (rs.next()){
                    pecasDaOrdem.add(new OrdemPeca(
                            rs.getInt("idOrdem"),
                            rs.getInt("idPeca"),
                            rs.getInt("quantidade"),
                            rs.getInt("Status")
                    ));
                }
            }
        }
        return pecasDaOrdem;
    }

}