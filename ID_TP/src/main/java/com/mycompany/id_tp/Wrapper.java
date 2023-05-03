package com.mycompany.id_tp;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wrapper {

    public static String autor_nome(String nomeAutor) throws IOException {

        String link = "https://pt.wikipedia.org/wiki/";
        nomeAutor = nomeAutor.replace(" ", "_");
        HttpRequestFunctions.httpRequest1(link, nomeAutor, "wiki.html");

        Scanner ler;
        ler = new Scanner(Files.newInputStream(Path.of("wiki.html")));

        String er = "<h1\\sid=\"firstHeading\"\\sclass=\"firstHeading\\smw-first-heading\"><span class=\"mw-page-title-main\">([^<]+)</span></h1>";

        Pattern p = Pattern.compile(er);
        Matcher m;
        String linha;

        while (ler.hasNextLine()) {
            linha = ler.nextLine();
            m = p.matcher(linha);
            if (m.find()) {
                ler.close();
                return m.group(1);
            }
        }

        return "Nao definido";

    }

    public static String autor_DataMorte(String nomeAutor) throws IOException {

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

        while (ler.hasNextLine()) {
            linha = ler.nextLine();
            m = p.matcher(linha);

            if (m.find()) {
                p = Pattern.compile(er2, Pattern.DOTALL);

                while (ler.hasNextLine()) {
                    linha = ler.nextLine();
                    m = p.matcher(linha);

                    if (m.find()) {
                        ler.close();
                        String resultado = m.group(1) + m.group(2) + m.group(3);
                        return resultado;
                    }
                }
            }
        }

        return "Nao definido";

    }

    public static String autor_dataNascimento(String nomeAutor) throws IOException {

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

        while (ler.hasNextLine()) {
            linha = ler.nextLine();
            m = p.matcher(linha);

            if (m.find()) {
                p = Pattern.compile(er2, Pattern.DOTALL);
                p2 = Pattern.compile(er3, Pattern.DOTALL);

                while (ler.hasNextLine()) {
                    linha = ler.nextLine();
                    m = p.matcher(linha);
                    m2 = p2.matcher(linha);

                    if (m.find()) {
                        ler.close();
                        String resultado = m.group(1) + m.group(2) + m.group(3);
                        return resultado;

                    } else if (m2.find()) {
                        ler.close();
                        String resultado = m2.group(1);
                        return resultado;
                    }

                }
            }
        }

        return "Nao definido";

    }

    public static String autor_nacionalidade(String nomeAutor) throws IOException {

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

        while (ler.hasNextLine()) {
            linha = ler.nextLine();
            m = p.matcher(linha);

            if (m.find()) {
                p = Pattern.compile(er2, Pattern.DOTALL);

                while (ler.hasNextLine()) {
                    linha = ler.nextLine();
                    m = p.matcher(linha);

                    if (m.find()) {
                        ler.close();
                        String resultado = m.group(1);
                        return resultado;
                    }
                }
            }
        }

        return "Nao definido";

    }

    public static String autor_fotografia(String nomeAutor) throws IOException {

        String link = "https://pt.wikipedia.org/wiki/";
        String nomeAutor2 = nomeAutor.replace(" ", "_");
        HttpRequestFunctions.httpRequest1(link, nomeAutor2, "wiki.html");

        Scanner ler;
        ler = new Scanner(Files.newInputStream(Path.of("wiki.html")));
        String er1 = "class=\"image\"\\stitle=\"" + nomeAutor + "\"><img alt=\"\"\\ssrc=\"([^\"]+)\"";

        Pattern p = Pattern.compile(er1, Pattern.DOTALL);
        Matcher m;
        String linha;
        
        while (ler.hasNextLine()) {
            linha = ler.nextLine();
            m = p.matcher(linha);

            if (m.find()) {
                ler.close();
                String resultado = m.group(1);
                return resultado;
            }
        }

        return "Nao definido";

    }

    public static String autor_generoLiterario(String nomeAutor) throws IOException {

        String link = "https://pt.wikipedia.org/wiki/";
        nomeAutor = nomeAutor.replace(" ", "_");
        HttpRequestFunctions.httpRequest1(link, nomeAutor, "wiki.html");

        Scanner ler;
        ler = new Scanner(Files.newInputStream(Path.of("wiki.html")));
        String er1 = ">Gênero literário";
        String er2 = "<a\\shref=\"[^\"]+\"\\stitle=\"[^\"]+\">([^<]+)</a>";

        Pattern p = Pattern.compile(er1, Pattern.DOTALL);
        Matcher m;
        String linha;
        String resultado = "";

        while (ler.hasNextLine()) {
            linha = ler.nextLine();
            m = p.matcher(linha);

            if (m.find()) {
                p = Pattern.compile(er2, Pattern.DOTALL);

                while (ler.hasNextLine()) {
                    linha = ler.nextLine();
                    m = p.matcher(linha);

                    if (m.find()) {
                        String[] temp = linha.split(",");

                        for (int i = 0; i < temp.length ; i++) {
                            m = p.matcher(temp[i]);
                            
                            if (m.find()) {
                                resultado += m.group(1) + " ";
                            }
                        }
                        
                        ler.close();
                        return resultado;
                    }
                }
            }
        }

        return "Nao definido";

    }

    public static String autor_ocupacoes(String nomeAutor) throws IOException {
        String link = "https://pt.wikipedia.org/wiki/";
        nomeAutor = nomeAutor.replace(" ", "_");
        HttpRequestFunctions.httpRequest1(link, nomeAutor, "wiki.html");

        Scanner ler;
        ler = new Scanner(Files.newInputStream(Path.of("wiki.html")));
        String er1 = ">Ocupação";
        String er2 = "(\\se\\s){0,1}<a href=\"/wiki/[^\"]+\"(\\sclass=\"[^\"]+\"){0,1}\\stitle=\"[^\"]+\">([^<]+)</a>";

        Pattern p = Pattern.compile(er1, Pattern.DOTALL);
        Matcher m;
        String linha;
        String resultado = "";

        while (ler.hasNextLine()) {
            linha = ler.nextLine();
            m = p.matcher(linha);

            if (m.find()) {
                p = Pattern.compile(er2, Pattern.DOTALL);

                while (ler.hasNextLine()) {
                    linha = ler.nextLine();
                    m = p.matcher(linha);

                    if (m.find()) {
                        String[] temp = linha.split(",");

                        for (int i = 0; i < temp.length ; i++) {
                            m = p.matcher(temp[i]);
                            
                            if (m.find()) {
                                resultado += m.group(3) + " ";
                            }
                        }
                        
                        ler.close();
                        return resultado;
                    }
                }
            }
        }

        return "Nao definido";


    }

    public static void autor_premios(String nomeAutor) throws IOException {

    }

    public static void obras_ISBN(String nomeAutor) throws IOException {

    }
    
    public static String obras_nomeAutor(String nomeAutor) throws IOException{
        String link = "https://www.bertrand.pt/pesquisa/";
        String nome = nomeAutor.replace(" ", "+");
        HttpRequestFunctions.httpRequest1(link, nome, "bert.html");
        
        String fileContent = Files.readString(Path.of("bert.html"));
        Scanner ler1 = new Scanner(fileContent);
        Scanner ler2 = new Scanner(fileContent);
        
        String er = "<div class=\"cover\">";
        String er2 = "/autor[^\"]+\">" + nomeAutor + "<";
        String er3 = "data-title=\"([^\"]+)\"";
        
        Pattern p1 = Pattern.compile(er), p2, p3;
        Matcher m1, m2, m3;
        String linha, resultado = "";
        
        int next, counter = 0;
        
        while(ler1.hasNextLine()){
            next = 0;
                    
            linha = ler1.nextLine();
            m1 = p1.matcher(linha);
            
            if(m1.find()){
                //System.out.println("-----------------------------------------1");
                String linhaAtual = ler1.nextLine();
                ler2 = new Scanner(fileContent.substring(fileContent.indexOf(linhaAtual) + linhaAtual.length()));
            
                p2 = Pattern.compile(er2, Pattern.DOTALL);
                
                while(ler2.hasNextLine() && next == 0){
                    //System.out.println(linha);
                    linha = ler2.nextLine();
                    m2 = p2.matcher(linha);
                    m1 = p1.matcher(linha);
                   
                    if(m2.find()){
                        //System.out.println("-----------------------------------------2");
                        
                        p3 = Pattern.compile(er3, Pattern.DOTALL);
                                
                        while(ler1.hasNextLine() && next == 0){
                            //System.out.println(linha);
                            
                            linha = ler1.nextLine();
                            m3 = p3.matcher(linha);
                            
                            if (m3.find()) {
                                //System.out.println("-----------------------------------------3");
                                resultado += m3.group(1) + "\n";
                                
                                if(counter == 2){
                                    ler1.close();
                                    ler2.close();
                                    return resultado;
                                    
                                }else{
                                    counter++;
                                    next = 1;
                                    
                                }
                            }
                        }
                        
                    }else if(m1.find()){
                        next = 1;
                    }
                }
            }
        }
        
        return "Nao definido";
                        
    }

    public static void obras_preco(String nomeAutor) throws IOException {

    }

    public static void obras_editora(String nomeAutor) throws IOException {

    }

    public static void obras_fotoCapa(String nomeAutor) throws IOException {

    }

}
