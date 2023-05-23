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
            x = new Element("premio").addContent("Participacao");
            subPai.addContent(x);
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

            x = new Element("titulo").addContent(titulo[i]);
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
/*

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
