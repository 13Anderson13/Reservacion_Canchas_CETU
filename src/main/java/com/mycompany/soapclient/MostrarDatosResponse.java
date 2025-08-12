
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
 *         &lt;element name="MostrarDatosResult" type="{http://schemas.datacontract.org/2004/07/}ArrayOfUsuario" minOccurs="0"/&gt;
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
    "mostrarDatosResult"
})
@XmlRootElement(name = "MostrarDatosResponse")
public class MostrarDatosResponse {

    @XmlElementRef(name = "MostrarDatosResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUsuario> mostrarDatosResult;

    /**
     * Obtiene el valor de la propiedad mostrarDatosResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUsuario }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUsuario> getMostrarDatosResult() {
        return mostrarDatosResult;
    }

    /**
     * Define el valor de la propiedad mostrarDatosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUsuario }{@code >}
     *     
     */
    public void setMostrarDatosResult(JAXBElement<ArrayOfUsuario> value) {
        this.mostrarDatosResult = value;
    }

}
