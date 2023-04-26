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
    
    public static String autor_DataMorte(String nomeAutor) throws IOException{
        
        String link = "https://pt.wikipedia.org/wiki/";
        nomeAutor = nomeAutor.replace(" ", "_");
        HttpRequestFunctions.httpRequest1(link, nomeAutor, "wiki.html");
        
        Scanner ler;
        ler = new Scanner(Files.newInputStream(Path.of("wiki.html")));
        String er1 = "<td[^>]+>Morte";
        String er2 = "<a\\shref=\"[^\"]+\"\\stitle=\"[^\"]+\">([^<]+)</a>([^<]+)<a\\shref=\"[^\"]+\"\\stitle=\"[^\"]+\">([^<]+)</a>";
        
        Pattern p = Pattern.compile(er1, Pattern.DOTALL);
        Matcher m;
        String linha;
        
        while(ler.hasNextLine()){
            linha = ler.nextLine();
            m = p.matcher(linha);
            
            if(m.find()){
                p = Pattern.compile(er2, Pattern.DOTALL);
                
                while(ler.hasNextLine()){
                    linha = ler.nextLine();
                    m = p.matcher(linha);
                    
                    if(m.find()){
                        ler.close();
                        String resultado = m.group(1) + m.group(2) + m.group(3);
                        return resultado;
                    }
                }
            }
        }
        
        return null;
        
    }
    
    public static String autor_dataNascimento(String nomeAutor) throws IOException{
        
        String link = "https://pt.wikipedia.org/wiki/";
        nomeAutor = nomeAutor.replace(" ", "_");
        HttpRequestFunctions.httpRequest1(link, nomeAutor, "wiki.html");
        
        Scanner ler;
        ler = new Scanner(Files.newInputStream(Path.of("wiki.html")));
        String er1 = "<td[^>]+>Nascimento";
        String er2 = "<a\\shref=\"[^\\\"]+\"\\stitle=\"[^\"]+\">([^<]+)</a>([^<]+)<a\\shref=\"[^\"]+\"\\stitle=\"[^\"]+\">([^<]+)</a>"; //dia
        String er3 = "<a\\shref=\"[^\"]+\"\\stitle=\"[^\"]+\">([^<]+)</a>"; //ano       
        Pattern p = Pattern.compile(er1, Pattern.DOTALL);
        Pattern p2 = Pattern.compile(er2, Pattern.DOTALL);
        Matcher m, m2;
        String linha;
        
        while(ler.hasNextLine()){
            linha = ler.nextLine();
            m = p.matcher(linha);
            
            if(m.find()){
                p = Pattern.compile(er2, Pattern.DOTALL);
                p2 = Pattern.compile(er3, Pattern.DOTALL);
                
                while(ler.hasNextLine()){
                    linha = ler.nextLine();
                    m = p.matcher(linha);
                    m2 = p2.matcher(linha);
                    
                    if(m.find()){
                        ler.close();
                        String resultado = m.group(1) + m.group(2) + m.group(3);
                        return resultado;
                        
                    }else if(m2.find()){
                        ler.close();
                        String resultado = m2.group(1);
                        return resultado;
                    }
                    
                }
            }
        }
        
        return null;
    
    }
    
    public static String autor_nacionalidade(String nomeAutor) throws IOException{
        
        String link = "https://pt.wikipedia.org/wiki/";
        nomeAutor = nomeAutor.replace(" ", "_");
        HttpRequestFunctions.httpRequest1(link, nomeAutor, "wiki.html");
        
        Scanner ler;
        ler = new Scanner(Files.newInputStream(Path.of("wiki.html")));
        String er1 = "<td[^>]+>Nacionalidade";
        String er2 = "<a\\shref=\"[^\"]+\"\\stitle=\"[^\"]+\">([^<]+)</a>";
                        
        Pattern p = Pattern.compile(er1, Pattern.DOTALL);
        Matcher m;
        String linha;
        String res = "Nao definido";
        while(ler.hasNextLine()){
            linha = ler.nextLine();
            m = p.matcher(linha);
            
            if(m.find()){
                p = Pattern.compile(er2, Pattern.DOTALL);
                
                while(ler.hasNextLine()){
                    linha = ler.nextLine();
                    m = p.matcher(linha);
                    
                    if(m.find()){
                        ler.close();
                        String resultado = m.group(1);
                        return resultado;
                    }
                }
            }
        }
        
        return res;
    
    }
    
    public static void autor_fotografia(String nomeAutor) throws IOException{
    
    }
    
    public static void autor_generoLiterario(String nomeAutor) throws IOException{
    
    }
    
    public static void autor_ocupacoes(String nomeAutor) throws IOException{
    
    }
    
    public static void autor_premios(String nomeAutor) throws IOException{
    
    }
    
    public static void obras_ISBN(String nomeAutor) throws IOException{
    
    }
    
    public static void obras_nomeAutor(String nomeAutor) throws IOException{
    
    }
    
    public static void obras_titulo(String nomeAutor) throws IOException{
    
    }
    
    public static void obras_preco(String nomeAutor) throws IOException{
    
    }
    
    public static void obras_editora(String nomeAutor) throws IOException{
    
    }
    
    public static void obras_fotoCapa(String nomeAutor) throws IOException{
    
    }
    
}
