package com.mycompany.id_tp;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;

public class ID_TP {

    public static void main(String[] args) {
        try {
            /*Scanner palavra = new Scanner(System.in, "ISO-8859-1");
            String word;
            System.out.println("Autor a procurar: ");
            word = "José Saramago"; //palavra.nextLine();*/
            
            String lista = "Luís de Camões,William Shakespeare,Eça de Queiroz,J. K. Rowling,Howard Phillips Lovecraft";
            String[] word = lista.split(",");
            
            
            
            for (int i = 0; i < 5; i++) {
                /*
                String res = "\n\tINFORMAÇÃO DO AUTOR:\n"
                        + Wrapper.autor_nome(word[i]) + "\n"
                        + Wrapper.autor_dataNascimento(word[i]) + "\n"
                        + Wrapper.autor_DataMorte(word[i]) + "\n"
                        + Wrapper.autor_nacionalidade(word[i]) + "\n"
                        + Wrapper.autor_fotografia(word[i]) + "\n"
                        + Wrapper.autor_generoLiterario(word[i]) + "\n"
                        + Wrapper.autor_ocupacoes(word[i]) + "\n"
                        + "\n\tINFORMAÇÃO DOS LIVROS:\n"
                        + Wrapper.obras_nomeAutor(word[i]) + "\n"
                        + Wrapper.obras_titulo(word[i]) + "\n"
                        + Wrapper.obras_ISBN(word[i]) + "\n"
                        + Wrapper.obras_preco(word[i]) + "\n"
                        + Wrapper.obras_editora(word[i]) + "\n"
                        + Wrapper.obras_fotoCapa(word[i]) + "\n";

                System.out.println(res);
                */
                
                //------------Autores----------------//
                Autor aut = Wrapper.criaAutor(word[i]);
                Document doc = XMLJDomFunctions.lerDocumentoXML("escritores.xml");
                
                //Chama a função para adicionar o livro ao XML 
                doc = ModeloXML.adicionaAutor(aut, doc);
                
                //grava o ficheiro XML em disco
                if (doc != null) {
                    XMLJDomFunctions.escreverDocumentoParaFicheiro(doc, "escritores.xml");
                }else{
                    System.out.println("Erro com documento Escritores");
                }
                
                //------------------Obras-------------------//
                Livro liv = Wrapper.criaLivro(word[i], aut.getId());
                doc = XMLJDomFunctions.lerDocumentoXML("obras.xml");
                
                //Chama a função para adicionar o livro ao XML 
                doc = ModeloXML.adicionaLivro(liv, doc);
                
                //grava o ficheiro XML em disco
                if (doc != null) {
                    XMLJDomFunctions.escreverDocumentoParaFicheiro(doc, "obras.xml");
                }else{
                    System.out.println("Erro com documento Obras");
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(ID_TP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
