xquery version "1.0";

declare variable $autores := doc("C:/Users/luist/Desktop/ISEC/ano2_EngInformatica/Semestre2/ID/TrabalhoPratico/ID_TP/escritores.xml")//autores/autor;

declare variable $idMax := max($autores/@id);

<html>
	<head>
		<title>Autores</title>
		<style>
			{
				"table {",
				"  border-collapse: collapse;",
				"  width: 100%;",
				"}",
				"th, td {",
				"  border: 1px solid black;",
				"  padding: 8px;",
				"  text-align: left;",
				"}",
				"tr:nth-child(even) {",
				"  background-color: #f2f2f2;",
				"}"
			}
		</style>
	</head>
	<body>
		<h1>Lista de Autores</h1>
		<table>
		<tr>
			<th>Nome do Autor</th>
			<th>Foto</th>
		</tr>
		<tr>
			<td>{data($autores[@id = $idMax]/@nome)}</td>
			<td><img src="{concat('https:', data($autores[@id = $idMax]/fotografia))}" alt="Foto de {data($autores[@id = $idMax]/@nome)}" width="250" height="auto"/></td>
		</tr>
		</table>
	</body>
</html>
