package com.mycompany.id_tp;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Wrapper {
    
    public static String autor_nome(String nomeAutor) throws IOException{
        String link = "https://pt.wikipedia.org/wiki/";
        nomeAutor = nomeAutor.replace(" ", "_");
        HttpRequestFunctions.httpRequest1(link, nomeAutor, "wiki.html");
        
        Scanner ler;
        ler = new Scanner(Files.newInputStream(Path.of("wiki.html")));
        String er = "<h1\\sid=\"firstHeading\"\\sclass=\"firstHeading\\smw-first-heading\"><span class=\"mw-page-title-main\">([^<]+)</span></h1>";
        Pattern p = Pattern.compile(er);
        Matcher m;
        String linha;
        
        while(ler.hasNextLine()){
            linha = ler.nextLine();
            m = p.matcher(linha);
            if(m.find()){
                ler.close();
                return m.group(1);
            }
        }
        
        return null;
    }
    
    public static void autor_dataNascimento(String isbn) throws IOException{
    
    }
    
    public static void autor_DataMorte(String isbn) throws IOException{
    
    }
    
    public static void autor_nacionalidade(String isbn) throws IOException{
    
    }
    
    public static void autor_fotografia(String isbn) throws IOException{
    
    }
    
    public static void autor_generoLiterario(String isbn) throws IOException{
    
    }
    
    public static void autor_ocupacoes(String isbn) throws IOException{
    
    }
    
    public static void autor_premios(String isbn) throws IOException{
    
    }
    
    public static void obras_ISBN(String isbn) throws IOException{
    
    }
    
    public static void obras_nomeAutor(String isbn) throws IOException{
    
    }
    
    public static void obras_titulo(String isbn) throws IOException{
    
    }
    
    public static void obras_preco(String isbn) throws IOException{
    
    }
    
    public static void obras_editora(String isbn) throws IOException{
    
    }
    
    public static void obras_fotoCapa(String isbn) throws IOException{
    
    }
    
}
