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
            word = palavra.nextLine();

            String res = Wrapper.autor_nome(word);
            System.out.println(res + "\n");

        } catch (IOException ex) {
            Logger.getLogger(ID_TP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
