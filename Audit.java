//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.1-558
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.11.17 at 04:20:50 PM EST
//

package com.blumeglobal.currencyexchange.wsdl;

import javax.xml.bind.annotation.*;

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
 *         &lt;element name="ApplicationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessKeys" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BusinessKey1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessKey2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessKey3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessKey4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BusinessKey5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    name = "",
    propOrder = {
      "applicationID",
      "requestID",
      "correlationID",
      "serviceName",
      "serviceOperation",
      "businessKeys"
    })
@XmlRootElement(name = "Audit", namespace = "http://knesb.int.kn/xsd/esb/audit/v01")
public class Audit {

  @XmlElement(
      name = "ApplicationID",
      namespace = "http://knesb.int.kn/xsd/esb/audit/v01",
      required = true)
  protected String applicationID;

  @XmlElement(
      name = "RequestID",
      namespace = "http://knesb.int.kn/xsd/esb/audit/v01",
      required = true)
  protected String requestID;

  @XmlElement(
      name = "CorrelationID",
      namespace = "http://knesb.int.kn/xsd/esb/audit/v01",
      required = true)
  protected String correlationID;

  @XmlElement(name = "ServiceName", namespace = "http://knesb.int.kn/xsd/esb/audit/v01")
  protected String serviceName;

  @XmlElement(name = "ServiceOperation", namespace = "http://knesb.int.kn/xsd/esb/audit/v01")
  protected String serviceOperation;

  @XmlElement(name = "BusinessKeys", namespace = "http://knesb.int.kn/xsd/esb/audit/v01")
  protected Audit.BusinessKeys businessKeys;

  /**
   * Gets the value of the applicationID property.
   *
   * @return possible object is {@link String }
   */
  public String getApplicationID() {
    return applicationID;
  }

  /**
   * Sets the value of the applicationID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setApplicationID(String value) {
    this.applicationID = value;
  }

  /**
   * Gets the value of the requestID property.
   *
   * @return possible object is {@link String }
   */
  public String getRequestID() {
    return requestID;
  }

  /**
   * Sets the value of the requestID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRequestID(String value) {
    this.requestID = value;
  }

  /**
   * Gets the value of the correlationID property.
   *
   * @return possible object is {@link String }
   */
  public String getCorrelationID() {
    return correlationID;
  }

  /**
   * Sets the value of the correlationID property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCorrelationID(String value) {
    this.correlationID = value;
  }

  /**
   * Gets the value of the serviceName property.
   *
   * @return possible object is {@link String }
   */
  public String getServiceName() {
    return serviceName;
  }

  /**
   * Sets the value of the serviceName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setServiceName(String value) {
    this.serviceName = value;
  }

  /**
   * Gets the value of the serviceOperation property.
   *
   * @return possible object is {@link String }
   */
  public String getServiceOperation() {
    return serviceOperation;
  }

  /**
   * Sets the value of the serviceOperation property.
   *
   * @param value allowed object is {@link String }
   */
  public void setServiceOperation(String value) {
    this.serviceOperation = value;
  }

  /**
   * Gets the value of the businessKeys property.
   *
   * @return possible object is {@link Audit.BusinessKeys }
   */
  public Audit.BusinessKeys getBusinessKeys() {
    return businessKeys;
  }

  /**
   * Sets the value of the businessKeys property.
   *
   * @param value allowed object is {@link Audit.BusinessKeys }
   */
  public void setBusinessKeys(Audit.BusinessKeys value) {
    this.businessKeys = value;
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
   *         &lt;element name="BusinessKey1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *         &lt;element name="BusinessKey2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *         &lt;element name="BusinessKey3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *         &lt;element name="BusinessKey4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *         &lt;element name="BusinessKey5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {"businessKey1", "businessKey2", "businessKey3", "businessKey4", "businessKey5"})
  public static class BusinessKeys {

    @XmlElement(name = "BusinessKey1", namespace = "http://knesb.int.kn/xsd/esb/audit/v01")
    protected String businessKey1;

    @XmlElement(name = "BusinessKey2", namespace = "http://knesb.int.kn/xsd/esb/audit/v01")
    protected String businessKey2;

    @XmlElement(name = "BusinessKey3", namespace = "http://knesb.int.kn/xsd/esb/audit/v01")
    protected String businessKey3;

    @XmlElement(name = "BusinessKey4", namespace = "http://knesb.int.kn/xsd/esb/audit/v01")
    protected String businessKey4;

    @XmlElement(name = "BusinessKey5", namespace = "http://knesb.int.kn/xsd/esb/audit/v01")
    protected String businessKey5;

    /**
     * Gets the value of the businessKey1 property.
     *
     * @return possible object is {@link String }
     */
    public String getBusinessKey1() {
      return businessKey1;
    }

    /**
     * Sets the value of the businessKey1 property.
     *
     * @param value allowed object is {@link String }
     */
    public void setBusinessKey1(String value) {
      this.businessKey1 = value;
    }

    /**
     * Gets the value of the businessKey2 property.
     *
     * @return possible object is {@link String }
     */
    public String getBusinessKey2() {
      return businessKey2;
    }

    /**
     * Sets the value of the businessKey2 property.
     *
     * @param value allowed object is {@link String }
     */
    public void setBusinessKey2(String value) {
      this.businessKey2 = value;
    }

    /**
     * Gets the value of the businessKey3 property.
     *
     * @return possible object is {@link String }
     */
    public String getBusinessKey3() {
      return businessKey3;
    }

    /**
     * Sets the value of the businessKey3 property.
     *
     * @param value allowed object is {@link String }
     */
    public void setBusinessKey3(String value) {
      this.businessKey3 = value;
    }

    /**
     * Gets the value of the businessKey4 property.
     *
     * @return possible object is {@link String }
     */
    public String getBusinessKey4() {
      return businessKey4;
    }

    /**
     * Sets the value of the businessKey4 property.
     *
     * @param value allowed object is {@link String }
     */
    public void setBusinessKey4(String value) {
      this.businessKey4 = value;
    }

    /**
     * Gets the value of the businessKey5 property.
     *
     * @return possible object is {@link String }
     */
    public String getBusinessKey5() {
      return businessKey5;
    }

    /**
     * Sets the value of the businessKey5 property.
     *
     * @param value allowed object is {@link String }
     */
    public void setBusinessKey5(String value) {
      this.businessKey5 = value;
    }
  }
}
