/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Objeto.Aluno;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.dao.AlunoDAO;
import UTIL.ManipularImagem;

/**
 *
 * @author escola-linux
 */
public class LocalizarAluno extends javax.swing.JFrame {

    /**
     * Creates new form LocalizarAluno
     */
    BufferedImage imagem;
    public LocalizarAluno() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIDPesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomeRS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTurmaRS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMatriculaRS = new javax.swing.JTextField();
        lblFotoRS = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblIDAluno = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Localizar Aluno");
        getContentPane().setLayout(null);

        jLabel1.setText("Digite o ID do aluno:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(82, 71, 130, 18);
        getContentPane().add(txtIDPesquisa);
        txtIDPesquisa.setBounds(230, 68, 242, 24);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(833, 187, 125, 0);

        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(505, 68, 115, 24);

        jLabel3.setText("NOME :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(44, 213, 67, 18);

        txtNomeRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeRSActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeRS);
        txtNomeRS.setBounds(167, 210, 205, 24);

        jLabel4.setText("TURMA :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(44, 246, 58, 24);

        txtTurmaRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurmaRSActionPerformed(evt);
            }
        });
        getContentPane().add(txtTurmaRS);
        txtTurmaRS.setBounds(167, 246, 205, 24);

        jLabel5.setText("MATRICULA :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(44, 285, 89, 18);

        txtMatriculaRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaRSActionPerformed(evt);
            }
        });
        getContentPane().add(txtMatriculaRS);
        txtMatriculaRS.setBounds(167, 282, 205, 24);

        lblFotoRS.setText("foto");
        lblFotoRS.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        getContentPane().add(lblFotoRS);
        lblFotoRS.setBounds(430, 152, 150, 154);

        btnDelete.setText("EXCLUIR");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(44, 396, 328, 24);

        jLabel6.setText("ID do Aluno:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(44, 144, 97, 37);

        lblIDAluno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIDAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));
        getContentPane().add(lblIDAluno);
        lblIDAluno.setBounds(147, 144, 40, 37);

        btnUpdate.setText("ALTERAR");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(44, 354, 328, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        pesquisarAluno();

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        deletarAluno();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        atualizarAluno();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtMatriculaRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaRSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaRSActionPerformed

    private void txtTurmaRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurmaRSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTurmaRSActionPerformed

    private void txtNomeRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeRSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeRSActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LocalizarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocalizarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocalizarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocalizarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocalizarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblFotoRS;
    private javax.swing.JLabel lblIDAluno;
    private javax.swing.JTextField txtIDPesquisa;
    private javax.swing.JTextField txtMatriculaRS;
    private javax.swing.JTextField txtNomeRS;
    private javax.swing.JTextField txtTurmaRS;
    // End of variables declaration//GEN-END:variables

    private void pesquisarAluno() {
        String idPesquisa = (txtIDPesquisa.getText());
        AlunoDAO alunoDAO = new AlunoDAO();
        Aluno aluno = alunoDAO.getAluno(idPesquisa);
        if (aluno == null) {
            JOptionPane.showMessageDialog(rootPane, "Aluno não encontrado!");
        } else {
            //Preencher o formulário com os dados do aluno:
            lblIDAluno.setText(Integer.toString(aluno.getId()));
            txtNomeRS.setText(aluno.getNome());
            txtTurmaRS.setText(aluno.getTurma());
            txtMatriculaRS.setText(Integer.toString(aluno.getMatricula()));
            //ManipularImagem.exibiImagemLabel(aluno.getFoto(), lblFotoRS);
//            ImageIcon icone = new ImageIcon(imagem);
//            Icon foto = new ImageIcon (icone.getImage().getScaledInstance(lblFotoRS.getHeight(), HEIGHT, WIDTH));
//            Blob blob = (Blob) 
            lblFotoRS.setIcon(new ImageIcon(imagem));
        }
    }

    private void atualizarAluno() {

        int id, matricula;
        String nome, turma;
        byte[] foto;

        id = Integer.parseInt(lblIDAluno.getText());
        matricula = Integer.parseInt(txtMatriculaRS.getText());
        nome = txtNomeRS.getText();
        turma = txtTurmaRS.getText();
        
        

        Aluno alunoOBJ = new Aluno();
        alunoOBJ.setId(id);
        alunoOBJ.setMatricula(matricula);
        alunoOBJ.setNome(nome);
        alunoOBJ.setTurma(turma);
        //alunoOBJ.setFoto(foto);

        AlunoDAO objdao = new AlunoDAO();
        objdao.update(alunoOBJ);

    }

    private void deletarAluno() {
        int id, matricula;
        String nome, turma;
        byte[] foto;
        
        id = Integer.parseInt(lblIDAluno.getText());
        matricula = Integer.parseInt(txtMatriculaRS.getText());
        nome = txtNomeRS.getText();
        turma = txtTurmaRS.getText();
       //foto = lblFotoRS.getDisabledIcon(ManipularImagem.getImgBytes(imagem));
        
        Aluno alunoOBJ = new Aluno();
        alunoOBJ.setId(id);
        alunoOBJ.setMatricula(matricula);
        alunoOBJ.setNome(nome);
        alunoOBJ.setTurma(turma);
      //  alunoOBJ.setFoto(foto);

        AlunoDAO objdao = new AlunoDAO();
        objdao.delete(alunoOBJ);
    }

}

