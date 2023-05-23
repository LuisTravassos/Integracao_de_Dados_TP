<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  
  <xsl:param name="autor"></xsl:param>
  
  <xsl:template match="/">
    <html>
      <head>
        <title>Fotos das Capas dos Livros</title>
        <style>
          table {
            border-collapse: collapse;
            width: 100%;
            margin-left: auto;
            margin-right: auto;
          }
          th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: center;
          }
          th {
            background-color: lightgray;
          }
        </style>
      </head>
      <body>
        <h1>Fotos das Capas dos Livros de <xsl:value-of select="$autor"/></h1>
        <table>
          <xsl:apply-templates select="livros/livro[nomesAutores/nomeAutor=$autor]"/>
        </table>
      </body>
    </html>
  </xsl:template>
  
  <xsl:template match="livro">
    <tr>
      <td>
        <img src="{fotoCapa}" alt="{titulo}" />
      </td>
    </tr>
  </xsl:template>
  
</xsl:stylesheet>
