
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
 *         &lt;element name="MostrarHorariosResult" type="{http://schemas.datacontract.org/2004/07/}ArrayOfHorario" minOccurs="0"/&gt;
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
    "mostrarHorariosResult"
})
@XmlRootElement(name = "MostrarHorariosResponse")
public class MostrarHorariosResponse {

    @XmlElementRef(name = "MostrarHorariosResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfHorario> mostrarHorariosResult;

    /**
     * Obtiene el valor de la propiedad mostrarHorariosResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHorario }{@code >}
     *     
     */
    public JAXBElement<ArrayOfHorario> getMostrarHorariosResult() {
        return mostrarHorariosResult;
    }

    /**
     * Define el valor de la propiedad mostrarHorariosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfHorario }{@code >}
     *     
     */
    public void setMostrarHorariosResult(JAXBElement<ArrayOfHorario> value) {
        this.mostrarHorariosResult = value;
    }

}
