xquery version "1.0";

<escritoresobras>{
  let $autores := doc("C:/Users/luist/Desktop/ISEC/ano2_EngInformatica/Semestre2/ID/TrabalhoPratico/ID_TP/escritores.xml")//autores/autor
  let $livros := doc("C:/Users/luist/Desktop/ISEC/ano2_EngInformatica/Semestre2/ID/TrabalhoPratico/ID_TP/obras.xml")//livros/livro

  for $autor in $autores
  let $idAutor := $autor/@id
  let $obrasAutor := $livros[@idAutor = $idAutor]
  
  return ($autor, $obrasAutor)
}
</escritoresobras>
