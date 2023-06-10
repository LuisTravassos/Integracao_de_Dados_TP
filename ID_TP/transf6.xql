xquery version "1.0";

<dadosAutor>{
	(:let $autores := doc("C:/Users/rodrf/Desktop/2_Ano/2_Semestre/ID/Trab_ID/TrabalhoPraticoID/ID_TP/escritores.xml")//autores/autor:)
	(:let $livros := doc("C:/Users/rodrf/Desktop/2_Ano/2_Semestre/ID/Trab_ID/TrabalhoPraticoID/ID_TP/obras.xml")//livros/livro:)
	(:let $titulo := doc("C:/Users/rodrf/Desktop/2_Ano/2_Semestre/ID/Trab_ID/TrabalhoPraticoID/ID_TP/titulo.xml")/titulo:)
	
	let $autores := doc("C:/Users/luist/Desktop/ISEC/ano2_EngInformatica/Semestre2/ID/TrabalhoPratico/ID_TP/escritores.xml")//autores/autor
	let $livros := doc("C:/Users/luist/Desktop/ISEC/ano2_EngInformatica/Semestre2/ID/TrabalhoPratico/ID_TP/obras.xml")//livros/livro
	let $titulo := doc("C:/Users/luist/Desktop/ISEC/ano2_EngInformatica/Semestre2/ID/TrabalhoPratico/ID_TP/titulo.xml")/titulo
	
	for $livr in $livros
		let $idObra := $livr/@idAutor
		let $dadosAutor := $autores[@id = $idObra]
	where $livr/titulo = $titulo
		return 
			(for $dad in $dadosAutor
			return ($dad))					
}</dadosAutor>
