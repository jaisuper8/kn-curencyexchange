//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.1-558
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.11.17 at 04:20:50 PM EST
//

package com.blumeglobal.currencyexchange.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for select_CurrencyRateTypeResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="select_CurrencyRateTypeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{http://services.kuehne-nagel.com/xsd/MasterData/FICurrencyRate/CurrencyRateType/V1}CurrencyRateTypeType"/>
 *         &lt;element name="lastRecordPredicate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "select_CurrencyRateTypeResponseType",
    propOrder = {"data", "lastRecordPredicate"})
public class SelectCurrencyRateTypeResponseType {

  @XmlElement(required = true)
  protected CurrencyRateTypeType data;

  protected String lastRecordPredicate;

  /**
   * Gets the value of the data property.
   *
   * @return possible object is {@link CurrencyRateTypeType }
   */
  public CurrencyRateTypeType getData() {
    return data;
  }

  /**
   * Sets the value of the data property.
   *
   * @param value allowed object is {@link CurrencyRateTypeType }
   */
  public void setData(CurrencyRateTypeType value) {
    this.data = value;
  }

  /**
   * Gets the value of the lastRecordPredicate property.
   *
   * @return possible object is {@link String }
   */
  public String getLastRecordPredicate() {
    return lastRecordPredicate;
  }

  /**
   * Sets the value of the lastRecordPredicate property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLastRecordPredicate(String value) {
    this.lastRecordPredicate = value;
  }
}
