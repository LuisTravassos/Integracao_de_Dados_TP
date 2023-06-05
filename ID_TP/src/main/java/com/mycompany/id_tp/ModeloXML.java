package com.mycompany.id_tp;

import java.util.List;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class ModeloXML {
    
    public static Document addtitulo(String titulo, Document doc){
        Element raiz;

        if (doc == null) {
            raiz = new Element("titulo"); //cria <titulo>...</titulo>
            doc = new Document(raiz);
        } else {
            raiz = doc.getRootElement();
        }
        raiz.addContent(titulo);
        return doc;
    }

    public static Document adicionaAutor(Autor aut, Document doc) {
        Element raiz;

        if (doc == null) {
            raiz = new Element("autores"); //cria <catalogo>...</catalogo>
            doc = new Document(raiz);
        } else {
            raiz = doc.getRootElement();
        }

        Element pai = new Element("autor");
        Attribute a = new Attribute("nome", aut.getNome());
        pai.setAttribute(a);

        a = new Attribute("id", Integer.toString(aut.getId()));
        pai.setAttribute(a);

        Element x = new Element("dataNascimento").addContent(aut.getDataNasc());
        pai.addContent(x);

        x = new Element("dataMorte").addContent(aut.getDataMort());
        pai.addContent(x);

        x = new Element("nacionalidade").addContent(aut.getNacional());
        pai.addContent(x);

        x = new Element("fotografia").addContent(aut.getFotografia());
        pai.addContent(x);

        Element subPai = new Element("generosLiterarios");
        List<String> temp = aut.getGeneroLiter();
        for (int i = 0; i < temp.size(); i++) {
            x = new Element("generoLiterario").addContent(temp.get(i));
            subPai.addContent(x);
        }
        pai.addContent(subPai);

        subPai = new Element("ocupacoes");
        temp = aut.getOcupacoes();
        for (int i = 0; i < temp.size(); i++) {
            x = new Element("ocupacao").addContent(temp.get(i));
            subPai.addContent(x);
        }
        pai.addContent(subPai);

        subPai = new Element("premios");
        temp = aut.getPremios();
        for (int i = 0; i < temp.size(); i++) {
            x = new Element("premio").addContent(temp.get(i));
            subPai.addContent(x);
        }
        pai.addContent(subPai);

        raiz.addContent(pai);
        return doc;
    }

    public static Document adicionaLivro(Livro liv, Document doc) {
        Element raiz;

        if (doc == null) {
            raiz = new Element("livros"); //cria <catalogo>...</catalogo>
            doc = new Document(raiz);
        } else {
            raiz = doc.getRootElement();
        }

        Element pai = new Element("livro");
        Attribute a = new Attribute("isbn", liv.getIsbn());
        pai.setAttribute(a);
        a = new Attribute("idAutor", String.valueOf(liv.getIdAutor()));
        pai.setAttribute(a);
        
        Element x;
        Element subPai = new Element("nomesAutores");
        List<String> temp = liv.getNomeAutor();
        for (int i = 0; i < temp.size(); i++) {
            x = new Element("nomeAutor").addContent(temp.get(i));
            subPai.addContent(x);
        }
        pai.addContent(subPai);

        x = new Element("titulo").addContent(liv.getTitulo());
        pai.addContent(x);

        x = new Element("editora").addContent(liv.getEditora());
        pai.addContent(x);

        x = new Element("preco").addContent(liv.getPreco());
        pai.addContent(x);

        x = new Element("fotoCapa").addContent(liv.getFotoCapa());
        pai.addContent(x);

        raiz.addContent(pai);
        return doc;
    }

    public static Document removeEscritor(String id, Document doc) {
        Element raiz;
        if (doc == null) {
            System.out.println("Ficheiro nao existe - nao dá para remover informação");
            return null;
        } else {
            raiz = doc.getRootElement();
        }

        List todosEscritores = raiz.getChildren("autor");
        boolean found = false;

        for (int i = 0; i < todosEscritores.size(); i++) {
            Element escritor = (Element) todosEscritores.get(i); //obtem livro i da Lista

            if (id.equals(escritor.getAttributeValue("id"))) {
                escritor.getParent().removeContent(escritor);
                System.out.println("Escritor removido com sucesso!");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Escritor com id " + id + " não foi encontrado");
            return null;
        }
        return doc;
    }

    public static Document removeObras(String id, Document doc) {
        Element raiz;
        if (doc == null) {
            System.out.println("Ficheiro nao existe - nao dá para remover informação");
            return null;
        } else {
            raiz = doc.getRootElement();
        }

        List todasObras = raiz.getChildren("livro");
        boolean found = false;

        for (int i = 0; i < todasObras.size(); i++) {
            Element obras = (Element) todasObras.get(i); //obtem livro i da Lista

            if (id.equals(obras.getAttributeValue("idAutor"))) {
                obras.getParent().removeContent(obras);
                System.out.println("Obra removido com sucesso!");
                found = true;
                i--;
            }
        }
        if (!found) {
            System.out.println("Obra com idAutor " + id + " não foi encontrado");
            return null;
        }
        return doc;
    }

    public static Document removeElementEscritor(String id, String ele, String value, Document doc) {
        Element raiz;
        if (doc == null) {
            System.out.println("Ficheiro nao existe - nao dá para remover informação");
            return null;
        } else {
            raiz = doc.getRootElement();
        }

        List todosEscritores = raiz.getChildren("autor");
        boolean found = false;

        for (int i = 0; i < todosEscritores.size(); i++) {
            Element escritor = (Element) todosEscritores.get(i); //obtem escritor i da Lista

            if (id.equals(escritor.getAttributeValue("id"))) {
                List Elem = escritor.getChildren(ele);
                Element p = (Element) Elem.get(0);

                if (!p.getChildren().isEmpty()) {
                    Elem = p.getChildren();
                }

                for (int j = 0; j < Elem.size(); j++) {
                    p = (Element) Elem.get(j);

                    if (p.getValue().equals(value)) {
                        p.getParent().removeContent(p);
                        found = true;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("Dados não encontrados");
            return null;
        }
        return doc;
    }

    public static Document adicionaElementEscritor(String id, String ele, String value, Document doc) {
        Element raiz;
        Element x;
        String helper;

        if (doc == null) {
            System.out.println("Ficheiro nao existe - nao dá para remover informação");
            return null;
        } else {
            raiz = doc.getRootElement();
        }

        List todosEscritores = raiz.getChildren("autor");
        boolean found = false;

        for (int i = 0; i < todosEscritores.size(); i++) {
            Element escritor = (Element) todosEscritores.get(i); //obtem escritor i da Lista

            if (id.equals(escritor.getAttributeValue("id"))) {
                List Elem = escritor.getChildren(ele);

                if (!Elem.isEmpty()) {
                    Element p = (Element) Elem.get(0);

                    if (!p.getChildren().isEmpty()) {
                        Elem = p.getChildren();
                        Element a = (Element) Elem.get(0);
                        helper = a.getName();

                        x = new Element(helper).addContent(value);
                        p.addContent(x);
                    } else {
                        x = new Element(ele).addContent(value);
                        escritor.addContent(x);
                    }
                } else {
                    x = new Element(ele).addContent(value);
                    escritor.addContent(x);
                }
            }
        }
        return doc;
    }

    public static Document alteraElementEscritor(String id, String ele, String valueSearch, String valueAlter, Document doc) {
        Element raiz;
        if (doc == null) {
            System.out.println("Ficheiro nao existe - nao dá para remover informação");
            return null;
        } else {
            raiz = doc.getRootElement();
        }

        List todosEscritores = raiz.getChildren("autor");
        boolean found = false;

        for (int i = 0; i < todosEscritores.size(); i++) {
            Element escritor = (Element) todosEscritores.get(i); //obtem escritor i da Lista

            if (id.equals(escritor.getAttributeValue("id"))) {
                List Elem = escritor.getChildren(ele);
                Element p = (Element) Elem.get(0);

                if (!p.getChildren().isEmpty()) {
                    Elem = p.getChildren();
                }

                for (int j = 0; j < Elem.size(); j++) {
                    p = (Element) Elem.get(j);

                    if (p.getValue().equals(valueSearch)) {
                        p.removeContent();
                        p.addContent(valueAlter);
                        found = true;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("Dados não encontrados");
            return null;
        }
        return doc;
    }
}

