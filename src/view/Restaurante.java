package view;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Funcionario;
import model.Pedido;


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
        PanelOpcoes = new javax.swing.JPanel();
        labelSiriCascudo = new javax.swing.JLabel();
        botaoRealizarPedido = new javax.swing.JButton();
        botaoExcluirPedido = new javax.swing.JButton();
        botaoVisualizarPedido = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        PanelOpcoes.setBackground(new java.awt.Color(0, 0, 0));

        labelSiriCascudo.setBackground(new java.awt.Color(0, 0, 0));
        labelSiriCascudo.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        labelSiriCascudo.setForeground(new java.awt.Color(255, 102, 51));
        labelSiriCascudo.setText("SIRI CASCUDO");

        botaoRealizarPedido.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botaoRealizarPedido.setText("Realizar Pedido");
        botaoRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRealizarPedidoActionPerformed(evt);
            }
        });

        botaoExcluirPedido.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botaoExcluirPedido.setText("Excluir Pedido");
        botaoExcluirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirPedidoActionPerformed(evt);
            }
        });

        botaoVisualizarPedido.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        botaoVisualizarPedido.setText("Visualizar Pedido");
        botaoVisualizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarPedidoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/MENU.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelOpcoesLayout = new javax.swing.GroupLayout(PanelOpcoes);
        PanelOpcoes.setLayout(PanelOpcoesLayout);
        PanelOpcoesLayout.setHorizontalGroup(
            PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcoesLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSiriCascudo)
                    .addGroup(PanelOpcoesLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoRealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoVisualizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoExcluirPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelOpcoesLayout.setVerticalGroup(
            PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOpcoesLayout.createSequentialGroup()
                .addGroup(PanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOpcoesLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(labelSiriCascudo)
                        .addGap(35, 35, 35)
                        .addComponent(botaoRealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoVisualizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botaoExcluirPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOpcoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void botaoExcluirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirPedidoActionPerformed
        String numero = JOptionPane.showInputDialog("Informe o numero da mesa para excluir o pedido: ");
        model.CadastroFuncionario.excluirCadastro(numero);
        JOptionPane.showMessageDialog(this, "Cadastro excluído com sucesso!");
    }//GEN-LAST:event_botaoExcluirPedidoActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelOpcoes;
    private javax.swing.JButton botaoExcluirPedido;
    private javax.swing.JButton botaoRealizarPedido;
    private javax.swing.JButton botaoVisualizarPedido;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelSiriCascudo;
    // End of variables declaration//GEN-END:variables


}
