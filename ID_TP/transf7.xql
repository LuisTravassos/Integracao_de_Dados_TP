xquery version "1.0";

<dadosAutor>{
	let $autores := doc("C:/Users/rodrf/Desktop/2_Ano/2_Semestre/ID/Trab_ID/TrabalhoPraticoID/ID_TP/escritores.xml")//autores/autor
	let $idMax := max($autores/@id)
	return $autores[@id = $idMax]				
}</dadosAutor>
