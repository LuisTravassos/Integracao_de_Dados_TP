<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  
  <xsl:template match="/">
    <html>
      <head>
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
        <table>
          <tr>
            <th>Nome</th>
            <th>Fotografia</th>
          </tr>
          <xsl:apply-templates select="autores/autor"/>
        </table>
      </body>
    </html>
  </xsl:template>
  
  <xsl:template match="autor">
    <tr>
      <td>
        <xsl:value-of select="@nome"/>
      </td>
      <td>
        <img src="{concat('https:', fotografia)}" width="100"/>
      </td>
    </tr>
  </xsl:template>
  
</xsl:stylesheet>
