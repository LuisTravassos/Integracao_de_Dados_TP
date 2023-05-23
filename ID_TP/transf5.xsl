<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:template match="/">
    <xsl:apply-templates select="livros/livro"/>
  </xsl:template>

  <xsl:template match="livro">
    <xsl:variable name="id" select="@idAutor"/>
    <xsl:variable name="autor" select="/autores/autor[@id=$id]"/>

    <livro>
      <xsl:copy-of select="@isbn"/>
      <autores>
        <xsl:apply-templates select="$autor"/>
      </autores>
      <xsl:copy-of select="titulo"/>
      <xsl:copy-of select="editora"/>
      <xsl:copy-of select="preco"/>
      <xsl:copy-of select="fotoCapa"/>
    </livro>
  </xsl:template>

  <xsl:template match="autor">
    <xsl:copy>
      <xsl:copy-of select="@nome"/>
      <xsl:copy-of select="dataNascimento"/>
      <xsl:copy-of select="dataMorte"/>
      <xsl:copy-of select="nacionalidade"/>
      <xsl:copy-of select="fotografia"/>
      <xsl:copy-of select="generosLiterarios"/>
      <xsl:copy-of select="ocupacoes"/>
      <xsl:copy-of select="premios"/>
    </xsl:copy>
  </xsl:template>

</xsl:stylesheet>
