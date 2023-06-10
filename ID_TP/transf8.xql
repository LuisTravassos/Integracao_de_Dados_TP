xquery version "1.0";

declare variable $obras := doc("C:/Users/luist/Desktop/ISEC/ano2_EngInformatica/Semestre2/ID/TrabalhoPratico/ID_TP/obras.xml")//livros/livro;

let $precoMin := min($obras/preco)
let $obra := $obras[preco = $precoMin]
return
  concat("ISBN: ", $obra/@isbn, "&#10;",
         "Autor: ", $obra/nomesAutores/nomeAutor, "&#10;",
         "Título: ", $obra/titulo, "&#10;",
         "Editora: ", $obra/editora, "&#10;",
         "Preço: ", $obra/preco)
