package com.mycompany.id_tp;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import net.sf.saxon.s9api.SaxonApiException;
import net.sf.saxon.s9api.XdmValue;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.transform.JDOMResult;
import org.jdom2.transform.JDOMSource;

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
        LabelJanela3 = new javax.swing.JLabel();
        LabelJanela3_2 = new javax.swing.JLabel();
        LabelJanela3_3 = new javax.swing.JLabel();
        nModificacoesJanela3 = new javax.swing.JComboBox<>();
        nCamposJanela3 = new javax.swing.JComboBox<>();
        EscritorModificarJanela3 = new javax.swing.JTextField();
        BotaoJanela3 = new javax.swing.JButton();
        LabelJanela3_4 = new javax.swing.JLabel();
        ValorModificarJanela3 = new javax.swing.JTextField();
        LabelJanela3_5 = new javax.swing.JLabel();
        AlterarValorJanela3 = new javax.swing.JTextField();
        LabelJanela3_6 = new javax.swing.JLabel();
        DadosJanela = new javax.swing.JDialog();
        BotaoJanela4 = new javax.swing.JButton();
        NomeEscritor = new javax.swing.JTextField();
        LabelJanela4 = new javax.swing.JLabel();
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
        Validar = new javax.swing.JMenu();
        dtdEscritores = new javax.swing.JMenuItem();
        xsdEscritores = new javax.swing.JMenuItem();
        dtdObras = new javax.swing.JMenuItem();
        xsdObras = new javax.swing.JMenuItem();
        XSLT = new javax.swing.JMenu();
        HTML1 = new javax.swing.JMenuItem();
        TXT1 = new javax.swing.JMenuItem();
        XML1 = new javax.swing.JMenuItem();
        HTML2 = new javax.swing.JMenuItem();
        XML2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

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
        BotaoJanela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJanela2ActionPerformed(evt);
            }
        });

        LabelJanela2.setText("Nome do escritor a remover:");

        javax.swing.GroupLayout RemoverEscritorJanelaLayout = new javax.swing.GroupLayout(RemoverEscritorJanela.getContentPane());
        RemoverEscritorJanela.getContentPane().setLayout(RemoverEscritorJanelaLayout);
        RemoverEscritorJanelaLayout.setHorizontalGroup(
            RemoverEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoverEscritorJanelaLayout.createSequentialGroup()
                .addGroup(RemoverEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RemoverEscritorJanelaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(RemoverEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeEscritorRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelJanela2)))
                    .addGroup(RemoverEscritorJanelaLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(BotaoJanela2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        RemoverEscritorJanelaLayout.setVerticalGroup(
            RemoverEscritorJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoverEscritorJanelaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelJanela2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeEscritorRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BotaoJanela2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        LabelJanela3.setText("<html> Tipo de modificação ao ficheiro escritores.xml: ");

        LabelJanela3_2.setText("Campo a modificar: ");

        LabelJanela3_3.setText("Valor a remover: ");

        nModificacoesJanela3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Remover campo", "Adicionar Campo", "Alterar Campo"}));

        nCamposJanela3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dataNascimento", "dataMorte", "nacionalidade", "generosLiterarios", "ocupacoes", "premios" }));

        BotaoJanela3.setText("OK");
        BotaoJanela3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJanela3ActionPerformed(evt);
            }
        });

        LabelJanela3_4.setText("Autor a modificar: ");

        LabelJanela3_5.setText("Valor a adicionar:");

        LabelJanela3_6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelJanela3_6.setText("<html>*Dependendo do tipo de modificação, os campos \"valor a remover\" e \"valor a adicionar\" podem não ter utilidade.");
        LabelJanela3_6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout AlterarDadosJanelaLayout = new javax.swing.GroupLayout(AlterarDadosJanela.getContentPane());
        AlterarDadosJanela.getContentPane().setLayout(AlterarDadosJanelaLayout);
        AlterarDadosJanelaLayout.setHorizontalGroup(
            AlterarDadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlterarDadosJanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AlterarDadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlterarDadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(AlterarDadosJanelaLayout.createSequentialGroup()
                            .addComponent(LabelJanela3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BotaoJanela3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(AlterarDadosJanelaLayout.createSequentialGroup()
                            .addComponent(LabelJanela3_4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EscritorModificarJanela3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlterarDadosJanelaLayout.createSequentialGroup()
                            .addComponent(LabelJanela3_5, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AlterarValorJanela3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(AlterarDadosJanelaLayout.createSequentialGroup()
                            .addComponent(LabelJanela3_3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ValorModificarJanela3)))
                    .addGroup(AlterarDadosJanelaLayout.createSequentialGroup()
                        .addComponent(LabelJanela3_2)
                        .addGap(18, 18, 18)
                        .addComponent(nCamposJanela3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AlterarDadosJanelaLayout.createSequentialGroup()
                        .addComponent(LabelJanela3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nModificacoesJanela3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        AlterarDadosJanelaLayout.setVerticalGroup(
            AlterarDadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlterarDadosJanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AlterarDadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelJanela3_4)
                    .addComponent(EscritorModificarJanela3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AlterarDadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nModificacoesJanela3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelJanela3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AlterarDadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nCamposJanela3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelJanela3_2))
                .addGap(18, 18, 18)
                .addGroup(AlterarDadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelJanela3_3)
                    .addComponent(ValorModificarJanela3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AlterarDadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelJanela3_5)
                    .addComponent(AlterarValorJanela3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(AlterarDadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelJanela3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoJanela3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        BotaoJanela4.setText("OK");
        BotaoJanela4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJanela4ActionPerformed(evt);
            }
        });

        LabelJanela4.setText("Nome do escritor:");

        javax.swing.GroupLayout DadosJanelaLayout = new javax.swing.GroupLayout(DadosJanela.getContentPane());
        DadosJanela.getContentPane().setLayout(DadosJanelaLayout);
        DadosJanelaLayout.setHorizontalGroup(
            DadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosJanelaLayout.createSequentialGroup()
                .addGroup(DadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DadosJanelaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(DadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelJanela4)))
                    .addGroup(DadosJanelaLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(BotaoJanela4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        DadosJanelaLayout.setVerticalGroup(
            DadosJanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosJanelaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelJanela4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BotaoJanela4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

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

        Validar.setText("Validar");

        dtdEscritores.setText("DTD Escritores");
        dtdEscritores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtdEscritoresActionPerformed(evt);
            }
        });
        Validar.add(dtdEscritores);

        xsdEscritores.setText("XSD Escritores");
        xsdEscritores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xsdEscritoresActionPerformed(evt);
            }
        });
        Validar.add(xsdEscritores);

        dtdObras.setText("DTD Obras");
        dtdObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtdObrasActionPerformed(evt);
            }
        });
        Validar.add(dtdObras);

        xsdObras.setText("XSD Obras");
        xsdObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xsdObrasActionPerformed(evt);
            }
        });
        Validar.add(xsdObras);

        jMenuBar1.add(Validar);

        XSLT.setText("XSLT");

        HTML1.setText("XML >> HTML1");
        HTML1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HTML1ActionPerformed(evt);
            }
        });
        XSLT.add(HTML1);

        TXT1.setText("XML >> TXT1");
        TXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT1ActionPerformed(evt);
            }
        });
        XSLT.add(TXT1);

        XML1.setText("XML >> XML1");
        XML1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XML1ActionPerformed(evt);
            }
        });
        XSLT.add(XML1);

        HTML2.setText("XML >> HTML2");
        HTML2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HTML2ActionPerformed(evt);
            }
        });
        XSLT.add(HTML2);

        XML2.setText("XML >> XML2");
        XML2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XML2ActionPerformed(evt);
            }
        });
        XSLT.add(XML2);

        jMenuItem6.setText("jMenuItem6");
        XSLT.add(jMenuItem6);

        jMenuItem7.setText("jMenuItem7");
        XSLT.add(jMenuItem7);

        jMenuItem8.setText("jMenuItem8");
        XSLT.add(jMenuItem8);

        jMenuBar1.add(XSLT);

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
        if (doc == null) {
            JOptionPane.showMessageDialog(this,
                    "Ficheiro não existe",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String texto = XMLJDomFunctions.escreverDocumentoString(doc);
            XMLcodeArea.setText(texto);
        }

    }//GEN-LAST:event_VerXMLEscritoresActionPerformed

    private void VerXMLObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerXMLObrasActionPerformed
        Document doc = XMLJDomFunctions.lerDocumentoXML("obras.xml");
        if (doc == null) {
            JOptionPane.showMessageDialog(this,
                    "Ficheiro não existe",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String texto = XMLJDomFunctions.escreverDocumentoString(doc);
            XMLcodeArea.setText(texto);
        }
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
        AlterarDadosJanela.setSize(385, 300);
        AlterarDadosJanela.setLocation(200, 200);
        AlterarDadosJanela.setVisible(true);
    }//GEN-LAST:event_AlterarDadosActionPerformed

    private void BotaoJanela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJanela1ActionPerformed
        try {
            //------------Autores----------------//
            Autor aut = Wrapper.criaAutor(NomeEscritorAdicionar.getText());

            if (aut == null) {
                //AdicionarEscritorJanela.setVisible(false);
                JOptionPane.showMessageDialog(this,
                        "Escritor existe no ficheiro",
                        "Informação",
                        JOptionPane.INFORMATION_MESSAGE);

            } else {
                Livro liv = Wrapper.criaLivro(NomeEscritorAdicionar.getText(), aut.getId(), nObrasJanela1.getSelectedIndex());

                if (liv.getIsbn().equals("Nao definido")) {
                    //AdicionarEscritorJanela.setVisible(false);
                    JOptionPane.showMessageDialog(this,
                            "Numero de livros nao atingido",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);

                } else {
                    Document doc = XMLJDomFunctions.lerDocumentoXML("escritores.xml");
                    doc = ModeloXML.adicionaAutor(aut, doc);
                    if (doc != null) {
                        XMLJDomFunctions.escreverDocumentoParaFicheiro(doc, "escritores.xml");
                    } else {
                        System.out.println("Erro com documento Escritores");
                    }

                    //------------------Obras-------------------//
                    doc = XMLJDomFunctions.lerDocumentoXML("obras.xml");
                    doc = ModeloXML.adicionaLivro(liv, doc);
                    if (doc != null) {
                        XMLJDomFunctions.escreverDocumentoParaFicheiro(doc, "obras.xml");
                    } else {
                        System.out.println("Erro com documento Obras");
                    }

                    AdicionarEscritorJanela.setVisible(false);
                    JOptionPane.showMessageDialog(this,
                            "Escritor e respetivas obras adicionadas com sucesso",
                            "Informação",
                            JOptionPane.INFORMATION_MESSAGE);

                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SaxonApiException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoJanela1ActionPerformed

    private void BotaoJanela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJanela2ActionPerformed
        //------------Autores----------------//
        Document docEsc = XMLJDomFunctions.lerDocumentoXML("escritores.xml");
        Document docObr = XMLJDomFunctions.lerDocumentoXML("obras.xml");
        Element raiz;
        String ID = null;
        boolean found = false;
        if (docEsc == null || docObr == null) {
            RemoverEscritorJanela.setVisible(false);
            JOptionPane.showMessageDialog(this,
                    "Ficheiro não existe",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);

        } else {
            raiz = docEsc.getRootElement();

            List todosAutores = raiz.getChildren("autor");

            for (int i = 0; i < todosAutores.size(); i++) {
                Element autor = (Element) todosAutores.get(i); //obtem livro i da Lista

                if (NomeEscritorRemover.getText().equals(autor.getAttributeValue("nome"))) {
                    found = true;
                    ID = autor.getAttributeValue("id");
                }
            }
        }
        if (found) {
            docEsc = ModeloXML.removeEscritor(ID, docEsc);
            if (docEsc != null) {
                XMLJDomFunctions.escreverDocumentoParaFicheiro(docEsc, "escritores.xml");
            } else {
                System.out.println("Erro com documento Obras");
            }

            docObr = ModeloXML.removeObras(ID, docObr);
            if (docObr != null) {
                XMLJDomFunctions.escreverDocumentoParaFicheiro(docObr, "obras.xml");
            } else {
                System.out.println("Erro com documento Obras");
            }

            RemoverEscritorJanela.setVisible(false);
            JOptionPane.showMessageDialog(this,
                    "Escritor e respetivas obras removidas com sucesso",
                    "Informação",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            //RemoverEscritorJanela.setVisible(false);
            JOptionPane.showMessageDialog(this,
                    "Escritor não existe no ficheiro",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotaoJanela2ActionPerformed

    private void BotaoJanela3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJanela3ActionPerformed
        Document doc = XMLJDomFunctions.lerDocumentoXML("escritores.xml");
        Element raiz;
        String ID = null;
        boolean found1 = false;
        boolean found2 = false;

        if (doc == null) {
            AlterarDadosJanela.setVisible(false);
            JOptionPane.showMessageDialog(this,
                    "Ficheiro não existe",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);

        } else {
            raiz = doc.getRootElement();

            List todosAutores = raiz.getChildren("autor");

            for (int i = 0; i < todosAutores.size(); i++) {
                Element autor = (Element) todosAutores.get(i); //obtem livro i da Lista

                if (EscritorModificarJanela3.getText().equals(autor.getAttributeValue("nome"))) {
                    found1 = true;
                    ID = autor.getAttributeValue("id");
                }
            }
        }
        if (found1) {;

            switch (nModificacoesJanela3.getSelectedIndex() + 1) {
                case 1:
                    if (!ValorModificarJanela3.getText().equals("")) {
                        doc = ModeloXML.removeElementEscritor(ID, (String) nCamposJanela3.getSelectedItem(), ValorModificarJanela3.getText(), doc);
                        if (doc != null) {
                            XMLJDomFunctions.escreverDocumentoParaFicheiro(doc, "escritores.xml");
                            found2 = true;
                        } else {
                            found1 = false;
                            System.out.println("Erro com documento Obras");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Valor a remover por preencher",
                                "Informação",
                                JOptionPane.INFORMATION_MESSAGE);
                    }

                    break;
                case 2:
                    if (!AlterarValorJanela3.getText().equals("")) {
                        doc = ModeloXML.adicionaElementEscritor(ID, (String) nCamposJanela3.getSelectedItem(), AlterarValorJanela3.getText(), doc);
                        if (doc != null) {
                            XMLJDomFunctions.escreverDocumentoParaFicheiro(doc, "escritores.xml");
                            found2 = true;
                        } else {
                            found1 = false;
                            System.out.println("Erro com documento Obras");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Valor a adicionar por preencher",
                                "Informação",
                                JOptionPane.INFORMATION_MESSAGE);
                    }

                    break;
                case 3:
                    if (!ValorModificarJanela3.getText().equals("") && !AlterarValorJanela3.getText().equals("")) {
                        doc = ModeloXML.alteraElementEscritor(ID, (String) nCamposJanela3.getSelectedItem(), ValorModificarJanela3.getText(), AlterarValorJanela3.getText(), doc);
                        if (doc != null) {
                            XMLJDomFunctions.escreverDocumentoParaFicheiro(doc, "escritores.xml");
                            found2 = true;
                        } else {
                            found1 = false;
                            System.out.println("Erro com documento Obras");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Valor a remover e/ou a adicionar por preencher",
                                "Informação",
                                JOptionPane.INFORMATION_MESSAGE);
                    }

                    break;
                default:
                    System.out.println("Erro Selected Index");
            }

            if (found1 && found2) {
                AlterarDadosJanela.setVisible(false);
                JOptionPane.showMessageDialog(this,
                        "Alteracoes feitas com sucesso",
                        "Informação",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (!found1 && !found2) {
                //AlterarDadosJanela.setVisible(false);
                JOptionPane.showMessageDialog(this,
                        "Erro ao alterar elemento",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            //AlterarDadosJanela.setVisible(false);
            JOptionPane.showMessageDialog(this,
                    "Escritor não existe no ficheiro",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotaoJanela3ActionPerformed

    private void dtdEscritoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtdEscritoresActionPerformed
        try {
            int result = ValidarXML.validarDocumentoDTD("escritores.xml", "escritoresValidacao.dtd");

            switch (result) {
                case 0:
                    JOptionPane.showMessageDialog(this,
                            "Erro em ficheiros",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    break;

                case 1:
                    JOptionPane.showMessageDialog(this,
                            "Ficheiro escritores.xml valido por DTD",
                            "De Acordo com DTD",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;

                case -1:
                    JOptionPane.showMessageDialog(this,
                            "Ficheiro escritores.xml invalido por DTD",
                            "Nao está de Acordo com DTD",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    JOptionPane.showMessageDialog(this,
                            "Resultado imprevisto",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dtdEscritoresActionPerformed

    private void xsdEscritoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xsdEscritoresActionPerformed
        int result = ValidarXML.validarDocumentoXSD("escritores.xml", "escritoresValidacao.xsd");
        switch (result) {
            case 0:
                JOptionPane.showMessageDialog(this,
                        "Erro em ficheiros",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
                break;

            case 1:
                JOptionPane.showMessageDialog(this,
                        "Ficheiro escritores.xml valido por XSD",
                        "De Acordo com XSD",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            case -1:
                JOptionPane.showMessageDialog(this,
                        "Ficheiro escritores.xml invalido por XSD",
                        "Nao está de Acordo com XSD",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(this,
                        "Resultado imprevisto",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
                break;
        }
    }//GEN-LAST:event_xsdEscritoresActionPerformed

    private void dtdObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtdObrasActionPerformed
        try {
            int result = ValidarXML.validarDocumentoDTD("obras.xml", "obrasValidacao.dtd");

            switch (result) {
                case 0:
                    JOptionPane.showMessageDialog(this,
                            "Erro em ficheiros",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    break;

                case 1:
                    JOptionPane.showMessageDialog(this,
                            "Ficheiro obras.xml valido por DTD",
                            "De Acordo com DTD",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;

                case -1:
                    JOptionPane.showMessageDialog(this,
                            "Ficheiro obras.xml invalido por DTD",
                            "Nao está de Acordo com DTD",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    JOptionPane.showMessageDialog(this,
                            "Resultado imprevisto",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dtdObrasActionPerformed

    private void xsdObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xsdObrasActionPerformed
        int result = ValidarXML.validarDocumentoXSD("obras.xml", "obrasValidacao.xsd");
        switch (result) {
            case 0:
                JOptionPane.showMessageDialog(this,
                        "Erro em ficheiros",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
                break;

            case 1:
                JOptionPane.showMessageDialog(this,
                        "Ficheiro obras.xml valido por XSD",
                        "De Acordo com XSD",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            case -1:
                JOptionPane.showMessageDialog(this,
                        "Ficheiro obras.xml invalido por XSD",
                        "Nao está de Acordo com XSD",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            default:
                JOptionPane.showMessageDialog(this,
                        "Resultado imprevisto",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
                break;
        }
    }//GEN-LAST:event_xsdObrasActionPerformed

    private void HTML1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HTML1ActionPerformed
        Document doc = XMLJDomFunctions.lerDocumentoXML("escritores.xml");
        Document novo = JDOMFunctions_XSLT.transformaDocumento(doc, "escritores.xml", "transf1.xsl");
        if (doc != null && novo != null) {
            XMLJDomFunctions.escreverDocumentoParaFicheiro(novo, "HTMLfile1.html");
            doc = XMLJDomFunctions.lerDocumentoXML("HTMLfile1.html");

            String url = "HTMLfile1.html";
            File htmlFile = new File(url);

            try {
                Desktop.getDesktop().browse(htmlFile.toURI());
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this,
                    "Erro nos ficheiros",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_HTML1ActionPerformed

    private void TXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT1ActionPerformed
        Document doc = XMLJDomFunctions.lerDocumentoXML("escritores.xml");

        if (doc != null) {
            JDOMFunctions_XSLT.transformaDocumento2("escritores.xml", "transf2.xsl", "TXTfile1.txt");
            Scanner ler = null;

            try {
                ler = new Scanner(new FileInputStream("TXTfile1.txt"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }

            StringBuilder texto = new StringBuilder();
            String linha;

            while (ler.hasNextLine()) {
                linha = ler.nextLine();
                texto = texto.append(linha).append("\n");
            }

            ler.close();
            XMLcodeArea.setText(texto.toString());
        } else {
            JOptionPane.showMessageDialog(this,
                    "Erro nos ficheiros",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TXT1ActionPerformed

    private void XML1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XML1ActionPerformed
        Document doc = XMLJDomFunctions.lerDocumentoXML("obras.xml");
        if (doc != null) {
            Document novo = JDOMFunctions_XSLT.transformaDocumento(doc, "obras.xml", "transf3.xsl");
            XMLJDomFunctions.escreverDocumentoParaFicheiro(novo, "XMLfile1.xml");
            doc = XMLJDomFunctions.lerDocumentoXML("XMLfile1.xml");

            String t = XMLJDomFunctions.escreverDocumentoString(doc);
            XMLcodeArea.setText(t);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Erro nos ficheiros",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_XML1ActionPerformed

    private void HTML2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HTML2ActionPerformed
        DadosJanela.setSize(400, 215);
        DadosJanela.setLocation(200, 200);
        DadosJanela.setVisible(true);
    }//GEN-LAST:event_HTML2ActionPerformed

    private void XML2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XML2ActionPerformed
    /*    Document doc1 = XMLJDomFunctions.lerDocumentoXML("escritores.xml");
        Document doc2 = XMLJDomFunctions.lerDocumentoXML("obras.xml");

        if (doc1 != null && doc2 != null) {
            Document novo1 = JDOMFunctions_XSLT.transformaDocumento(doc1, "escritores.xml", "transf5.xsl");
            Document novo2 = JDOMFunctions_XSLT.transformaDocumento(doc2, "obras.xml", "transf5.xsl");

            Document novo = new Document();
            Element autores = new Element("autores");
            novo.setRootElement(autores);

            Element autorElement1 = novo1.getRootElement().clone();
            Element autorElement2 = novo2.getRootElement().clone();

            autores.addContent(autorElement1);
            autores.addContent(autorElement2);

            XMLJDomFunctions.escreverDocumentoParaFicheiro(novo, "XMLfile2.xml");
            Document doc = XMLJDomFunctions.lerDocumentoXML("XMLfile2.xml");

            String t = XMLJDomFunctions.escreverDocumentoString(doc);
            XMLcodeArea.setText(t);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Erro nos ficheiros",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_XML2ActionPerformed

    private void BotaoJanela4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJanela4ActionPerformed
        try {
            String xp = "//autor[@nome='" + NomeEscritor.getText() + "']";
            XdmValue res = null;
            res = XPathFunctions.executaXpath(xp, "escritores.xml");

            if (res != null && res.size() != 0) {
                // Carregar o arquivo XSL
                File xslFile = new File("transf4.xsl");
                Source xslt = new StreamSource(xslFile);

                // Carregar o arquivo XML de entrada
                File xmlFile = new File("obras.xml");
                Source xml = new StreamSource(xmlFile);

                // Definir o valor do parâmetro do autor
                String autor = NomeEscritor.getText();
                TransformerFactory factory = TransformerFactory.newInstance();
                Transformer transformer = factory.newTransformer(xslt);
                transformer.setParameter("autor", autor);

                // Executar a transformação
                File outputFile = new File("HTMLfile2.html");
                transformer.transform(xml, new StreamResult(outputFile));

                // Abrir o arquivo resultante no navegador
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().browse(outputFile.toURI());
                }

                DadosJanela.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(this,
                        "Nome de autor inexistente",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (TransformerException | IOException e) {
            e.printStackTrace();
        } catch (SaxonApiException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoJanela4ActionPerformed

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
    private javax.swing.JTextField AlterarValorJanela3;
    private javax.swing.JButton BotaoJanela1;
    private javax.swing.JButton BotaoJanela2;
    private javax.swing.JButton BotaoJanela3;
    private javax.swing.JButton BotaoJanela4;
    private javax.swing.JDialog DadosJanela;
    private javax.swing.JTextField EscritorModificarJanela3;
    private javax.swing.JMenuItem HTML1;
    private javax.swing.JMenuItem HTML2;
    private javax.swing.JLabel LabelJanela1;
    private javax.swing.JLabel LabelJanela1_2;
    private javax.swing.JLabel LabelJanela2;
    private javax.swing.JLabel LabelJanela3;
    private javax.swing.JLabel LabelJanela3_2;
    private javax.swing.JLabel LabelJanela3_3;
    private javax.swing.JLabel LabelJanela3_4;
    private javax.swing.JLabel LabelJanela3_5;
    private javax.swing.JLabel LabelJanela3_6;
    private javax.swing.JLabel LabelJanela4;
    private javax.swing.JTextField NomeEscritor;
    private javax.swing.JTextField NomeEscritorAdicionar;
    private javax.swing.JTextField NomeEscritorRemover;
    private javax.swing.JMenu Principal;
    private javax.swing.JMenuItem RemoverEscritor;
    private javax.swing.JDialog RemoverEscritorJanela;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem TXT1;
    private javax.swing.JMenu Validar;
    private javax.swing.JTextField ValorModificarJanela3;
    private javax.swing.JMenuItem VerXMLEscritores;
    private javax.swing.JMenuItem VerXMLObras;
    private javax.swing.JMenu XML;
    private javax.swing.JMenuItem XML1;
    private javax.swing.JMenuItem XML2;
    private javax.swing.JTextArea XMLcodeArea;
    private javax.swing.JMenu XSLT;
    private javax.swing.JMenuItem dtdEscritores;
    private javax.swing.JMenuItem dtdObras;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nCamposJanela3;
    private javax.swing.JComboBox<String> nModificacoesJanela3;
    private javax.swing.JComboBox<String> nObrasJanela1;
    private javax.swing.JMenuItem xsdEscritores;
    private javax.swing.JMenuItem xsdObras;
    // End of variables declaration//GEN-END:variables
}
