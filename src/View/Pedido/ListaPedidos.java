/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Pedido;

 
import EntradaNota.*;
import ConectaBanco.ConexaoBD;
import Controle.Janelas;
import ModeloBeans.BeansNota;
import ModeloBeans.BeansPedido;
import ModeloBeans.ModeloTabela;
import ModeloDao.DaoNota;
import ModeloDao.DaoPedido;
import Principal.Menu;
import Validacao.ValidarNota;
import Validacao.ValidarPedido;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author edson
 */
public class ListaPedidos extends javax.swing.JFrame {

    //chama telas
    AddNota add = new AddNota();
// Janelas janela = new Janelas();
    // chama benas e dao
    BeansPedido BEANS = new BeansPedido();
    DaoPedido DAO = new DaoPedido();
    ValidarPedido validar = new ValidarPedido();
    // chama conexão
    ConexaoBD conex = new ConexaoBD();
    // uso interno
    JDialog_Opcao_Nota op = new JDialog_Opcao_Nota(this, rootPaneCheckingEnabled);
      
    String resposta = "", Status;
    int id_linha, codigo;

    /**
     * Creates new form ListaUsuario
     */
    public ListaPedidos() {
        initComponents();
//        PreencheTabela();
//        ValidaPermissao();
//        jMenuItem4.setVisible(false);
    }

    public void ValidaPermissao() {
        String Permissao = Menu.jLabelPermissao.getText();
        jCheckBox_editar.setEnabled(false);
        jCheckBox_excluir.setEnabled(false);
        if (Permissao.equals("0")) {
            System.out.println("ValidaPermissao() Permissao =" + Permissao);
            jCheckBox_editar.setEnabled(true);
            jCheckBox_excluir.setEnabled(true);
        }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Lista = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jCheckBox_editar = new javax.swing.JCheckBoxMenuItem();
        jCheckBox_excluir = new javax.swing.JCheckBoxMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedidos");
        setResizable(false);

        jTable_Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Lista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        jMenuBar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuBar1KeyPressed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        jMenuItem1.setText("Novo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator2);

        jCheckBox_editar.setText("Ativa Editar");
        jCheckBox_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_editarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCheckBox_editarMousePressed(evt);
            }
        });
        jMenu1.add(jCheckBox_editar);

        jCheckBox_excluir.setText("Ativa Excluir");
        jCheckBox_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_excluirMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCheckBox_excluirMousePressed(evt);
            }
        });
        jMenu1.add(jCheckBox_excluir);
        jMenu1.add(jSeparator3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem4.setText("Atualizar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
        jMenuItem2.setText("Buscar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator4);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//        add.BloqueiaCampos1();
//        add.PreencherNatureza();
//        add.PreencherFornecedor();
//        add.setVisible(true);
//Janelas janela = new Janelas();
//   janela.Chama_add_pedido();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        resposta = JOptionPane.showInputDialog(rootPane, "Digite sua busca ! ", "", 1);
        System.out.println("resp =" + resposta);
        if (resposta == null) {
            resposta = "";
        } else {
        }
        PreencheTabela();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTable_ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ListaMouseClicked
         if (evt.getButton() == MouseEvent.BUTTON3) {
            resposta = JOptionPane.showInputDialog(rootPane, "Digite sua busca ! ", "", 1);
            System.out.println("resp =" + resposta);
            if (resposta == null) {
                resposta = "";
            } else {
            }
            PreencheTabela();
        } else {
            if (evt.getClickCount() == 2) {
                int edit = 0, delete = 0;
                if (jCheckBox_editar.isSelected()) {
                    edit = 1;
                }
                if (jCheckBox_excluir.isSelected()) {
                    delete = 1;
                }
                String cod = "" + jTable_Lista.getValueAt(jTable_Lista.getSelectedRow(), 0);
                String descricao = "" + jTable_Lista.getValueAt(jTable_Lista.getSelectedRow(), 5);
                String st = "" + jTable_Lista.getValueAt(jTable_Lista.getSelectedRow(), 1);
                this.op.RecebeDados(descricao, cod, edit, delete, st);
                this.op.setVisible(true);
            }
        }
        if (evt.getClickCount() == 1) {

            try {
                codigo = (int) jTable_Lista.getValueAt(jTable_Lista.getSelectedRow(), 0);
                Status = "" + jTable_Lista.getValueAt(jTable_Lista.getSelectedRow(), 2);
            } catch (Exception e) {
            }
        }       
      
    }//GEN-LAST:event_jTable_ListaMouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        resposta = "";
        PreencheTabela();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jCheckBox_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_editarMouseClicked

    }//GEN-LAST:event_jCheckBox_editarMouseClicked

    private void jCheckBox_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_excluirMouseClicked

    }//GEN-LAST:event_jCheckBox_excluirMouseClicked

    private void jCheckBox_excluirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_excluirMousePressed
        jCheckBox_editar.setSelected(false);
    }//GEN-LAST:event_jCheckBox_excluirMousePressed

    private void jCheckBox_editarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_editarMousePressed
        jCheckBox_excluir.setSelected(false);
    }//GEN-LAST:event_jCheckBox_editarMousePressed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
//        JOptionPane.showMessageDialog(rootPane, "sair");
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuBar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuBar1KeyPressed
//       if (evt.getKeyCode() == evt.VK_F3) {
//              resposta = "";
//        PreencheTabela();
//        }
    }//GEN-LAST:event_jMenuBar1KeyPressed

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
            java.util.logging.Logger.getLogger(ListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPedidos().setVisible(true);
            }
        });
    }

    public void PreencheTabela() {
        String[] colunas = new String[]{"Código ", "Status",   "Data", "Cliente",   "Observação", "Registro"};
            ArrayList dados;
        String b = resposta;
        dados = (ArrayList) DAO.PreencheTabela(b);
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        jTable_Lista.setModel(modelo);
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(modelo);
        jTable_Lista.setRowSorter(sorter);
        jTable_Lista.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTable_Lista.getColumnModel().getColumn(0).setCellRenderer(direita);
        jTable_Lista.getColumnModel().getColumn(0).setResizable(true);
        jTable_Lista.getColumnModel().getColumn(1).setPreferredWidth(90);
        jTable_Lista.getColumnModel().getColumn(1).setResizable(true);
        jTable_Lista.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable_Lista.getColumnModel().getColumn(2).setResizable(true);
        jTable_Lista.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTable_Lista.getColumnModel().getColumn(3).setResizable(true);
        jTable_Lista.getColumnModel().getColumn(4).setPreferredWidth(180);
        jTable_Lista.getColumnModel().getColumn(4).setResizable(true);
        jTable_Lista.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTable_Lista.getColumnModel().getColumn(5).setResizable(true);
//        jTable_Lista.getColumnModel().getColumn(6).setPreferredWidth(180);
//        jTable_Lista.getColumnModel().getColumn(6).setResizable(true);
//        jTable_Lista.getColumnModel().getColumn(7).setPreferredWidth(180);
//        jTable_Lista.getColumnModel().getColumn(7).setResizable(true);
        jTable_Lista.getTableHeader().setReorderingAllowed(false);
        jTable_Lista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable_Lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        resposta = "";
    }

    public void UpdateStatus() {

//        BEANS.setProduto_id(id_linha);
//        if (Status.equals("Ativo")) {
//            BEANS.setProduto_status(0);
//        } else if (Status.equals("Inativo")) {
//            BEANS.setProduto_status(1);
//        } else {
//            BEANS.setProduto_status(1);
//        }
//        System.out.println("codigo up -> " + id_linha + "Status " + Status);
//        DAO.UpdateStatus(BEANS);
    }

    public void ExcluirItem() {
//        BEANS.setProduto_id(id_linha);
//        BEANS.setProduto_status(2);
//        DAO.UpdateStatus(BEANS);
//
//        BEANS.setProduto_id(id_linha);
//        BEANS.setProduto_usuario_id(Integer.parseInt(Menu.jLabelIdUsuario.getText()));
//        BEANS.setProduto_status(3);
//        System.out.println("codigo " + codigo + "Status " + Status);
//        DAO.ExcluirItem(BEANS);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBox_editar;
    private javax.swing.JCheckBoxMenuItem jCheckBox_excluir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    public static javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTable jTable_Lista;
    // End of variables declaration//GEN-END:variables
}
