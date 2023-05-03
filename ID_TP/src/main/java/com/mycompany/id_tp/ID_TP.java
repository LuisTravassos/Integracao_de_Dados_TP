package com.mycompany.id_tp;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ID_TP {

    public static void main(String[] args) {
        try {
            Scanner palavra = new Scanner(System.in, "ISO-8859-1");
            String word;
            System.out.println("Autor a procurar: ");
            word = "J. K. Rowling"; //palavra.nextLine();

            String res = "\n" + Wrapper.autor_nome(word) + "\n"
                    + Wrapper.autor_dataNascimento(word) + "\n"
                    + Wrapper.autor_DataMorte(word) + "\n"
                    + Wrapper.autor_nacionalidade(word) + "\n"
                    + Wrapper.autor_fotografia(word) + "\n"
                    + Wrapper.autor_generoLiterario(word) + "\n";
            
            System.out.println(res );

        } catch (IOException ex) {
            Logger.getLogger(ID_TP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
