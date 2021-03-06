<?xml version="1.0" encoding="UTF-8"?>
<xsl:transform xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
    xmlns:datetime="http://exslt.org/dates-and-times" 
    exclude-result-prefixes="datetime">
  <xsl:param name="reportDir" select="'report'"/>
  <xsl:output method="text" indent="no" encoding="UTF-8" /> 
  <xsl:strip-space elements="*"/>
 
<xsl:template match="Report">
	<xsl:value-of select="Title"/><xsl:text>&#10;</xsl:text>
   <xsl:apply-templates/>      
</xsl:template>

<xsl:template match="Profiles">
Profile Summary
&#9;Name&#9;Signature version&#9;Container version&#9;Started&#9;Finished&#9;Filters
<xsl:for-each select="Profile"><xsl:text>&#9;</xsl:text>
<xsl:value-of select="Name"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="SignatureFileVersion"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="ContainerSignatureFileVersion"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="datetime:format-date(StartDate,'dd MMM yyyy')"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="datetime:format-date(EndDate,'dd MMM yyyy')"/><xsl:text>&#9;</xsl:text>
<xsl:if test="Filter/Enabled = 'true'">
<xsl:if test="count(Filter/Criteria) > 1">
<xsl:if test="Filter/Narrowed = 'true'">(all filter criteria below must be true)&#10;&#9;&#9;&#9;&#9;&#9;&#9;</xsl:if>
<xsl:if test="Filter/Narrowed != 'true'">(any filter criteria below must be true)&#10;&#9;&#9;&#9;&#9;&#9;&#9;</xsl:if>
</xsl:if>
<xsl:for-each select="Filter/Criteria">
<xsl:value-of select="FieldName"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="Operator"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="Value"/><xsl:text>&#10;</xsl:text>
<xsl:text>&#9;&#9;&#9;&#9;&#9;&#9;</xsl:text>
</xsl:for-each>
</xsl:if>
</xsl:for-each>
<xsl:text>&#10;&#10;</xsl:text>
</xsl:template>

<xsl:template match="ReportItems/ReportItem">
<xsl:value-of select="Specification/Description"/>
&#9;Report field&#9;<xsl:value-of select="Specification/Field"/>
<xsl:if test="Specification/GroupByFields != ''">
&#9;Grouping fields&#9;<xsl:for-each select="Specification/GroupByFields/GroupByField">
<xsl:if test="Function != ''"><xsl:value-of select="Function"/><xsl:text>(</xsl:text></xsl:if>
<xsl:value-of select="Field"/>
<xsl:if test="Function != ''"><xsl:text>)</xsl:text></xsl:if>
<xsl:text>&#9;</xsl:text></xsl:for-each>
</xsl:if>
<xsl:if test="Specification/Filter != ''">
<xsl:text>&#10;&#9;Filter fields:&#9;Field&#9;Operator&#9;Value&#9;</xsl:text><xsl:if test="count(Specification/Filter/Criteria) > 1">
<xsl:if test="Specification/Filter/Narrowed = 'true'"><xsl:text>(all filter criteria must be true)</xsl:text></xsl:if>
<xsl:if test="Specification/Filter/Narrowed != 'true'"><xsl:text>(any filter criteria must be true)</xsl:text></xsl:if>
</xsl:if>
<xsl:text>&#10;</xsl:text>
<xsl:for-each select="Specification/Filter/Criteria">
<xsl:text>&#9;&#9;</xsl:text>
<xsl:value-of select="FieldName"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="Operator"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="Value"/><xsl:text>&#10;</xsl:text>
</xsl:for-each></xsl:if>
<xsl:for-each select="Groups/Group">
<xsl:if test="../../Specification/GroupByFields != ''">
<xsl:text>&#10;&#9;Group values:</xsl:text><xsl:for-each select="Values/Value"><xsl:text>&#9;</xsl:text><xsl:value-of select="."/></xsl:for-each>  
</xsl:if>
&#9;Profile&#9;Count&#9;Sum&#9;Min&#9;Max&#9;Average
<xsl:for-each select="ProfileSummaries/ProfileSummary">
<xsl:text>&#9;</xsl:text>
<xsl:value-of select="Name"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="Count"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="Sum"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="Min"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="Max"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="Average"/><xsl:text>&#10;</xsl:text>
</xsl:for-each>&#9;Profile totals&#9;<xsl:value-of select="GroupAggregateSummary/Count"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="GroupAggregateSummary/Sum"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="GroupAggregateSummary/Min"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="GroupAggregateSummary/Max"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="GroupAggregateSummary/Average"/><xsl:text>&#10;</xsl:text>
</xsl:for-each>
<xsl:if test="Specification/GroupByFields != ''">
&#9;Group totals&#9;Count&#9;Sum&#9;Min&#9;Max&#9;Average&#10;&#9;&#9;<xsl:value-of select="ReportItemAggregateSummary/Count"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="ReportItemAggregateSummary/Sum"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="ReportItemAggregateSummary/Min"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="ReportItemAggregateSummary/Max"/><xsl:text>&#9;</xsl:text>
<xsl:value-of select="ReportItemAggregateSummary/Average"/><xsl:text>&#10;</xsl:text>
</xsl:if>
<xsl:text>&#10;</xsl:text>
</xsl:template>
 
</xsl:transform>
