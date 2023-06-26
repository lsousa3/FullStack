package model.dao;

import Objeto.Aluno;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import UTIL.ManipularImagem;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class AlunoDAO {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt;
    ResultSet rs;
    BufferedImage imagem;

    public void create(Aluno aluno1) {

        String sql = "INSERT INTO alunos (nome, matricula, turma, foto) VALUES (?,?,?,?)";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, aluno1.getNome());
            stmt.setInt(2, (int) aluno1.getMatricula());
            stmt.setString(3, aluno1.getTurma());
            stmt.setBytes(4, aluno1.getFoto());
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO! Não foi possivel cadastrar o aluno!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public Aluno getAluno(String id) {

        String sql = "SELECT * FROM alunos WHERE id = ?";

        try {

            stmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, id);
            rs = stmt.executeQuery();
            Aluno aluno = new Aluno();
            //Poisicionar o ResultSet na primeira posição:
            rs.first();
            aluno.setId(rs.getInt("id"));
            aluno.setNome(rs.getString("nome"));
            aluno.setTurma(rs.getString("turma"));
            aluno.setMatricula(rs.getInt("matricula"));
            aluno.setFoto(rs.getBytes("foto"));
            return aluno;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;

        }
    }

    public void update(Aluno alunoOBJ) {

       String sql = "UPDATE alunos SET nome = ?, matricula = ?, turma = ?, foto = ? WHERE id = ? ";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, alunoOBJ.getNome());
            stmt.setInt(2, (int) alunoOBJ.getMatricula());
            stmt.setString(3, alunoOBJ.getTurma());
            stmt.setBytes(4, alunoOBJ.getFoto());
            stmt.setInt(5, alunoOBJ.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO! Não foi possivel alterar os dados do aluno!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public void delete(Aluno alunoOBJ) {


        try {
            stmt = con.prepareStatement("DELETE from alunos WHERE id = ? ");

            stmt.setInt(1, alunoOBJ.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO! Não foi possivel deletar os dados do aluno!" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
//    public ArrayList<Aluno> ListarAluno(){
//        
//        String sql = "SELECT * from alunos";
//        
//        try {
//            
//            
//        } catch (SQLException erro) {
//            JOptionPane.showMessageDialog(null, "ListarAluno AlunoDAO" + erro);
//        }
//        
//    }

}
