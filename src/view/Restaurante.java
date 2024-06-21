/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Funcionario;
import model.Pedido;

/**
 *
 * @author fezar
 */
public class Restaurante extends javax.swing.JInternalFrame {

    /**
     * Creates new form Restaurante
     */
    public Restaurante() {
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

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botaoRealizarPedido = new javax.swing.JButton();
        botaoExcluirPedido = new javax.swing.JButton();
        botaoVisualizarPedido = new javax.swing.JButton();

        jButton3.setText("jButton3");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("SIRI CASCUDO");

        botaoRealizarPedido.setText("Realizar Pedido");
        botaoRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRealizarPedidoActionPerformed(evt);
            }
        });

        botaoExcluirPedido.setText("Excluir Pedido");
        botaoExcluirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirPedidoActionPerformed(evt);
            }
        });

        botaoVisualizarPedido.setText("Visualizar Pedido");
        botaoVisualizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoVisualizarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoExcluirPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoRealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(botaoRealizarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoVisualizarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoExcluirPedido)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRealizarPedidoActionPerformed
        int numeroMesa = Integer.parseInt(JOptionPane.showInputDialog("Numero da mesa: "));
        String nomeComida = JOptionPane.showInputDialog("Nome do lanche:");
        int quantidadeComida = Integer.parseInt(JOptionPane.showInputDialog("Quantidade (Lanche):"));
        String nomeBebida = JOptionPane.showInputDialog("Nome da bebida:");
        int quantidadeBebida = Integer.parseInt(JOptionPane.showInputDialog("Quantidade (Bebida):"));
        float valorTotal = Float.parseFloat(JOptionPane.showInputDialog("Valor total: "));
        
        Pedido pedido = new Pedido(numeroMesa, nomeComida, quantidadeComida, nomeBebida, quantidadeBebida, valorTotal);
        model.CadastroPedido.salvarPedido(pedido);
        
        JOptionPane.showMessageDialog(this, "Pedido cadastrado com sucesso!");
    }//GEN-LAST:event_botaoRealizarPedidoActionPerformed

    private void botaoExcluirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirPedidoActionPerformed
        String numero = JOptionPane.showInputDialog("Informe o numero da mesa para excluir o pedido: ");
        model.CadastroFuncionario.excluirCadastro(numero);
        JOptionPane.showMessageDialog(this, "Cadastro excluído com sucesso!");
    }//GEN-LAST:event_botaoExcluirPedidoActionPerformed

    private void botaoVisualizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarPedidoActionPerformed
        String numeroMesa = JOptionPane.showInputDialog("Informe o numero da mesa: ");
        Pedido pedido = model.CadastroPedido.lerPedido(numeroMesa);

        if (pedido != null) {
            // Criar um JPanel para exibir as informações
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0, 2)); // Layout para organizar os campos em duas colunas

            // Adicionar JLabels e JTextFields para cada informação do estagiário
            panel.add(new JLabel("Lanche:"));
            panel.add(new JLabel(pedido.getNomeComida()));

            panel.add(new JLabel("Quantidade lanche:"));
            panel.add(new JLabel(String.valueOf(pedido.getQuantidadeComida())));

            panel.add(new JLabel("Bebida:"));
            panel.add(new JLabel(pedido.getNomeBebida()));

            panel.add(new JLabel("Quantidade bebida:"));
            panel.add(new JLabel(String.valueOf(pedido.getQuantidadeBebida())));

            panel.add(new JLabel("Valor Total:"));
            panel.add(new JLabel(String.valueOf(pedido.getPrecoTotal())));


            // Mostrar o JOptionPane com o JPanel personalizado
            JOptionPane.showMessageDialog(this, panel, "Pedido da mesa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Mesa nao encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoVisualizarPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluirPedido;
    private javax.swing.JButton botaoRealizarPedido;
    private javax.swing.JButton botaoVisualizarPedido;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
