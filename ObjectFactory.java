//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.1-558
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.11.17 at 04:20:50 PM EST
//

package com.blumeglobal.currencyexchange.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the com.blumeglobal.currencyexchange.wsdl package.
 *
 * <p>An ObjectFactory allows you to programatically construct new instances of the Java
 * representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element
 * declarations and model groups. Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  private static final QName _SelectCurrencyRateType_QNAME =
      new QName(
          "http://services.kuehne-nagel.com/xsd/MasterData/FICurrencyRate/CurrencyRateType/V1",
          "select_CurrencyRateType");
  private static final QName _Security_QNAME =
      new QName("http://schemas.xmlsoap.org/ws/2002/04/secext", "Security");
  private static final QName _SelectCurrencyRateTypeResponse_QNAME =
      new QName(
          "http://services.kuehne-nagel.com/xsd/MasterData/FICurrencyRate/CurrencyRateType/V1",
          "select_CurrencyRateTypeResponse");
  private static final QName _CurrencyRateTypeTypeCurrencyRateTypeMetaData_QNAME =
      new QName("", "metaData");
  private static final QName _CurrencyRateTypeTypeCurrencyRateTypeName_QNAME =
      new QName("", "name");
  private static final QName _CurrencyRateTypeTypeCurrencyRateTypeTypeCode_QNAME =
      new QName("", "typeCode");
  private static final QName _CurrencyRateTypeTypeCurrencyRateTypeMetaDataUpdatedBy_QNAME =
      new QName("", "updatedBy");
  private static final QName _CurrencyRateTypeTypeCurrencyRateTypeMetaDataCreatedBy_QNAME =
      new QName("", "createdBy");
  private static final QName _CurrencyRateTypeTypeCurrencyRateTypeMetaDataUpdatedOn_QNAME =
      new QName("", "updatedOn");
  private static final QName _CurrencyRateTypeTypeCurrencyRateTypeMetaDataCreatedOn_QNAME =
      new QName("", "createdOn");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: com.blumeglobal.currencyexchange.wsdl
   */
  public ObjectFactory() {}

  /** Create an instance of {@link CurrencyRateTypeType } */
  public CurrencyRateTypeType createCurrencyRateTypeType() {
    return new CurrencyRateTypeType();
  }

  /** Create an instance of {@link UDA.Value } */
  public UDA.Value createUDAValue() {
    return new UDA.Value();
  }

  /** Create an instance of {@link Security } */
  public Security createSecurity() {
    return new Security();
  }

  /** Create an instance of {@link SelectCurrencyRateTypeRequestType } */
  public SelectCurrencyRateTypeRequestType createSelectCurrencyRateTypeRequestType() {
    return new SelectCurrencyRateTypeRequestType();
  }

  /** Create an instance of {@link CurrencyRateTypeType.CurrencyRateType } */
  public CurrencyRateTypeType.CurrencyRateType createCurrencyRateTypeTypeCurrencyRateType() {
    return new CurrencyRateTypeType.CurrencyRateType();
  }

  /** Create an instance of {@link UDACatalog.Documentation } */
  public UDACatalog.Documentation createUDACatalogDocumentation() {
    return new UDACatalog.Documentation();
  }

  /** Create an instance of {@link SelectCurrencyRateTypeRequestType.Pagination } */
  public SelectCurrencyRateTypeRequestType.Pagination
      createSelectCurrencyRateTypeRequestTypePagination() {
    return new SelectCurrencyRateTypeRequestType.Pagination();
  }

  /** Create an instance of {@link UDA } */
  public UDA createUDA() {
    return new UDA();
  }

  /** Create an instance of {@link UDACatalog.Documentation.LocalizedDocumentations } */
  public UDACatalog.Documentation.LocalizedDocumentations
      createUDACatalogDocumentationLocalizedDocumentations() {
    return new UDACatalog.Documentation.LocalizedDocumentations();
  }

  /** Create an instance of {@link Transaction } */
  public Transaction createTransaction() {
    return new Transaction();
  }

  /** Create an instance of {@link SelectCurrencyRateTypeResponseType } */
  public SelectCurrencyRateTypeResponseType createSelectCurrencyRateTypeResponseType() {
    return new SelectCurrencyRateTypeResponseType();
  }

  /** Create an instance of {@link UsernameToken } */
  public UsernameToken createUsernameToken() {
    return new UsernameToken();
  }

  /** Create an instance of {@link UDACatalog } */
  public UDACatalog createUDACatalog() {
    return new UDACatalog();
  }

  /** Create an instance of {@link StandardException } */
  public StandardException createStandardException() {
    return new StandardException();
  }

  /** Create an instance of {@link Audit.BusinessKeys } */
  public Audit.BusinessKeys createAuditBusinessKeys() {
    return new Audit.BusinessKeys();
  }

  /** Create an instance of {@link Audit } */
  public Audit createAudit() {
    return new Audit();
  }

  /** Create an instance of {@link CurrencyRateTypeType.CurrencyRateType.MetaData } */
  public CurrencyRateTypeType.CurrencyRateType.MetaData
      createCurrencyRateTypeTypeCurrencyRateTypeMetaData() {
    return new CurrencyRateTypeType.CurrencyRateType.MetaData();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SelectCurrencyRateTypeRequestType
   * }{@code >}}
   */
  @XmlElementDecl(
      namespace =
          "http://services.kuehne-nagel.com/xsd/MasterData/FICurrencyRate/CurrencyRateType/V1",
      name = "select_CurrencyRateType")
  public JAXBElement<SelectCurrencyRateTypeRequestType> createSelectCurrencyRateType(
      SelectCurrencyRateTypeRequestType value) {
    return new JAXBElement<SelectCurrencyRateTypeRequestType>(
        _SelectCurrencyRateType_QNAME, SelectCurrencyRateTypeRequestType.class, null, value);
  }

  /** Create an instance of {@link JAXBElement }{@code <}{@link Security }{@code >}} */
  @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2002/04/secext", name = "Security")
  public JAXBElement<Security> createSecurity(Security value) {
    return new JAXBElement<Security>(_Security_QNAME, Security.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SelectCurrencyRateTypeResponseType
   * }{@code >}}
   */
  @XmlElementDecl(
      namespace =
          "http://services.kuehne-nagel.com/xsd/MasterData/FICurrencyRate/CurrencyRateType/V1",
      name = "select_CurrencyRateTypeResponse")
  public JAXBElement<SelectCurrencyRateTypeResponseType> createSelectCurrencyRateTypeResponse(
      SelectCurrencyRateTypeResponseType value) {
    return new JAXBElement<SelectCurrencyRateTypeResponseType>(
        _SelectCurrencyRateTypeResponse_QNAME,
        SelectCurrencyRateTypeResponseType.class,
        null,
        value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link
   * CurrencyRateTypeType.CurrencyRateType.MetaData }{@code >}}
   */
  @XmlElementDecl(
      namespace = "",
      name = "metaData",
      scope = CurrencyRateTypeType.CurrencyRateType.class)
  public JAXBElement<CurrencyRateTypeType.CurrencyRateType.MetaData>
      createCurrencyRateTypeTypeCurrencyRateTypeMetaData(
          CurrencyRateTypeType.CurrencyRateType.MetaData value) {
    return new JAXBElement<CurrencyRateTypeType.CurrencyRateType.MetaData>(
        _CurrencyRateTypeTypeCurrencyRateTypeMetaData_QNAME,
        CurrencyRateTypeType.CurrencyRateType.MetaData.class,
        CurrencyRateTypeType.CurrencyRateType.class,
        value);
  }

  /** Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}} */
  @XmlElementDecl(
      namespace = "",
      name = "name",
      scope = CurrencyRateTypeType.CurrencyRateType.class)
  public JAXBElement<String> createCurrencyRateTypeTypeCurrencyRateTypeName(String value) {
    return new JAXBElement<String>(
        _CurrencyRateTypeTypeCurrencyRateTypeName_QNAME,
        String.class,
        CurrencyRateTypeType.CurrencyRateType.class,
        value);
  }

  /** Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}} */
  @XmlElementDecl(
      namespace = "",
      name = "typeCode",
      scope = CurrencyRateTypeType.CurrencyRateType.class)
  public JAXBElement<String> createCurrencyRateTypeTypeCurrencyRateTypeTypeCode(String value) {
    return new JAXBElement<String>(
        _CurrencyRateTypeTypeCurrencyRateTypeTypeCode_QNAME,
        String.class,
        CurrencyRateTypeType.CurrencyRateType.class,
        value);
  }

  /** Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}} */
  @XmlElementDecl(
      namespace = "",
      name = "updatedBy",
      scope = CurrencyRateTypeType.CurrencyRateType.MetaData.class)
  public JAXBElement<String> createCurrencyRateTypeTypeCurrencyRateTypeMetaDataUpdatedBy(
      String value) {
    return new JAXBElement<String>(
        _CurrencyRateTypeTypeCurrencyRateTypeMetaDataUpdatedBy_QNAME,
        String.class,
        CurrencyRateTypeType.CurrencyRateType.MetaData.class,
        value);
  }

  /** Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}} */
  @XmlElementDecl(
      namespace = "",
      name = "createdBy",
      scope = CurrencyRateTypeType.CurrencyRateType.MetaData.class)
  public JAXBElement<String> createCurrencyRateTypeTypeCurrencyRateTypeMetaDataCreatedBy(
      String value) {
    return new JAXBElement<String>(
        _CurrencyRateTypeTypeCurrencyRateTypeMetaDataCreatedBy_QNAME,
        String.class,
        CurrencyRateTypeType.CurrencyRateType.MetaData.class,
        value);
  }

  /** Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}} */
  @XmlElementDecl(
      namespace = "",
      name = "updatedOn",
      scope = CurrencyRateTypeType.CurrencyRateType.MetaData.class)
  public JAXBElement<XMLGregorianCalendar>
      createCurrencyRateTypeTypeCurrencyRateTypeMetaDataUpdatedOn(XMLGregorianCalendar value) {
    return new JAXBElement<XMLGregorianCalendar>(
        _CurrencyRateTypeTypeCurrencyRateTypeMetaDataUpdatedOn_QNAME,
        XMLGregorianCalendar.class,
        CurrencyRateTypeType.CurrencyRateType.MetaData.class,
        value);
  }

  /** Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}} */
  @XmlElementDecl(
      namespace = "",
      name = "createdOn",
      scope = CurrencyRateTypeType.CurrencyRateType.MetaData.class)
  public JAXBElement<XMLGregorianCalendar>
      createCurrencyRateTypeTypeCurrencyRateTypeMetaDataCreatedOn(XMLGregorianCalendar value) {
    return new JAXBElement<XMLGregorianCalendar>(
        _CurrencyRateTypeTypeCurrencyRateTypeMetaDataCreatedOn_QNAME,
        XMLGregorianCalendar.class,
        CurrencyRateTypeType.CurrencyRateType.MetaData.class,
        value);
  }
}
