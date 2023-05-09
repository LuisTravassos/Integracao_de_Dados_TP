package com.mycompany.id_tp;

import java.util.List;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class ModeloXML {

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
        String[] temp = aut.getGeneroLiter().split("#");
        for (int i = 0; i < temp.length; i++) {
            x = new Element("generoLiterario").addContent(temp[i]);
            subPai.addContent(x);
        }
        pai.addContent(subPai);

        subPai = new Element("ocupacoes");
        temp = aut.getOcupacoes().split("#");
        for (int i = 0; i < temp.length; i++) {
            x = new Element("ocupacao").addContent(temp[i]);
            subPai.addContent(x);
        }
        pai.addContent(subPai);
        
        subPai = new Element("premios");
        //temp = aut.getOcupacoes().split("#");
        //for (int i = 0; i < temp.length; i++) {
            x = new Element("premio");
            subPai.addContent(x);
        //}
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

        String[] isbn = liv.getIsbn().split("#");
        String[] nomeAutor = liv.getNomeAutor().split("#");
        String[] titulo = liv.getTitulo().split("#");
        String[] editora = liv.getEditora().split("#");
        String[] preco = liv.getPreco().split("#");
        String[] fotoCapa = liv.getFotoCapa().split("#");

        for (int i = 0; i < isbn.length; i++) {
            Element pai = new Element("livro");
            Attribute a = new Attribute("isbn", isbn[i]);
            pai.setAttribute(a);
            a = new Attribute("idAutor", Integer.toString(liv.getIdAutor()));
            pai.setAttribute(a);

            Element x;
            
            Element subPai = new Element("nomesAutores");
            String[] temp = nomeAutor[i].split("/");
            for (int j = 0; j < temp.length; j++) {
                x = new Element("nomeAutor").addContent(temp[j]);
                subPai.addContent(x);
            }
            pai.addContent(subPai);

            x = new Element("titulo", titulo[i]);
            pai.addContent(x);

            x = new Element("editora").addContent(editora[i]);
            pai.addContent(x);

            x = new Element("preco").addContent(preco[i]);
            pai.addContent(x);

            x = new Element("fotoCapa").addContent(fotoCapa[i]);
            pai.addContent(x);

            raiz.addContent(pai);
        }
        return doc;
    }
}
/*
    public static Document removeLivroAutor(String procura, Document doc) {
        Element raiz;
        if (doc == null) {
            System.out.println("Ficheiro nao existe - nao dá para remover informação");
            return null;
        } else {
            raiz = doc.getRootElement();
        }
        List todosLivros = raiz.getChildren("livro");
        boolean found = false;
        for (int i = 0; i < todosLivros.size(); i++) {
            Element livro = (Element) todosLivros.get(i); //obtem livro i da Lista 
            if (livro.getChild("autor").getText().contains(procura)) {
                livro.getParent().removeContent(livro);
                System.out.println("Livro removido com sucesso!");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Autor " + procura + " não foi encontrado");
            return null;
        }
        return doc;
    }

    public static Document removeLivroISBN(String isbn, Document doc) {
        Element raiz;
        if (doc == null) {
            System.out.println("Ficheiro nao existe - nao dá para remover informação");
            return null;
        } else {
            raiz = doc.getRootElement();
        }
        List todosLivros = raiz.getChildren("livro");
        boolean found = false;
        for (int i = 0; i < todosLivros.size(); i++) {
            Element livro = (Element) todosLivros.get(i); //obtem livro i da Lista 
            if (livro.getAttributeValue("isbn").equals(isbn)) {
                livro.getParent().removeContent(livro);
                System.out.println("Livro removido com sucesso!");
                found = true;
            }

        }
        if (!found) {
            System.out.println("Autor " + isbn + " não foi encontrado");
            return null;
        }
        return doc;
    }

    public static Document alteraPrecoLivro(String isbn, double novoPreco, String loja, Document doc) {
        Element raiz;
        if (doc == null) {
            System.out.println("Ficheiro nao existe - nao dá para alterar informação");
            return null;
        } else {
            raiz = doc.getRootElement();
        }
        List todosLivros = raiz.getChildren("livro");
        boolean found = false;
        for (int i = 0; i < todosLivros.size(); i++) {
            Element livro = (Element) todosLivros.get(i); //obtem livro i da Lista 
            if (livro.getAttributeValue("isbn").equals(isbn)) {
                String titulo = livro.getChildText("titulo");
                System.out.println("Titulo " + titulo);
                //obtem os dois preços: bertrand e wook    
                List precos = livro.getChildren("preco");
                for (int j = 0; j <precos.size(); j++) {
                    Element p = (Element) precos.get(j); //obtem preço j da Lista 
                    if (p.getAttributeValue("store").equals(loja)) { //loja indicada
                        System.out.println("Preço " + p.getValue());
                        p.setText(String.valueOf(novoPreco));
                    }
                }
                System.out.println("Preço alterado com sucesso!");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Livro " + isbn + " não foi encontrado");
            return null;
        }
        return doc;
    }
    
    
}
 */
