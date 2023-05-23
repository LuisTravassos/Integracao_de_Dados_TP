<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  
  <xsl:template match="/">
    <livros>
      <xsl:apply-templates select="livros/livro">
        <xsl:sort select="preco" data-type="number" order="descending"/>
      </xsl:apply-templates>
    </livros>
  </xsl:template>
  
  <xsl:template match="livro">
    <xsl:if test="position() &lt;= 5">
      <livro>
        <xsl:attribute name="isbn">
          <xsl:value-of select="@isbn"/>
        </xsl:attribute>
        <titulo>
          <xsl:value-of select="titulo"/>
        </titulo>
		<nomesAutores>
          <xsl:apply-templates select="nomesAutores/nomeAutor"/>
        </nomesAutores>
		<editora>
          <xsl:value-of select="editora"/>
        </editora>
		<preco>
          <xsl:value-of select="preco"/>
        </preco>
		<fotoCapa>
          <xsl:value-of select="fotoCapa"/>
        </fotoCapa>
      </livro>
    </xsl:if>
  </xsl:template>
  
  <xsl:template match="nomeAutor">
    <nomeAutor>
      <xsl:value-of select="."/>
    </nomeAutor>
  </xsl:template>
  
</xsl:stylesheet>
