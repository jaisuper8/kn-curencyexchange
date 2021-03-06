//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.1-558
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.11.17 at 04:20:50 PM EST
//

package com.blumeglobal.currencyexchange.wsdl;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

/**
 * User defined attribute(s)
 *
 * <p>Java class for UDA complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UDA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attribute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="xsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="xsBoolean" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="xsInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="xsDecimal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="xsDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="xsDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="xsTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                   &lt;element name="xsName" type="{http://www.w3.org/2001/XMLSchema}Name" minOccurs="0"/>
 *                   &lt;element name="xsAnyURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                   &lt;element name="osdText" type="{urn:ebx-schemas:common_1.0}text" minOccurs="0"/>
 *                   &lt;element name="osdHtml" type="{urn:ebx-schemas:common_1.0}html" minOccurs="0"/>
 *                   &lt;element name="osdEmail" type="{urn:ebx-schemas:common_1.0}email" minOccurs="0"/>
 *                   &lt;element name="osdPassword" type="{urn:ebx-schemas:common_1.0}password" minOccurs="0"/>
 *                   &lt;element name="osdLocale" type="{urn:ebx-schemas:common_1.0}locale" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "UDA",
    namespace = "urn:ebx-schemas:common_1.0",
    propOrder = {"attribute", "value"})
public class UDA {

  @XmlElement(required = true)
  protected String attribute;

  @XmlElement(required = true)
  protected UDA.Value value;

  /**
   * Gets the value of the attribute property.
   *
   * @return possible object is {@link String }
   */
  public String getAttribute() {
    return attribute;
  }

  /**
   * Sets the value of the attribute property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAttribute(String value) {
    this.attribute = value;
  }

  /**
   * Gets the value of the value property.
   *
   * @return possible object is {@link UDA.Value }
   */
  public UDA.Value getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is {@link UDA.Value }
   */
  public void setValue(UDA.Value value) {
    this.value = value;
  }

  /**
   * Java class for anonymous complex type.
   *
   * <p>The following schema fragment specifies the expected content contained within this class.
   *
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;element name="xsString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *         &lt;element name="xsBoolean" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
   *         &lt;element name="xsInt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
   *         &lt;element name="xsDecimal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
   *         &lt;element name="xsDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
   *         &lt;element name="xsDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
   *         &lt;element name="xsTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
   *         &lt;element name="xsName" type="{http://www.w3.org/2001/XMLSchema}Name" minOccurs="0"/>
   *         &lt;element name="xsAnyURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
   *         &lt;element name="osdText" type="{urn:ebx-schemas:common_1.0}text" minOccurs="0"/>
   *         &lt;element name="osdHtml" type="{urn:ebx-schemas:common_1.0}html" minOccurs="0"/>
   *         &lt;element name="osdEmail" type="{urn:ebx-schemas:common_1.0}email" minOccurs="0"/>
   *         &lt;element name="osdPassword" type="{urn:ebx-schemas:common_1.0}password" minOccurs="0"/>
   *         &lt;element name="osdLocale" type="{urn:ebx-schemas:common_1.0}locale" minOccurs="0"/>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "xsString",
        "xsBoolean",
        "xsInt",
        "xsDecimal",
        "xsDateTime",
        "xsDate",
        "xsTime",
        "xsName",
        "xsAnyURI",
        "osdText",
        "osdHtml",
        "osdEmail",
        "osdPassword",
        "osdLocale"
      })
  public static class Value {

    protected String xsString;
    protected Boolean xsBoolean;
    protected Integer xsInt;
    protected BigDecimal xsDecimal;

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xsDateTime;

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xsDate;

    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar xsTime;

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "Name")
    protected String xsName;

    @XmlSchemaType(name = "anyURI")
    protected String xsAnyURI;

    protected String osdText;
    protected String osdHtml;
    protected String osdEmail;
    protected String osdPassword;
    protected Locale osdLocale;

    /**
     * Gets the value of the xsString property.
     *
     * @return possible object is {@link String }
     */
    public String getXsString() {
      return xsString;
    }

    /**
     * Sets the value of the xsString property.
     *
     * @param value allowed object is {@link String }
     */
    public void setXsString(String value) {
      this.xsString = value;
    }

    /**
     * Gets the value of the xsBoolean property.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isXsBoolean() {
      return xsBoolean;
    }

    /**
     * Sets the value of the xsBoolean property.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setXsBoolean(Boolean value) {
      this.xsBoolean = value;
    }

    /**
     * Gets the value of the xsInt property.
     *
     * @return possible object is {@link Integer }
     */
    public Integer getXsInt() {
      return xsInt;
    }

    /**
     * Sets the value of the xsInt property.
     *
     * @param value allowed object is {@link Integer }
     */
    public void setXsInt(Integer value) {
      this.xsInt = value;
    }

    /**
     * Gets the value of the xsDecimal property.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getXsDecimal() {
      return xsDecimal;
    }

    /**
     * Sets the value of the xsDecimal property.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setXsDecimal(BigDecimal value) {
      this.xsDecimal = value;
    }

    /**
     * Gets the value of the xsDateTime property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getXsDateTime() {
      return xsDateTime;
    }

    /**
     * Sets the value of the xsDateTime property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setXsDateTime(XMLGregorianCalendar value) {
      this.xsDateTime = value;
    }

    /**
     * Gets the value of the xsDate property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getXsDate() {
      return xsDate;
    }

    /**
     * Sets the value of the xsDate property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setXsDate(XMLGregorianCalendar value) {
      this.xsDate = value;
    }

    /**
     * Gets the value of the xsTime property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getXsTime() {
      return xsTime;
    }

    /**
     * Sets the value of the xsTime property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     */
    public void setXsTime(XMLGregorianCalendar value) {
      this.xsTime = value;
    }

    /**
     * Gets the value of the xsName property.
     *
     * @return possible object is {@link String }
     */
    public String getXsName() {
      return xsName;
    }

    /**
     * Sets the value of the xsName property.
     *
     * @param value allowed object is {@link String }
     */
    public void setXsName(String value) {
      this.xsName = value;
    }

    /**
     * Gets the value of the xsAnyURI property.
     *
     * @return possible object is {@link String }
     */
    public String getXsAnyURI() {
      return xsAnyURI;
    }

    /**
     * Sets the value of the xsAnyURI property.
     *
     * @param value allowed object is {@link String }
     */
    public void setXsAnyURI(String value) {
      this.xsAnyURI = value;
    }

    /**
     * Gets the value of the osdText property.
     *
     * @return possible object is {@link String }
     */
    public String getOsdText() {
      return osdText;
    }

    /**
     * Sets the value of the osdText property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOsdText(String value) {
      this.osdText = value;
    }

    /**
     * Gets the value of the osdHtml property.
     *
     * @return possible object is {@link String }
     */
    public String getOsdHtml() {
      return osdHtml;
    }

    /**
     * Sets the value of the osdHtml property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOsdHtml(String value) {
      this.osdHtml = value;
    }

    /**
     * Gets the value of the osdEmail property.
     *
     * @return possible object is {@link String }
     */
    public String getOsdEmail() {
      return osdEmail;
    }

    /**
     * Sets the value of the osdEmail property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOsdEmail(String value) {
      this.osdEmail = value;
    }

    /**
     * Gets the value of the osdPassword property.
     *
     * @return possible object is {@link String }
     */
    public String getOsdPassword() {
      return osdPassword;
    }

    /**
     * Sets the value of the osdPassword property.
     *
     * @param value allowed object is {@link String }
     */
    public void setOsdPassword(String value) {
      this.osdPassword = value;
    }

    /**
     * Gets the value of the osdLocale property.
     *
     * @return possible object is {@link Locale }
     */
    public Locale getOsdLocale() {
      return osdLocale;
    }

    /**
     * Sets the value of the osdLocale property.
     *
     * @param value allowed object is {@link Locale }
     */
    public void setOsdLocale(Locale value) {
      this.osdLocale = value;
    }
  }
}
