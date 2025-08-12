
package com.mycompany.soapclient;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MostrarTiposResult" type="{http://schemas.datacontract.org/2004/07/}ArrayOfTipo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mostrarTiposResult"
})
@XmlRootElement(name = "MostrarTiposResponse")
public class MostrarTiposResponse {

    @XmlElementRef(name = "MostrarTiposResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTipo> mostrarTiposResult;

    /**
     * Obtiene el valor de la propiedad mostrarTiposResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTipo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTipo> getMostrarTiposResult() {
        return mostrarTiposResult;
    }

    /**
     * Define el valor de la propiedad mostrarTiposResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTipo }{@code >}
     *     
     */
    public void setMostrarTiposResult(JAXBElement<ArrayOfTipo> value) {
        this.mostrarTiposResult = value;
    }

}
