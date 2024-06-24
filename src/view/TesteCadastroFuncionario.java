/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Funcionario;

/**
 *
 * @author Leozera
 */
public class TesteCadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TesteCadastroFuncionario
     */
    public TesteCadastroFuncionario() {
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

        PanelOptions = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        PanelOptions.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setText("Cadastro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Visualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        img.setBackground(new java.awt.Color(0, 0, 0));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/FUNC.png"))); // NOI18N

        btnClose.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnClose.setText("X");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelOptionsLayout = new javax.swing.GroupLayout(PanelOptions);
        PanelOptions.setLayout(PanelOptionsLayout);
        PanelOptionsLayout.setHorizontalGroup(
            PanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOptionsLayout.createSequentialGroup()
                .addGroup(PanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelOptionsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelOptionsLayout.createSequentialGroup()
                        .addGroup(PanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelOptionsLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jButton3))
                            .addGroup(PanelOptionsLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelOptionsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelOptionsLayout.setVerticalGroup(
            PanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOptionsLayout.createSequentialGroup()
                .addGroup(PanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelOptionsLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(PanelOptionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String nome = JOptionPane.showInputDialog("Nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
        String endereco = JOptionPane.showInputDialog("Endereço:");
        char sexo = JOptionPane.showInputDialog("Sexo (M/F):").charAt(0);
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Altura:"));
        String telefone = JOptionPane.showInputDialog("Telefone:");
        String registro = JOptionPane.showInputDialog("Registro:");
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Salário:"));

        // Verificação dos valores capturados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Sexo: " + sexo);
        System.out.println("Altura: " + altura);
        System.out.println("Telefone: " + telefone);
        System.out.println("Registro: " + registro);
        System.out.println("Salário: " + salario);

        Funcionario funcionario = new Funcionario(nome, idade, endereco, sexo, altura, telefone, registro, salario);
        model.CadastroFuncionario.salvarCadastro(funcionario);

        JOptionPane.showMessageDialog(this, "Funcionário cadastrado com sucesso!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nome = JOptionPane.showInputDialog("Informe o nome do estagiário a visualizar:");
        Funcionario funcionario = model.CadastroFuncionario.lerCadastro(nome);

        if (funcionario != null) {
            // Criar um JPanel para exibir as informações
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0, 2)); // Layout para organizar os campos em duas colunas

            // Adicionar JLabels e JTextFields para cada informação do estagiário
            panel.add(new JLabel("Nome:"));
            panel.add(new JLabel(funcionario.getNome()));

            panel.add(new JLabel("Idade:"));
            panel.add(new JLabel(String.valueOf(funcionario.getIdade())));

            panel.add(new JLabel("Endereço:"));
            panel.add(new JLabel(funcionario.getEndereco()));

            panel.add(new JLabel("Sexo:"));
            panel.add(new JLabel(String.valueOf(funcionario.getSexo())));

            panel.add(new JLabel("Altura:"));
            panel.add(new JLabel(String.valueOf(funcionario.getAltura())));

            panel.add(new JLabel("Telefone:"));
            panel.add(new JLabel(funcionario.getTelefone()));

            panel.add(new JLabel("Registro:"));
            panel.add(new JLabel(funcionario.getRegistro()));

            panel.add(new JLabel("Salário:"));
            panel.add(new JLabel(String.valueOf(funcionario.getSalario())));

            // Mostrar o JOptionPane com o JPanel personalizado
            JOptionPane.showMessageDialog(this, panel, "Cadastro de Estagiário", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Estagiário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String nome = JOptionPane.showInputDialog("Informe o nome do cadastro a excluir:");
        model.CadastroFuncionario.excluirCadastro(nome);
        JOptionPane.showMessageDialog(this, "Cadastro excluído com sucesso!");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelOptions;
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
