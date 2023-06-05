xquery version "1.0";

<dadosAutor>{
	let $obras := doc("C:/Users/rodrf/Desktop/2_Ano/2_Semestre/ID/Trab_ID/TrabalhoPraticoID/ID_TP/obras.xml")//livros/livro
	let $precoMin := min($obras/preco)
	return $obras[preco = $precoMin]				
}</dadosAutor>
