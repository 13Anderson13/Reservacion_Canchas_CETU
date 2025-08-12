
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
 *         &lt;element name="MostrarHistorialReservasResult" type="{http://schemas.datacontract.org/2004/07/}ArrayOfHistorialReserva" minOccurs="0"/&gt;
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
    "mostrarHistorialReservasResult"
})
@XmlRootElement(name = "MostrarHistorialReservasResponse")
public class MostrarHistorialReservasResponse {

    @XmlElementRef(name = "MostrarHistorialReservasResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHistorialReserva> mostrarHistorialReservasResult;

    /**
     * Obtiene el valor de la propiedad mostrarHistorialReservasResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHistorialReserva }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHistorialReserva> getMostrarHistorialReservasResult() {
        return mostrarHistorialReservasResult;
    }

    /**
     * Define el valor de la propiedad mostrarHistorialReservasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHistorialReserva }{@code >}
     *     
     */
    public void setMostrarHistorialReservasResult(JAXBElement<ArrayOfHistorialReserva> value) {
        this.mostrarHistorialReservasResult = value;
    }

}
