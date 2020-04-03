/*Copyright (c) 2019-2020 fico.com All Rights Reserved.
 This software is the confidential and proprietary information of fico.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with fico.com*/
package com.fico.dmp.services.damserviceimplservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBusinessSearchReportDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBusinessSearchReportDataResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="omApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBusinessSearchReportDataResponse", propOrder = {
    "omApplication"
})
public class GetBusinessSearchReportDataResponse {

    protected String omApplication;

    /**
     * Gets the value of the omApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmApplication() {
        return omApplication;
    }

    /**
     * Sets the value of the omApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmApplication(String value) {
        this.omApplication = value;
    }

}