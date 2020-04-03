/*Copyright (c) 2019-2020 fico.com All Rights Reserved.
 This software is the confidential and proprietary information of fico.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with fico.com*/
package com.fico.dmp.services.damserviceimplservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fico.dmp.services.damserviceimplservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBusinessReportData_QNAME = new QName("http://dam.om.fico.com/", "getBusinessReportData");
    private final static QName _GetBusinessReportDataResponse_QNAME = new QName("http://dam.om.fico.com/", "getBusinessReportDataResponse");
    private final static QName _GetBusinessSearchData_QNAME = new QName("http://dam.om.fico.com/", "getBusinessSearchData");
    private final static QName _GetBusinessSearchDataResponse_QNAME = new QName("http://dam.om.fico.com/", "getBusinessSearchDataResponse");
    private final static QName _GetBusinessSearchReportData_QNAME = new QName("http://dam.om.fico.com/", "getBusinessSearchReportData");
    private final static QName _GetBusinessSearchReportDataResponse_QNAME = new QName("http://dam.om.fico.com/", "getBusinessSearchReportDataResponse");
    private final static QName _GetConsumerReportData_QNAME = new QName("http://dam.om.fico.com/", "getConsumerReportData");
    private final static QName _GetConsumerReportDataResponse_QNAME = new QName("http://dam.om.fico.com/", "getConsumerReportDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fico.dmp.services.damserviceimplservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetConsumerReportData }
     * 
     */
    public GetConsumerReportData createGetConsumerReportData() {
        return new GetConsumerReportData();
    }

    /**
     * Create an instance of {@link GetConsumerReportData.Params }
     * 
     */
    public GetConsumerReportData.Params createGetConsumerReportDataParams() {
        return new GetConsumerReportData.Params();
    }

    /**
     * Create an instance of {@link GetBusinessSearchReportData }
     * 
     */
    public GetBusinessSearchReportData createGetBusinessSearchReportData() {
        return new GetBusinessSearchReportData();
    }

    /**
     * Create an instance of {@link GetBusinessSearchReportData.Params }
     * 
     */
    public GetBusinessSearchReportData.Params createGetBusinessSearchReportDataParams() {
        return new GetBusinessSearchReportData.Params();
    }

    /**
     * Create an instance of {@link GetBusinessSearchData }
     * 
     */
    public GetBusinessSearchData createGetBusinessSearchData() {
        return new GetBusinessSearchData();
    }

    /**
     * Create an instance of {@link GetBusinessSearchData.Params }
     * 
     */
    public GetBusinessSearchData.Params createGetBusinessSearchDataParams() {
        return new GetBusinessSearchData.Params();
    }

    /**
     * Create an instance of {@link GetBusinessReportData }
     * 
     */
    public GetBusinessReportData createGetBusinessReportData() {
        return new GetBusinessReportData();
    }

    /**
     * Create an instance of {@link GetBusinessReportData.Params }
     * 
     */
    public GetBusinessReportData.Params createGetBusinessReportDataParams() {
        return new GetBusinessReportData.Params();
    }

    /**
     * Create an instance of {@link GetBusinessReportDataResponse }
     * 
     */
    public GetBusinessReportDataResponse createGetBusinessReportDataResponse() {
        return new GetBusinessReportDataResponse();
    }

    /**
     * Create an instance of {@link GetBusinessSearchDataResponse }
     * 
     */
    public GetBusinessSearchDataResponse createGetBusinessSearchDataResponse() {
        return new GetBusinessSearchDataResponse();
    }

    /**
     * Create an instance of {@link GetBusinessSearchReportDataResponse }
     * 
     */
    public GetBusinessSearchReportDataResponse createGetBusinessSearchReportDataResponse() {
        return new GetBusinessSearchReportDataResponse();
    }

    /**
     * Create an instance of {@link GetConsumerReportDataResponse }
     * 
     */
    public GetConsumerReportDataResponse createGetConsumerReportDataResponse() {
        return new GetConsumerReportDataResponse();
    }

    /**
     * Create an instance of {@link GetConsumerReportData.Params.Entry }
     * 
     */
    public GetConsumerReportData.Params.Entry createGetConsumerReportDataParamsEntry() {
        return new GetConsumerReportData.Params.Entry();
    }

    /**
     * Create an instance of {@link GetBusinessSearchReportData.Params.Entry }
     * 
     */
    public GetBusinessSearchReportData.Params.Entry createGetBusinessSearchReportDataParamsEntry() {
        return new GetBusinessSearchReportData.Params.Entry();
    }

    /**
     * Create an instance of {@link GetBusinessSearchData.Params.Entry }
     * 
     */
    public GetBusinessSearchData.Params.Entry createGetBusinessSearchDataParamsEntry() {
        return new GetBusinessSearchData.Params.Entry();
    }

    /**
     * Create an instance of {@link GetBusinessReportData.Params.Entry }
     * 
     */
    public GetBusinessReportData.Params.Entry createGetBusinessReportDataParamsEntry() {
        return new GetBusinessReportData.Params.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBusinessReportData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dam.om.fico.com/", name = "getBusinessReportData")
    public JAXBElement<GetBusinessReportData> createGetBusinessReportData(GetBusinessReportData value) {
        return new JAXBElement<GetBusinessReportData>(_GetBusinessReportData_QNAME, GetBusinessReportData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBusinessReportDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dam.om.fico.com/", name = "getBusinessReportDataResponse")
    public JAXBElement<GetBusinessReportDataResponse> createGetBusinessReportDataResponse(GetBusinessReportDataResponse value) {
        return new JAXBElement<GetBusinessReportDataResponse>(_GetBusinessReportDataResponse_QNAME, GetBusinessReportDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBusinessSearchData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dam.om.fico.com/", name = "getBusinessSearchData")
    public JAXBElement<GetBusinessSearchData> createGetBusinessSearchData(GetBusinessSearchData value) {
        return new JAXBElement<GetBusinessSearchData>(_GetBusinessSearchData_QNAME, GetBusinessSearchData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBusinessSearchDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dam.om.fico.com/", name = "getBusinessSearchDataResponse")
    public JAXBElement<GetBusinessSearchDataResponse> createGetBusinessSearchDataResponse(GetBusinessSearchDataResponse value) {
        return new JAXBElement<GetBusinessSearchDataResponse>(_GetBusinessSearchDataResponse_QNAME, GetBusinessSearchDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBusinessSearchReportData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dam.om.fico.com/", name = "getBusinessSearchReportData")
    public JAXBElement<GetBusinessSearchReportData> createGetBusinessSearchReportData(GetBusinessSearchReportData value) {
        return new JAXBElement<GetBusinessSearchReportData>(_GetBusinessSearchReportData_QNAME, GetBusinessSearchReportData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBusinessSearchReportDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dam.om.fico.com/", name = "getBusinessSearchReportDataResponse")
    public JAXBElement<GetBusinessSearchReportDataResponse> createGetBusinessSearchReportDataResponse(GetBusinessSearchReportDataResponse value) {
        return new JAXBElement<GetBusinessSearchReportDataResponse>(_GetBusinessSearchReportDataResponse_QNAME, GetBusinessSearchReportDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsumerReportData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dam.om.fico.com/", name = "getConsumerReportData")
    public JAXBElement<GetConsumerReportData> createGetConsumerReportData(GetConsumerReportData value) {
        return new JAXBElement<GetConsumerReportData>(_GetConsumerReportData_QNAME, GetConsumerReportData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsumerReportDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dam.om.fico.com/", name = "getConsumerReportDataResponse")
    public JAXBElement<GetConsumerReportDataResponse> createGetConsumerReportDataResponse(GetConsumerReportDataResponse value) {
        return new JAXBElement<GetConsumerReportDataResponse>(_GetConsumerReportDataResponse_QNAME, GetConsumerReportDataResponse.class, null, value);
    }

}