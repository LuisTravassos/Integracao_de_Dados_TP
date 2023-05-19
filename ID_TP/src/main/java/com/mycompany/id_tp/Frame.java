package com.mycompany.id_tp;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.saxon.s9api.SaxonApiException;
import org.jdom2.Document;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdicionarEscritorJanela = new javax.swing.JDialog();
        NomeEscritorAdicionar = new javax.swing.JTextField();
        LabelJanela1 = new javax.swing.JLabel();
        BotaoJanela1 = new javax.swing.JButton();
        LabelJanela1_2 = new javax.swing.JLabel();
        nObrasJanela1 = new javax.swing.JComboBox<>();
        RemoverEscritorJanela = new javax.swing.JDialog();
        BotaoJanela2 = new javax.swing.JButton();
        NomeEscritorRemover = new javax.swing.JTextField();
        LabelJanela2 = new javax.swing.JLabel();
        AlterarDadosJanela = new javax.swing.JDialog();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        XMLcodeArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Principal = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();
        XML = new javax.swing.JMenu();
        VerXMLEscritores = new javax.swing.JMenuItem();
        VerXMLObras = new javax.swing.JMenuItem();
        AdicionarEscritor = new javax.swing.JMenuItem();
        RemoverEscritor = new javax.swing.JMenuItem();
        AlterarDados = new javax.swing.JMenuItem();

        LabelJanela1.setText("Nome do escritor a adicionar:");

        BotaoJanela1.setText("OK");
        BotaoJanela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJanela1ActionPerformed(evt);
            }
        });

        LabelJanela1_2.setText("Quantidade de obras por escritor (max 5):");

        nObrasJanela1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout AdicionarEscritorJanelaLayout = new javax.swing.GroupLayout(AdicionarEscritorJanela.getContentPane());
        AdicionarEscritorJanela.getContentPane().setLayout(AdicionarEscritorJanelaLayout);
        AdicionarEscritorJanelaLayout.setHorizontalGroup(
            AdicionarEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdicionarEscritorJanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AdicionarEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AdicionarEscritorJanelaLayout.createSequentialGroup()
                        .addComponent(LabelJanela1_2)
                        .addGap(18, 18, 18)
                        .addComponent(nObrasJanela1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(NomeEscritorAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelJanela1)
                    .addGroup(AdicionarEscritorJanelaLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(BotaoJanela1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        AdicionarEscritorJanelaLayout.setVerticalGroup(
            AdicionarEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdicionarEscritorJanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelJanela1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeEscritorAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AdicionarEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelJanela1_2)
                    .addComponent(nObrasJanela1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotaoJanela1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        BotaoJanela2.setText("OK");

        LabelJanela2.setText("Nome do escritor a remover:");

        javax.swing.GroupLayout RemoverEscritorJanelaLayout = new javax.swing.GroupLayout(RemoverEscritorJanela.getContentPane());
        RemoverEscritorJanela.getContentPane().setLayout(RemoverEscritorJanelaLayout);
        RemoverEscritorJanelaLayout.setHorizontalGroup(
            RemoverEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoverEscritorJanelaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(RemoverEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeEscritorRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelJanela2))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RemoverEscritorJanelaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoJanela2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        RemoverEscritorJanelaLayout.setVerticalGroup(
            RemoverEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoverEscritorJanelaLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(LabelJanela2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeEscritorRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(BotaoJanela2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
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

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        XMLcodeArea.setColumns(20);
        XMLcodeArea.setRows(5);
        jScrollPane1.setViewportView(XMLcodeArea);

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

        VerXMLEscritores.setText("Ver Ficheiro XML Escritores");
        VerXMLEscritores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerXMLEscritoresActionPerformed(evt);
            }
        });
        XML.add(VerXMLEscritores);

        VerXMLObras.setText("Ver Ficheiro XML Obras");
        VerXMLObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerXMLObrasActionPerformed(evt);
            }
        });
        XML.add(VerXMLObras);

        AdicionarEscritor.setText("Adicionar Escritor");
        AdicionarEscritor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarEscritorActionPerformed(evt);
            }
        });
        XML.add(AdicionarEscritor);

        RemoverEscritor.setText("Remover Escritor");
        RemoverEscritor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverEscritorActionPerformed(evt);
            }
        });
        XML.add(RemoverEscritor);

        AlterarDados.setText("Alterar dados XML");
        AlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarDadosActionPerformed(evt);
            }
        });
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
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void VerXMLEscritoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerXMLEscritoresActionPerformed
        Document doc = XMLJDomFunctions.lerDocumentoXML("escritores.xml");
        String texto = XMLJDomFunctions.escreverDocumentoString(doc);
        XMLcodeArea.setText(texto);
    }//GEN-LAST:event_VerXMLEscritoresActionPerformed

    private void VerXMLObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerXMLObrasActionPerformed
        Document doc = XMLJDomFunctions.lerDocumentoXML("obras.xml");
        String texto = XMLJDomFunctions.escreverDocumentoString(doc);
        XMLcodeArea.setText(texto);
    }//GEN-LAST:event_VerXMLObrasActionPerformed

    private void AdicionarEscritorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarEscritorActionPerformed
        AdicionarEscritorJanela.setSize(400, 215);
        AdicionarEscritorJanela.setLocation(200, 200);
        AdicionarEscritorJanela.setVisible(true);
    }//GEN-LAST:event_AdicionarEscritorActionPerformed

    private void RemoverEscritorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverEscritorActionPerformed
        RemoverEscritorJanela.setSize(400, 215);
        RemoverEscritorJanela.setLocation(200, 200);
        RemoverEscritorJanela.setVisible(true);
    }//GEN-LAST:event_RemoverEscritorActionPerformed

    private void AlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarDadosActionPerformed
        AlterarDadosJanela.setSize(400, 215);
        AlterarDadosJanela.setLocation(200, 200);
        AlterarDadosJanela.setVisible(true);
    }//GEN-LAST:event_AlterarDadosActionPerformed

    private void BotaoJanela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJanela1ActionPerformed
        try {
            //------------Autores----------------//
            Autor aut = Wrapper.criaAutor(NomeEscritorAdicionar.getText());
            if(aut != null){
                Document doc = XMLJDomFunctions.lerDocumentoXML("escritores.xml");
                doc = ModeloXML.adicionaAutor(aut, doc);
                if (doc != null) {
                    XMLJDomFunctions.escreverDocumentoParaFicheiro(doc, "escritores.xml");
                }else{
                    System.out.println("Erro com documento Escritores");
                }
                
                //------------------Obras-------------------//
                Livro liv = Wrapper.criaLivro(NomeEscritorAdicionar.getText(), aut.getId(), nObrasJanela1.getSelectedIndex());
                doc = XMLJDomFunctions.lerDocumentoXML("obras.xml");
                doc = ModeloXML.adicionaLivro(liv, doc);
                if (doc != null) {
                    XMLJDomFunctions.escreverDocumentoParaFicheiro(doc, "obras.xml");
                }else{
                    System.out.println("Erro com documento Obras");
                }
                
                AdicionarEscritorJanela.setVisible(false);
                JOptionPane.showMessageDialog(this,
                    "Escritor e respetivas obras adicionadas com sucesso",
                    "Informação",
                    JOptionPane.INFORMATION_MESSAGE);
               
            }else{
                AdicionarEscritorJanela.setVisible(false);
                JOptionPane.showMessageDialog(this,
                        "Escritor existe no ficheiro",
                        "Informação",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SaxonApiException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_BotaoJanela1ActionPerformed

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
    private javax.swing.JButton BotaoJanela1;
    private javax.swing.JButton BotaoJanela2;
    private javax.swing.JLabel LabelJanela1;
    private javax.swing.JLabel LabelJanela1_2;
    private javax.swing.JLabel LabelJanela2;
    private javax.swing.JTextField NomeEscritorAdicionar;
    private javax.swing.JTextField NomeEscritorRemover;
    private javax.swing.JMenu Principal;
    private javax.swing.JMenuItem RemoverEscritor;
    private javax.swing.JDialog RemoverEscritorJanela;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem VerXMLEscritores;
    private javax.swing.JMenuItem VerXMLObras;
    private javax.swing.JMenu XML;
    private javax.swing.JTextArea XMLcodeArea;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nObrasJanela1;
    // End of variables declaration//GEN-END:variables
}
