/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Usuario;

import ConectaBanco.ConexaoBD;
import ModeloBeans.BeansUsuario;
import ModeloDao.DaoUsuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author edson
 */
public class AddUsuario extends javax.swing.JDialog {
// Chama conexao

    ConexaoBD conex = new ConexaoBD();

// chama benas e dao
    BeansUsuario BEANS = new BeansUsuario();
    DaoUsuario DAO = new DaoUsuario();
// Campos internos
    int id_referencia;
    String login, nome, senha, confirma;

    /**
     * Creates new form AddUsuario
     */
    public AddUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jT_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jT_login = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar usuário");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jLabel1.setText("Nome :");

        jT_nome.setText("edson");
        jT_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jT_nomeKeyPressed(evt);
            }
        });

        jLabel2.setText("Permissão :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuário", "Consulta" }));
        jComboBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox1KeyPressed(evt);
            }
        });

        jLabel3.setText("Login :");

        jT_login.setText("@edson");
        jT_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jT_loginKeyPressed(evt);
            }
        });

        jLabel4.setText("Senha :");

        jLabel5.setText("Confirma  :");

        jPasswordField1.setText("1");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jT_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jT_login, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                .addComponent(jPasswordField1)
                                .addComponent(jPasswordField2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jT_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jT_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         

        ValidaCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jT_nomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_nomeKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jT_login.requestFocus();
        }
    }//GEN-LAST:event_jT_nomeKeyPressed

    private void jT_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_loginKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jPasswordField1.requestFocus();
        }
    }//GEN-LAST:event_jT_loginKeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jPasswordField2.requestFocus();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jButton1.requestFocus();
        }
    }//GEN-LAST:event_jPasswordField2KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jButton1.doClick();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jComboBox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox1KeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jT_nome.requestFocus();
        }
    }//GEN-LAST:event_jComboBox1KeyPressed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (evt.getKeyCode() == evt.VK_ESCAPE) {
            JOptionPane.showMessageDialog(rootPane, "exit");
        }
    }//GEN-LAST:event_formKeyReleased

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
            java.util.logging.Logger.getLogger(AddUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddUsuario dialog = new AddUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void ValidaCampos() {
        nome = jT_nome.getText().trim();
        login = jT_login.getText().trim();
        senha = jPasswordField1.getText().trim();
        confirma = jPasswordField2.getText().trim();
        if (nome.isEmpty()) {
            jT_nome.requestFocus();
        } else if (login.isEmpty()) {
            jT_login.requestFocus();
        } else if (senha.isEmpty()) {
            jPasswordField1.requestFocus();
        } else if (confirma.isEmpty()) {
            jPasswordField2.requestFocus();
        } else {
            ConfirmaSenha();
        }
    }

    public void ConfirmaSenha() {

        if (senha.equals(confirma)) {
            System.out.println("Usuario.AddUsuario.ConfirmaSenha() - correto  - " + senha);
            ValidaUsuario();
            //    SalvaUsuario();
        } else {
            jPasswordField2.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Senhas não conferem !");

        }
    }

    public void ValidaUsuario() {
        String resposta = jT_login.getText();
        conex.conexao();
        conex.executaSql2("SELECT *  FROM tbl_usuario where login_usuario ilike '%" + resposta + "%'     order by id_usuario asc ");
        try {
            conex.rs.last();
            String login = conex.rs.getString("login_usuario");
            System.out.println("Usuario.EditUsuario.ValidaUsuario()  -id_usuario-- " + conex.rs.getString("id_usuario"));
            if (resposta.equals(login)) {
                JOptionPane.showMessageDialog(rootPane, "Usuario ja cadastrado ! ");
            } else {

                JOptionPane.showMessageDialog(rootPane, "ok");
                SalvaUsuario();
            }
        } catch (SQLException ex) {
            SalvaUsuario();
            //JOptionPane.showMessageDialog(rootPane, ex);
        }
        conex.desconecta();
    }

    public void SalvaUsuario() {
        jT_nome.setText(jT_nome.getText().toUpperCase());
        jT_login.setText(jT_login.getText());
        
        BEANS.setPermissao((int) jComboBox1.getSelectedIndex());
        BEANS.setNome(jT_nome.getText());
        BEANS.setLogin(jT_login.getText());
        BEANS.setSenha(jPasswordField1.getText());
        BEANS.setStatus(1);
        DAO.Salvar(BEANS);
        LimpaCampos();
        try {
           ListaUsuario.jMenuItem4.doClick(); 
        } catch (Exception e) {
        }
        
        this.dispose();
    }

    public void LimpaCampos() {
        jT_nome.setText(null);
        jT_login.setText(null);
        jPasswordField1.setText(null);
        jPasswordField2.setText(null);
        nome = "";
        login = "";
        senha = "";
        confirma = "";
        jComboBox1.requestFocus();
    }

//    public void ChamaUltimoUsuario() {
//        conex.conexao();
//        conex.executaSql2("SELECT  id_usuario  FROM tbl_usuario where id_usuario is not null and id_usuario !=0 order by id_usuario asc ");
//        try {
//            conex.rs.last();
//            id_referencia = conex.rs.getInt("id_usuario");
//            id_referencia = id_referencia + 1;
//        } catch (SQLException ex) {
//            id_referencia = 1;
//        }
//        conex.desconecta();
//        System.out.println("Usuario.AddUsuario.ChamaUltimoUsuario() -- " + id_referencia);
//        // System.out.println("Usuario.AddUsuario.ChamaUltimoUsuario() -- " + jComboBox1.getSelectedIndex());
//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jT_login;
    private javax.swing.JTextField jT_nome;
    // End of variables declaration//GEN-END:variables
}