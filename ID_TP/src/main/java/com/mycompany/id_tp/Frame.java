package com.mycompany.id_tp;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdicionarEscritorJanela = new javax.swing.JDialog();
        RemoverEscritorJanela = new javax.swing.JDialog();
        AlterarDadosJanela = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Principal = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();
        XML = new javax.swing.JMenu();
        VerFicheiroXML = new javax.swing.JMenuItem();
        AdicionarEscritor = new javax.swing.JMenuItem();
        RemoverEscritor = new javax.swing.JMenuItem();
        AlterarDados = new javax.swing.JMenuItem();

        javax.swing.GroupLayout AdicionarEscritorJanelaLayout = new javax.swing.GroupLayout(AdicionarEscritorJanela.getContentPane());
        AdicionarEscritorJanela.getContentPane().setLayout(AdicionarEscritorJanelaLayout);
        AdicionarEscritorJanelaLayout.setHorizontalGroup(
            AdicionarEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        AdicionarEscritorJanelaLayout.setVerticalGroup(
            AdicionarEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout RemoverEscritorJanelaLayout = new javax.swing.GroupLayout(RemoverEscritorJanela.getContentPane());
        RemoverEscritorJanela.getContentPane().setLayout(RemoverEscritorJanelaLayout);
        RemoverEscritorJanelaLayout.setHorizontalGroup(
            RemoverEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        RemoverEscritorJanelaLayout.setVerticalGroup(
            RemoverEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AlterarDadosJanelaLayout = new javax.swing.GroupLayout(AlterarDadosJanela.getContentPane());
        AlterarDadosJanela.getContentPane().setLayout(AlterarDadosJanelaLayout);
        AlterarDadosJanelaLayout.setHorizontalGroup(
            AlterarDadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        AlterarDadosJanelaLayout.setVerticalGroup(
            AlterarDadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Principal.setText("Principal");

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Principal.add(Sair);

        jMenuBar1.add(Principal);

        XML.setText("XML");

        VerFicheiroXML.setText("Ver Ficheiro XML");
        XML.add(VerFicheiroXML);

        AdicionarEscritor.setText("Adicionar Escritor");
        XML.add(AdicionarEscritor);

        RemoverEscritor.setText("Remover Escritor");
        XML.add(RemoverEscritor);

        AlterarDados.setText("Alterar dados XML");
        XML.add(AlterarDados);

        jMenuBar1.add(XML);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SairActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdicionarEscritor;
    private javax.swing.JDialog AdicionarEscritorJanela;
    private javax.swing.JMenuItem AlterarDados;
    private javax.swing.JDialog AlterarDadosJanela;
    private javax.swing.JMenu Principal;
    private javax.swing.JMenuItem RemoverEscritor;
    private javax.swing.JDialog RemoverEscritorJanela;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem VerFicheiroXML;
    private javax.swing.JMenu XML;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
