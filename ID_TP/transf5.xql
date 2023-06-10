xquery version "1.0";

<escritoresobras>{
	(:let $autores := doc("C:/Users/rodrf/Desktop/2_Ano/2_Semestre/ID/Trab_ID/TrabalhoPraticoID/ID_TP/escritores.xml")//autores/autor:)
	(:let $livros := doc("C:/Users/rodrf/Desktop/2_Ano/2_Semestre/ID/Trab_ID/TrabalhoPraticoID/ID_TP/obras.xml")//livros/livro:)
	
	let $autores := doc("C:/Users/luist/Desktop/ISEC/ano2_EngInformatica/Semestre2/ID/TrabalhoPratico/ID_TP/escritores.xml")//autores/autor
	let $livros := doc("C:/Users/luist/Desktop/ISEC/ano2_EngInformatica/Semestre2/ID/TrabalhoPratico/ID_TP/obras.xml")//livros/livro

	for $autor in $autores
		let $idAutor := $autor/@id
		let $obrasAutor := $livros[@idAutor = $idAutor]

		return 
			<autor>
				<nome>{$autor/@id,data($autor/@nome)}</nome>
				
				<livros>{
					for $obr in $obrasAutor
					return
						<livro>
								<titulo>{$obr/titulo/text()}</titulo>
								<editora>{$obr/editora/text()}</editora>
								<preco>{$obr/preco/text()}</preco>
						</livro>
				}</livros>
			</autor>
}</escritoresobras>
