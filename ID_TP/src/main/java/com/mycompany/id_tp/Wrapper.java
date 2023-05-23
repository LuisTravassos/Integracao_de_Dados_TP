package com.mycompany.id_tp;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.sf.saxon.s9api.SaxonApiException;
import net.sf.saxon.s9api.XdmValue;
import org.jdom2.Document;
import org.jdom2.Element;

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
        String er2 = "<a[^>]+>([^<]+)</a>";

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
        String er1 = "class=\"image\"\\stitle=\"[^\"]+\"><img alt=\"\"\\ssrc=\"([^\"]+)\"";

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

                        for (int i = 0; i < temp.length; i++) {
                            m = p.matcher(temp[i]);

                            if (m.find()) {
                                resultado += m.group(1) + "#";
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
        String er2 = "\"[^\"]+\">([^<]+)</a>";

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
                        String[] temp = linha.split("=");

                        for (int i = 0; i < temp.length; i++) {
                            m = p.matcher(temp[i]);

                            if (m.find()) {
                                resultado += m.group(1) + "#";
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

    public static String obras_ISBN(String nomeAutor, int quant) throws IOException {

        String link = "https://www.bertrand.pt/pesquisa/";
        String nome = nomeAutor.replace(" ", "+");
        HttpRequestFunctions.httpRequest1(link, nome, "bert.html");

        String fileContent = Files.readString(Path.of("bert.html"));
        Scanner ler1 = new Scanner(fileContent);
        Scanner ler2 = new Scanner(fileContent);

        String er = "<div class=\"cover\">";
        String er2 = "/autor[^\"]+\">" + nomeAutor + "<";
        String er3 = "href=\"(/livro/[^\"]+)\"";
        String er4 = ",\"isbn\":\"([^\"]+)\",";

        Pattern p1 = Pattern.compile(er), p2, p3, p4;
        Matcher m1, m2, m3, m4;
        String linha, resultado = "";

        int next, counter = 0;

        while (ler1.hasNextLine()) {
            next = 0;

            linha = ler1.nextLine();
            m1 = p1.matcher(linha);

            if (m1.find()) {
                //System.out.println("-----------------------------------------1");
                String linhaAtual = ler1.nextLine();
                ler2 = new Scanner(fileContent.substring(fileContent.indexOf(linhaAtual) + linhaAtual.length()));

                p2 = Pattern.compile(er2, Pattern.DOTALL);

                while (ler2.hasNextLine() && next == 0) {
                    //System.out.println(linha);
                    linha = ler2.nextLine();
                    m2 = p2.matcher(linha);
                    m1 = p1.matcher(linha);

                    if (m2.find()) {
                        //System.out.println("-----------------------------------------2");

                        p3 = Pattern.compile(er3, Pattern.DOTALL);

                        while (ler1.hasNextLine() && next == 0) {
                            //System.out.println(linha);

                            linha = ler1.nextLine();
                            m3 = p3.matcher(linha);

                            if (m3.find()) {
                                //System.out.println("-----------------------------------------3");

                                String link2 = "https://www.bertrand.pt" + m3.group(1);
                                HttpRequestFunctions.httpRequest1(link2, "", "bertBook.html");

                                String fileContent2 = Files.readString(Path.of("bertBook.html"));
                                Scanner ler3 = new Scanner(fileContent2);

                                p4 = Pattern.compile(er4, Pattern.DOTALL);

                                while (ler3.hasNextLine()) {
                                    linha = ler3.nextLine();
                                    m4 = p4.matcher(linha);
                                    if (m4.find()) {
                                        resultado += m4.group(1) + "#";
                                    }
                                }

                                if (counter == quant) {
                                    ler1.close();
                                    ler2.close();
                                    return resultado;

                                } else {
                                    counter++;
                                    next = 1;

                                }
                            }
                        }

                    } else if (m1.find()) {
                        next = 1;
                    }
                }
            }
        }

        return "Nao definido";

    }

    public static String obras_nomeAutor(String nomeAutor, int quant) throws IOException {
        String link = "https://www.bertrand.pt/pesquisa/";
        String nome = nomeAutor.replace(" ", "+");
        HttpRequestFunctions.httpRequest1(link, nome, "bert.html");

        String fileContent = Files.readString(Path.of("bert.html"));
        Scanner ler1 = new Scanner(fileContent);
        Scanner ler2 = new Scanner(fileContent);

        String er = "<div class=\"cover\">";
        String er2 = "/autor[^\"]+\">" + nomeAutor + "<";
        String er3 = "/autor[^\"]+\">([^<]+)<";

        Pattern p1 = Pattern.compile(er), p2, p3;
        Matcher m1, m2, m3;
        String linha, resultado = "";

        int next, counter = 0;

        while (ler1.hasNextLine()) {
            next = 0;

            linha = ler1.nextLine();
            m1 = p1.matcher(linha);

            if (m1.find()) {
                //System.out.println("-----------------------------------------1");
                String linhaAtual = ler1.nextLine();
                ler2 = new Scanner(fileContent.substring(fileContent.indexOf(linhaAtual) + linhaAtual.length()));

                p2 = Pattern.compile(er2, Pattern.DOTALL);

                while (ler2.hasNextLine() && next == 0) {
                    //System.out.println(linha);
                    linha = ler2.nextLine();
                    m2 = p2.matcher(linha);
                    m1 = p1.matcher(linha);

                    if (m2.find()) {
                        //System.out.println("-----------------------------------------2");

                        p3 = Pattern.compile(er3, Pattern.DOTALL);

                        while (ler1.hasNextLine() && next == 0) {
                            //System.out.println(linha);

                            linha = ler1.nextLine();
                            m3 = p3.matcher(linha);

                            if (m3.find()) {
                                //System.out.println("-----------------------------------------3");

                                String[] temp = linha.split("=");

                                for (int i = 0; i < temp.length; i++) {
                                    m3 = p3.matcher(temp[i]);

                                    if (m3.find()) {
                                        resultado += m3.group(1) + "/";
                                    }
                                }

                                resultado += "#";

                                //resultado += m3.group(1) + "\n";
                                if (counter == quant) {
                                    ler1.close();
                                    ler2.close();
                                    return resultado;

                                } else {
                                    counter++;
                                    next = 1;

                                }
                            }
                        }

                    } else if (m1.find()) {
                        next = 1;
                    }
                }
            }
        }

        return "Nao definido";

    }

    public static String obras_titulo(String nomeAutor, int quant) throws IOException {

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

        while (ler1.hasNextLine()) {
            next = 0;

            linha = ler1.nextLine();
            m1 = p1.matcher(linha);

            if (m1.find()) {
                //System.out.println("-----------------------------------------1");
                String linhaAtual = ler1.nextLine();
                ler2 = new Scanner(fileContent.substring(fileContent.indexOf(linhaAtual) + linhaAtual.length()));

                p2 = Pattern.compile(er2, Pattern.DOTALL);

                while (ler2.hasNextLine() && next == 0) {
                    //System.out.println(linha);
                    linha = ler2.nextLine();
                    m2 = p2.matcher(linha);
                    m1 = p1.matcher(linha);

                    if (m2.find()) {
                        //System.out.println("-----------------------------------------2");

                        p3 = Pattern.compile(er3, Pattern.DOTALL);

                        while (ler1.hasNextLine() && next == 0) {
                            //System.out.println(linha);

                            linha = ler1.nextLine();
                            m3 = p3.matcher(linha);

                            if (m3.find()) {
                                //System.out.println("-----------------------------------------3");

                                resultado += m3.group(1) + "#";

                                if (counter == quant) {
                                    ler1.close();
                                    ler2.close();
                                    return resultado;

                                } else {
                                    counter++;
                                    next = 1;

                                }
                            }
                        }

                    } else if (m1.find()) {
                        next = 1;
                    }
                }
            }
        }

        return "Nao definido";

    }

    public static String obras_preco(String nomeAutor, int quant) throws IOException {

        String link = "https://www.bertrand.pt/pesquisa/";
        String nome = nomeAutor.replace(" ", "+");
        HttpRequestFunctions.httpRequest1(link, nome, "bert.html");

        String fileContent = Files.readString(Path.of("bert.html"));
        Scanner ler1 = new Scanner(fileContent);
        Scanner ler2 = new Scanner(fileContent);

        String er = "<div class=\"cover\">";
        String er2 = "/autor[^\"]+\">" + nomeAutor + "<";
        String er3 = "data-price=\"([^\"]+)\"";

        Pattern p1 = Pattern.compile(er), p2, p3;
        Matcher m1, m2, m3;
        String linha, resultado = "";

        int next, counter = 0;

        while (ler1.hasNextLine()) {
            next = 0;

            linha = ler1.nextLine();
            m1 = p1.matcher(linha);

            if (m1.find()) {
                //System.out.println("-----------------------------------------1");
                String linhaAtual = ler1.nextLine();
                ler2 = new Scanner(fileContent.substring(fileContent.indexOf(linhaAtual) + linhaAtual.length()));

                p2 = Pattern.compile(er2, Pattern.DOTALL);

                while (ler2.hasNextLine() && next == 0) {
                    //System.out.println(linha);
                    linha = ler2.nextLine();
                    m2 = p2.matcher(linha);
                    m1 = p1.matcher(linha);

                    if (m2.find()) {
                        //System.out.println("-----------------------------------------2");

                        p3 = Pattern.compile(er3, Pattern.DOTALL);

                        while (ler1.hasNextLine() && next == 0) {
                            //System.out.println(linha);

                            linha = ler1.nextLine();
                            m3 = p3.matcher(linha);

                            if (m3.find()) {
                                //System.out.println("-----------------------------------------3");

                                resultado += m3.group(1) + "#";

                                if (counter == quant) {
                                    ler1.close();
                                    ler2.close();
                                    return resultado;

                                } else {
                                    counter++;
                                    next = 1;

                                }
                            }
                        }

                    } else if (m1.find()) {
                        next = 1;
                    }
                }
            }
        }

        return "Nao definido";

    }

    public static String obras_editora(String nomeAutor, int quant) throws IOException {

        String link = "https://www.bertrand.pt/pesquisa/";
        String nome = nomeAutor.replace(" ", "+");
        HttpRequestFunctions.httpRequest1(link, nome, "bert.html");

        String fileContent = Files.readString(Path.of("bert.html"));
        Scanner ler1 = new Scanner(fileContent);
        Scanner ler2 = new Scanner(fileContent);

        String er = "<div class=\"cover\">";
        String er2 = "/autor[^\"]+\">" + nomeAutor + "<";
        String er3 = "data-brand=\"([^\"]+)\"";

        Pattern p1 = Pattern.compile(er), p2, p3;
        Matcher m1, m2, m3;
        String linha, resultado = "";

        int next, counter = 0;

        while (ler1.hasNextLine()) {
            next = 0;

            linha = ler1.nextLine();
            m1 = p1.matcher(linha);

            if (m1.find()) {
                //System.out.println("-----------------------------------------1");
                String linhaAtual = ler1.nextLine();
                ler2 = new Scanner(fileContent.substring(fileContent.indexOf(linhaAtual) + linhaAtual.length()));

                p2 = Pattern.compile(er2, Pattern.DOTALL);

                while (ler2.hasNextLine() && next == 0) {
                    //System.out.println(linha);
                    linha = ler2.nextLine();
                    m2 = p2.matcher(linha);
                    m1 = p1.matcher(linha);

                    if (m2.find()) {
                        //System.out.println("-----------------------------------------2");

                        p3 = Pattern.compile(er3, Pattern.DOTALL);

                        while (ler1.hasNextLine() && next == 0) {
                            //System.out.println(linha);

                            linha = ler1.nextLine();
                            m3 = p3.matcher(linha);

                            if (m3.find()) {
                                //System.out.println("-----------------------------------------3");

                                resultado += m3.group(1) + "#";

                                if (counter == quant) {
                                    ler1.close();
                                    ler2.close();
                                    return resultado;

                                } else {
                                    counter++;
                                    next = 1;

                                }
                            }
                        }

                    } else if (m1.find()) {
                        next = 1;
                    }
                }
            }
        }

        return "Nao definido";

    }

    public static String obras_fotoCapa(String nomeAutor, int quant) throws IOException {

        String link = "https://www.bertrand.pt/pesquisa/";
        String nome = nomeAutor.replace(" ", "+");
        HttpRequestFunctions.httpRequest1(link, nome, "bert.html");

        String fileContent = Files.readString(Path.of("bert.html"));
        Scanner ler1 = new Scanner(fileContent);
        Scanner ler2 = new Scanner(fileContent);

        String er = "<div class=\"cover\">";
        String er2 = "/autor[^\"]+\">" + nomeAutor + "<";
        String er3 = "href=\"(/livro/[^\"]+)\"";
        String er4 = "data-srcset=\"([^\"]+\")";

        Pattern p1 = Pattern.compile(er), p2, p3, p4;
        Matcher m1, m2, m3, m4;
        String linha, resultado = "";

        int next, counter = 0;

        while (ler1.hasNextLine()) {
            next = 0;

            linha = ler1.nextLine();
            m1 = p1.matcher(linha);

            if (m1.find()) {
                //System.out.println("-----------------------------------------1");
                String linhaAtual = ler1.nextLine();
                ler2 = new Scanner(fileContent.substring(fileContent.indexOf(linhaAtual) + linhaAtual.length()));

                p2 = Pattern.compile(er2, Pattern.DOTALL);

                while (ler2.hasNextLine() && next == 0) {
                    //System.out.println(linha);
                    linha = ler2.nextLine();
                    m2 = p2.matcher(linha);
                    m1 = p1.matcher(linha);

                    if (m2.find()) {
                        //System.out.println("-----------------------------------------2");

                        p3 = Pattern.compile(er3, Pattern.DOTALL);

                        while (ler1.hasNextLine() && next == 0) {
                            //System.out.println(linha);

                            linha = ler1.nextLine();
                            m3 = p3.matcher(linha);

                            if (m3.find()) {
                                //System.out.println("-----------------------------------------3");

                                String link2 = "https://www.bertrand.pt/" + m3.group(1);
                                HttpRequestFunctions.httpRequest1(link2, "", "bertBook.html");

                                String fileContent2 = Files.readString(Path.of("bertBook.html"));
                                Scanner ler3 = new Scanner(fileContent2);

                                p4 = Pattern.compile(er4, Pattern.DOTALL);

                                while (ler3.hasNextLine() && next == 0) {
                                    linha = ler3.nextLine();
                                    m4 = p4.matcher(linha);
                                    if (m4.find()) {
                                        resultado += m4.group(1) + "#";
                                        next = 1;
                                    }
                                }

                                if (counter == quant) {
                                    ler1.close();
                                    ler2.close();
                                    return resultado;

                                } else {
                                    counter++;
                                    next = 1;

                                }
                            }
                        }

                    } else if (m1.find()) {
                        next = 1;
                    }
                }
            }
        }

        return "Nao definido";

    }

    public static Autor criaAutor(String nomeAutor) throws IOException, SaxonApiException {
        String xp = "//autor[@nome='" + nomeAutor + "']";
        XdmValue res = null;
        res = XPathFunctions.executaXpath(xp, "escritores.xml");

        Document doc = XMLJDomFunctions.lerDocumentoXML("escritores.xml");
        Element raiz;
        int maxID = 1;

        if (doc == null) {
            maxID = 1;

        } else {
            raiz = doc.getRootElement();

            List todosAutores = raiz.getChildren("autor");

            for (int i = 0; i < todosAutores.size(); i++) {
                Element autor = (Element) todosAutores.get(i); //obtem livro i da Lista 

                if (maxID <= Integer.parseInt(autor.getAttributeValue("id"))) {
                    maxID = 1 + Integer.parseInt(autor.getAttributeValue("id"));
                }
            }
        }
        
        if (res == null || res.size() == 0) { //Livro não existe
            int id = maxID;
            String nome = Wrapper.autor_nome(nomeAutor);
            String dataNasc = Wrapper.autor_dataNascimento(nomeAutor);
            String dataMort = Wrapper.autor_DataMorte(nomeAutor);
            String nacional = Wrapper.autor_nacionalidade(nomeAutor);
            String fotografia = Wrapper.autor_fotografia(nomeAutor);
            String generoLiter = Wrapper.autor_generoLiterario(nomeAutor);
            String ocupacoes = Wrapper.autor_ocupacoes(nomeAutor);

            Autor x = new Autor(id, nome, dataNasc, dataMort, nacional, fotografia, generoLiter, ocupacoes);
            return x;
        }

        return null;
    }

    public static Livro criaLivro(String nomeAutor, int idAutor, int quant) throws IOException {
        String isbn = Wrapper.obras_ISBN(nomeAutor, quant);
        String nomeAu = Wrapper.obras_nomeAutor(nomeAutor, quant);
        String titulo = Wrapper.obras_titulo(nomeAutor, quant);
        String editora = Wrapper.obras_editora(nomeAutor, quant);
        String preco = Wrapper.obras_preco(nomeAutor, quant);
        String fotoCapa = Wrapper.obras_fotoCapa(nomeAutor, quant);

        Livro x = new Livro(idAutor, isbn, nomeAu, titulo, editora, preco, fotoCapa);
        return x;
    }

}
