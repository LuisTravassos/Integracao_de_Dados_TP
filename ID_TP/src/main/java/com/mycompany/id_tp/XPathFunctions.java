package com.mycompany.id_tp;

import java.io.File;
import java.util.List;
import net.sf.saxon.s9api.DocumentBuilder;
import net.sf.saxon.s9api.Processor;
import net.sf.saxon.s9api.SaxonApiException;
import net.sf.saxon.s9api.XPathCompiler;
import net.sf.saxon.s9api.XPathSelector;
import net.sf.saxon.s9api.XdmItem;
import net.sf.saxon.s9api.XdmNode;
import net.sf.saxon.s9api.XdmValue;

/**
 *
 * @author abs
 */
public class XPathFunctions {

    static XdmValue executaXpath(String xp, String xmlFile) throws SaxonApiException {
        XdmValue resultado = null;
        File f = new File(xmlFile);
        if (f.exists()) {
            Processor proc = new Processor(false);
            XPathCompiler xpath = proc.newXPathCompiler();

            DocumentBuilder builder = proc.newDocumentBuilder();

            XdmNode xml = builder.build(new File(xmlFile));
            XPathSelector selector = xpath.compile(xp).load();

            selector.setContextItem(xml);
            resultado = selector.evaluate();
        }
        return resultado;
    }
    
    static String listaResultado2(XdmValue lista) {
        String result = "";
        if (lista != null) {
            StringBuilder texto = new StringBuilder();
            //System.out.println("RESULTADO DA PESQUISA XPATH:");
            for (XdmItem item : lista) {
                texto = texto.append(item.getStringValue());
                result += texto.toString().replace("\n", "") + "\n";
                result += "\n";
            }
            return result;
        }
        else
            return "Ficheiro XML não existe";

    }

    static String listaResultado1(XdmValue lista) {
        if (lista != null) {
            StringBuilder texto = new StringBuilder();
            //System.out.println("RESULTADO DA PESQUISA XPATH:");
            for (XdmItem item : lista) {
                texto = texto.append(item.getStringValue()).append("\n");
            }
            return texto.toString();
        }
        else
            return "Ficheiro XML não existe";

    }
    
    static String listaResultado(XdmValue lista) {
        if (lista != null) {
            StringBuilder texto = new StringBuilder();
            //System.out.println("RESULTADO DA PESQUISA XPATH:");
            for (XdmItem item : lista) {
                texto = texto.append(item).append("\n");
            }
            return texto.toString();
        }
        else
            return "Ficheiro XML não existe";

    }

}
