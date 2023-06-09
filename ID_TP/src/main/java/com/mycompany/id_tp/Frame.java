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
import net.sf.saxon.trans.XPathException;
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
        XML_HTML2 = new javax.swing.JDialog();
        BotaoJanela4 = new javax.swing.JButton();
        NomeEscritor = new javax.swing.JTextField();
        LabelJanela4 = new javax.swing.JLabel();
        Xpath_Escritor = new javax.swing.JDialog();
        BotaoJanela5 = new javax.swing.JButton();
        NomeEscritor1 = new javax.swing.JTextField();
        LabelJanela5 = new javax.swing.JLabel();
        Xpath_Escritor_Nacionalidade = new javax.swing.JDialog();
        BotaoJanela6 = new javax.swing.JButton();
        NacionalidadeEscritor = new javax.swing.JTextField();
        LabelJanela6 = new javax.swing.JLabel();
        Xpath_Obras = new javax.swing.JDialog();
        BotaoJanela7 = new javax.swing.JButton();
        NomeEscritor3 = new javax.swing.JTextField();
        LabelJanela7 = new javax.swing.JLabel();
        Xpath_Obras_Valor_Editora = new javax.swing.JDialog();
        BotaoJanela9 = new javax.swing.JButton();
        NomeEditora = new javax.swing.JTextField();
        LabelJanela9 = new javax.swing.JLabel();
        ValorSuperiorA = new javax.swing.JTextField();
        LabelJanela10 = new javax.swing.JLabel();
        XML_HTML3 = new javax.swing.JDialog();
        LabelJanela8 = new javax.swing.JLabel();
        TituloObra = new javax.swing.JTextField();
        BotaoJanela8 = new javax.swing.JButton();
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
        XPath = new javax.swing.JMenu();
        NomeAutor = new javax.swing.JMenuItem();
        NacionalidadeAutor = new javax.swing.JMenuItem();
        AutorObras = new javax.swing.JMenuItem();
        PremiadoAutor = new javax.swing.JMenuItem();
        EditoraValorObras = new javax.swing.JMenuItem();
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
        XML3 = new javax.swing.JMenuItem();
        ultimoAutor = new javax.swing.JMenuItem();
        obraBarata = new javax.swing.JMenuItem();

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

        javax.swing.GroupLayout XML_HTML2Layout = new javax.swing.GroupLayout(XML_HTML2.getContentPane());
        XML_HTML2.getContentPane().setLayout(XML_HTML2Layout);
        XML_HTML2Layout.setHorizontalGroup(
            XML_HTML2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XML_HTML2Layout.createSequentialGroup()
                .addGroup(XML_HTML2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(XML_HTML2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(XML_HTML2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelJanela4)))
                    .addGroup(XML_HTML2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(BotaoJanela4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        XML_HTML2Layout.setVerticalGroup(
            XML_HTML2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XML_HTML2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelJanela4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BotaoJanela4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        BotaoJanela5.setText("OK");
        BotaoJanela5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJanela5ActionPerformed(evt);
            }
        });

        LabelJanela5.setText("Nome do escritor:");

        javax.swing.GroupLayout Xpath_EscritorLayout = new javax.swing.GroupLayout(Xpath_Escritor.getContentPane());
        Xpath_Escritor.getContentPane().setLayout(Xpath_EscritorLayout);
        Xpath_EscritorLayout.setHorizontalGroup(
            Xpath_EscritorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Xpath_EscritorLayout.createSequentialGroup()
                .addGroup(Xpath_EscritorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Xpath_EscritorLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(Xpath_EscritorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeEscritor1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelJanela5)))
                    .addGroup(Xpath_EscritorLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(BotaoJanela5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        Xpath_EscritorLayout.setVerticalGroup(
            Xpath_EscritorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Xpath_EscritorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelJanela5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeEscritor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BotaoJanela5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        BotaoJanela6.setText("OK");
        BotaoJanela6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJanela6ActionPerformed(evt);
            }
        });

        LabelJanela6.setText("Nacionalidade Escritores:");

        javax.swing.GroupLayout Xpath_Escritor_NacionalidadeLayout = new javax.swing.GroupLayout(Xpath_Escritor_Nacionalidade.getContentPane());
        Xpath_Escritor_Nacionalidade.getContentPane().setLayout(Xpath_Escritor_NacionalidadeLayout);
        Xpath_Escritor_NacionalidadeLayout.setHorizontalGroup(
            Xpath_Escritor_NacionalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Xpath_Escritor_NacionalidadeLayout.createSequentialGroup()
                .addGroup(Xpath_Escritor_NacionalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Xpath_Escritor_NacionalidadeLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(Xpath_Escritor_NacionalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NacionalidadeEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelJanela6)))
                    .addGroup(Xpath_Escritor_NacionalidadeLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(BotaoJanela6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        Xpath_Escritor_NacionalidadeLayout.setVerticalGroup(
            Xpath_Escritor_NacionalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Xpath_Escritor_NacionalidadeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelJanela6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NacionalidadeEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BotaoJanela6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        BotaoJanela7.setText("OK");
        BotaoJanela7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJanela7ActionPerformed(evt);
            }
        });

        LabelJanela7.setText("Nome do escritor:");

        javax.swing.GroupLayout Xpath_ObrasLayout = new javax.swing.GroupLayout(Xpath_Obras.getContentPane());
        Xpath_Obras.getContentPane().setLayout(Xpath_ObrasLayout);
        Xpath_ObrasLayout.setHorizontalGroup(
            Xpath_ObrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Xpath_ObrasLayout.createSequentialGroup()
                .addGroup(Xpath_ObrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Xpath_ObrasLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(Xpath_ObrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeEscritor3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelJanela7)))
                    .addGroup(Xpath_ObrasLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(BotaoJanela7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        Xpath_ObrasLayout.setVerticalGroup(
            Xpath_ObrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Xpath_ObrasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LabelJanela7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeEscritor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BotaoJanela7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        BotaoJanela9.setText("OK");
        BotaoJanela9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJanela9ActionPerformed(evt);
            }
        });

        LabelJanela9.setText("Nome da editora:");

        LabelJanela10.setText("Valor acima de:");

        javax.swing.GroupLayout Xpath_Obras_Valor_EditoraLayout = new javax.swing.GroupLayout(Xpath_Obras_Valor_Editora.getContentPane());
        Xpath_Obras_Valor_Editora.getContentPane().setLayout(Xpath_Obras_Valor_EditoraLayout);
        Xpath_Obras_Valor_EditoraLayout.setHorizontalGroup(
            Xpath_Obras_Valor_EditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Xpath_Obras_Valor_EditoraLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Xpath_Obras_Valor_EditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelJanela9)
                    .addComponent(ValorSuperiorA, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelJanela10)
                    .addGroup(Xpath_Obras_Valor_EditoraLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(BotaoJanela9, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        Xpath_Obras_Valor_EditoraLayout.setVerticalGroup(
            Xpath_Obras_Valor_EditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Xpath_Obras_Valor_EditoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelJanela9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelJanela10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValorSuperiorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BotaoJanela9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        LabelJanela8.setText("Titulo da Obra");

        BotaoJanela8.setText("OK");
        BotaoJanela8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoJanela8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout XML_HTML3Layout = new javax.swing.GroupLayout(XML_HTML3.getContentPane());
        XML_HTML3.getContentPane().setLayout(XML_HTML3Layout);
        XML_HTML3Layout.setHorizontalGroup(
            XML_HTML3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XML_HTML3Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addGroup(XML_HTML3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelJanela8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TituloObra, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(XML_HTML3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(BotaoJanela8, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        XML_HTML3Layout.setVerticalGroup(
            XML_HTML3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XML_HTML3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(LabelJanela8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TituloObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoJanela8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
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

        XPath.setText("XPath");

        NomeAutor.setText("Nome Autor");
        NomeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeAutorActionPerformed(evt);
            }
        });
        XPath.add(NomeAutor);

        NacionalidadeAutor.setText("Nacionalidade Autor");
        NacionalidadeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NacionalidadeAutorActionPerformed(evt);
            }
        });
        XPath.add(NacionalidadeAutor);

        AutorObras.setText("Autor Obras");
        AutorObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorObrasActionPerformed(evt);
            }
        });
        XPath.add(AutorObras);

        PremiadoAutor.setText("Premiado Autor");
        PremiadoAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PremiadoAutorActionPerformed(evt);
            }
        });
        XPath.add(PremiadoAutor);

        EditoraValorObras.setText("Editora Valor Obras");
        EditoraValorObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditoraValorObrasActionPerformed(evt);
            }
        });
        XPath.add(EditoraValorObras);

        jMenuBar1.add(XPath);

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

        XML3.setText("XML >> XML3");
        XML3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XML3ActionPerformed(evt);
            }
        });
        XSLT.add(XML3);

        ultimoAutor.setText("XML >> Ultimo Autor");
        ultimoAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoAutorActionPerformed(evt);
            }
        });
        XSLT.add(ultimoAutor);

        obraBarata.setText("XML >> Obra Barata");
        obraBarata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obraBarataActionPerformed(evt);
            }
        });
        XSLT.add(obraBarata);

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

                List<Livro> liv = Wrapper.criaLivro(NomeEscritorAdicionar.getText(), aut.getId(), nObrasJanela1.getSelectedIndex());
                Document doc;

                if (liv.get(0).getIsbn().equals("Nao definido")) {
                    //AdicionarEscritorJanela.setVisible(false);
                    JOptionPane.showMessageDialog(this,
                            "Numero de livros nao atingido",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    
                } else {
                    
                    for (int i = 0; i < liv.size(); i++) {
                        //------------------Obras-------------------//
                        doc = XMLJDomFunctions.lerDocumentoXML("obras.xml");
                        doc = ModeloXML.adicionaLivro(liv.get(i), doc);

                        if (doc != null) {
                            XMLJDomFunctions.escreverDocumentoParaFicheiro(doc, "obras.xml");
                        } else {
                            System.out.println("Erro com documento Obras");
                        }

                    }

                    doc = XMLJDomFunctions.lerDocumentoXML("escritores.xml");
                doc = ModeloXML.adicionaAutor(aut, doc);
                if (doc != null) {
                    XMLJDomFunctions.escreverDocumentoParaFicheiro(doc, "escritores.xml");
                } else {
                    System.out.println("Erro com documento Escritores");
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
        XML_HTML2.setSize(400, 215);
        XML_HTML2.setLocation(200, 200);
        XML_HTML2.setVisible(true);
    }//GEN-LAST:event_HTML2ActionPerformed

    private void XML2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XML2ActionPerformed
        try {
            SaxonFunctions_XQuery.xQueryToXml("XMLfile2.xml", "transf5.xql");
            Document doc = XMLJDomFunctions.lerDocumentoXML("XMLfile2.xml");

            if (doc != null) {
                String t = XMLJDomFunctions.escreverDocumentoString(doc);
                XMLcodeArea.setText(t);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Erro nos ficheiros",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (XPathException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_XML2ActionPerformed

    private void BotaoJanela4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJanela4ActionPerformed
        try {
            String xp = "//nomesAutores/nomeAutor[text()='" + NomeEscritor.getText() + "']";
            XdmValue res = null;
            res = XPathFunctions.executaXpath(xp, "obras.xml");

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

                XML_HTML2.setVisible(false);

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

    private void BotaoJanela5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJanela5ActionPerformed
        try {
            String xp = "//autor[@nome='" + NomeEscritor1.getText() + "']";
            XdmValue res = null;
            res = XPathFunctions.executaXpath(xp, "escritores.xml");

            if (res != null && res.size() != 0) {

                XMLcodeArea.setText(XPathFunctions.listaResultado(res).toString());
                Xpath_Escritor.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(this,
                        "Nome de autor inexistente",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (SaxonApiException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoJanela5ActionPerformed

    private void BotaoJanela6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJanela6ActionPerformed
        try {
            //System.out.println(NacionalidadeEscritor.getText());
            String xp = "//autores/autor[nacionalidade='" + NacionalidadeEscritor.getText() + "']/@nome";
            XdmValue res = null;
            res = XPathFunctions.executaXpath(xp, "escritores.xml");

            if (res != null && res.size() != 0) {

                XMLcodeArea.setText(XPathFunctions.listaResultado(res).toString());
                Xpath_Escritor_Nacionalidade.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(this,
                        "Nacionalidade de autor inexistente",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (SaxonApiException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoJanela6ActionPerformed

    private void BotaoJanela7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJanela7ActionPerformed
        try {
            String xp = "//livros/livro[nomesAutores/nomeAutor='" + NomeEscritor3.getText() + "']/titulo";
            XdmValue res = null;
            res = XPathFunctions.executaXpath(xp, "obras.xml");

            if (res != null && res.size() != 0) {

                XMLcodeArea.setText(XPathFunctions.listaResultado1(res).toString());
                Xpath_Obras.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(this,
                        "Nome de autor inexistente",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (SaxonApiException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoJanela7ActionPerformed

    private void BotaoJanela9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJanela9ActionPerformed
        try {
            String xp = "//livro[editora='" + NomeEditora.getText() + "' and preco > " + ValorSuperiorA.getText() + "]/titulo";
            XdmValue res = null;
            res = XPathFunctions.executaXpath(xp, "obras.xml");

            if (res != null && res.size() != 0) {

                XMLcodeArea.setText(XPathFunctions.listaResultado1(res).toString());
                Xpath_Obras_Valor_Editora.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(this,
                        "Erro com os dados",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (SaxonApiException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoJanela9ActionPerformed

    private void NomeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeAutorActionPerformed
        Xpath_Escritor.setSize(400, 215);
        Xpath_Escritor.setLocation(200, 200);
        Xpath_Escritor.setVisible(true);
    }//GEN-LAST:event_NomeAutorActionPerformed

    private void NacionalidadeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NacionalidadeAutorActionPerformed
        Xpath_Escritor_Nacionalidade.setSize(400, 215);
        Xpath_Escritor_Nacionalidade.setLocation(200, 200);
        Xpath_Escritor_Nacionalidade.setVisible(true);
    }//GEN-LAST:event_NacionalidadeAutorActionPerformed

    private void AutorObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorObrasActionPerformed
        Xpath_Obras.setSize(400, 215);
        Xpath_Obras.setLocation(200, 200);
        Xpath_Obras.setVisible(true);
    }//GEN-LAST:event_AutorObrasActionPerformed

    private void PremiadoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PremiadoAutorActionPerformed
        try {
            String xp = "//autor[count(premios/premio) = max(//autor/count(premios/premio))]/@nome";
            XdmValue res = null;
            res = XPathFunctions.executaXpath(xp, "escritores.xml");

            if (res != null && res.size() != 0) {

                XMLcodeArea.setText(XPathFunctions.listaResultado1(res).toString());

            } else {
                JOptionPane.showMessageDialog(this,
                        "Erro na operacao",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (SaxonApiException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PremiadoAutorActionPerformed

    private void EditoraValorObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditoraValorObrasActionPerformed
        Xpath_Obras_Valor_Editora.setSize(400, 250);
        Xpath_Obras_Valor_Editora.setLocation(200, 200);
        Xpath_Obras_Valor_Editora.setVisible(true);
    }//GEN-LAST:event_EditoraValorObrasActionPerformed

    private void XML3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XML3ActionPerformed
        // TODO add your handling code here:
        XML_HTML3.setSize(400, 215);
        XML_HTML3.setLocation(200, 200);
        XML_HTML3.setVisible(true);
    }//GEN-LAST:event_XML3ActionPerformed

    private void BotaoJanela8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoJanela8ActionPerformed
        // TODO add your handling code here:
        try {
            Element raiz = new Element("titulo");
            Document docV = new Document(raiz);
            raiz.addContent(TituloObra.getText());
            XMLJDomFunctions.escreverDocumentoParaFicheiro(docV, "titulo.xml");

        
            SaxonFunctions_XQuery.xQueryToXml("XMLfile3.xml", "transf6.xql");
            Document doc = XMLJDomFunctions.lerDocumentoXML("XMLfile3.xml");
            
            if (doc != null) {
                String t = XMLJDomFunctions.escreverDocumentoString(doc);
                XMLcodeArea.setText(t);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Erro nos ficheiros",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (XPathException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoJanela8ActionPerformed

    private void ultimoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoAutorActionPerformed
        // TODO add your handling code here:
        try {
            SaxonFunctions_XQuery.xQueryToXml("XMLfile4.xml", "transf7.xql");
            Document doc = XMLJDomFunctions.lerDocumentoXML("XMLfile4.xml");
            
            if (doc != null) {
                String t = XMLJDomFunctions.escreverDocumentoString(doc);
                XMLcodeArea.setText(t);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Erro nos ficheiros",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (XPathException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ultimoAutorActionPerformed

    private void obraBarataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obraBarataActionPerformed
        // TODO add your handling code here:
        try {
            SaxonFunctions_XQuery.xQueryToXml("XMLfile5.xml", "transf8.xql");
            Document doc = XMLJDomFunctions.lerDocumentoXML("XMLfile5.xml");
            
            if (doc != null) {
                String t = XMLJDomFunctions.escreverDocumentoString(doc);
                XMLcodeArea.setText(t);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Erro nos ficheiros",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (XPathException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_obraBarataActionPerformed

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
    private javax.swing.JMenuItem AutorObras;
    private javax.swing.JButton BotaoJanela1;
    private javax.swing.JButton BotaoJanela2;
    private javax.swing.JButton BotaoJanela3;
    private javax.swing.JButton BotaoJanela4;
    private javax.swing.JButton BotaoJanela5;
    private javax.swing.JButton BotaoJanela6;
    private javax.swing.JButton BotaoJanela7;
    private javax.swing.JButton BotaoJanela8;
    private javax.swing.JButton BotaoJanela9;
    private javax.swing.JMenuItem EditoraValorObras;
    private javax.swing.JTextField EscritorModificarJanela3;
    private javax.swing.JMenuItem HTML1;
    private javax.swing.JMenuItem HTML2;
    private javax.swing.JLabel LabelJanela1;
    private javax.swing.JLabel LabelJanela10;
    private javax.swing.JLabel LabelJanela1_2;
    private javax.swing.JLabel LabelJanela2;
    private javax.swing.JLabel LabelJanela3;
    private javax.swing.JLabel LabelJanela3_2;
    private javax.swing.JLabel LabelJanela3_3;
    private javax.swing.JLabel LabelJanela3_4;
    private javax.swing.JLabel LabelJanela3_5;
    private javax.swing.JLabel LabelJanela3_6;
    private javax.swing.JLabel LabelJanela4;
    private javax.swing.JLabel LabelJanela5;
    private javax.swing.JLabel LabelJanela6;
    private javax.swing.JLabel LabelJanela7;
    private javax.swing.JLabel LabelJanela8;
    private javax.swing.JLabel LabelJanela9;
    private javax.swing.JMenuItem NacionalidadeAutor;
    private javax.swing.JTextField NacionalidadeEscritor;
    private javax.swing.JMenuItem NomeAutor;
    private javax.swing.JTextField NomeEditora;
    private javax.swing.JTextField NomeEscritor;
    private javax.swing.JTextField NomeEscritor1;
    private javax.swing.JTextField NomeEscritor3;
    private javax.swing.JTextField NomeEscritorAdicionar;
    private javax.swing.JTextField NomeEscritorRemover;
    private javax.swing.JMenuItem PremiadoAutor;
    private javax.swing.JMenu Principal;
    private javax.swing.JMenuItem RemoverEscritor;
    private javax.swing.JDialog RemoverEscritorJanela;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem TXT1;
    private javax.swing.JTextField TituloObra;
    private javax.swing.JMenu Validar;
    private javax.swing.JTextField ValorModificarJanela3;
    private javax.swing.JTextField ValorSuperiorA;
    private javax.swing.JMenuItem VerXMLEscritores;
    private javax.swing.JMenuItem VerXMLObras;
    private javax.swing.JMenu XML;
    private javax.swing.JMenuItem XML1;
    private javax.swing.JMenuItem XML2;
    private javax.swing.JMenuItem XML3;
    private javax.swing.JDialog XML_HTML2;
    private javax.swing.JDialog XML_HTML3;
    private javax.swing.JTextArea XMLcodeArea;
    private javax.swing.JMenu XPath;
    private javax.swing.JMenu XSLT;
    private javax.swing.JDialog Xpath_Escritor;
    private javax.swing.JDialog Xpath_Escritor_Nacionalidade;
    private javax.swing.JDialog Xpath_Obras;
    private javax.swing.JDialog Xpath_Obras_Valor_Editora;
    private javax.swing.JMenuItem dtdEscritores;
    private javax.swing.JMenuItem dtdObras;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nCamposJanela3;
    private javax.swing.JComboBox<String> nModificacoesJanela3;
    private javax.swing.JComboBox<String> nObrasJanela1;
    private javax.swing.JMenuItem obraBarata;
    private javax.swing.JMenuItem ultimoAutor;
    private javax.swing.JMenuItem xsdEscritores;
    private javax.swing.JMenuItem xsdObras;
    // End of variables declaration//GEN-END:variables
}
