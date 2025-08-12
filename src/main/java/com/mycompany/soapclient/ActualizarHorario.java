
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
 *         &lt;element name="idHorario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idCancha" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cancha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diaStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaInicialStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaFinalStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "idHorario",
    "idCancha",
    "cancha",
    "diaStr",
    "horaInicialStr",
    "horaFinalStr"
})
@XmlRootElement(name = "ActualizarHorario")
public class ActualizarHorario {

    protected Integer idHorario;
    protected Integer idCancha;
    @XmlElementRef(name = "cancha", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cancha;
    @XmlElementRef(name = "diaStr", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> diaStr;
    @XmlElementRef(name = "horaInicialStr", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horaInicialStr;
    @XmlElementRef(name = "horaFinalStr", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horaFinalStr;

    /**
     * Obtiene el valor de la propiedad idHorario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdHorario() {
        return idHorario;
    }

    /**
     * Define el valor de la propiedad idHorario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdHorario(Integer value) {
        this.idHorario = value;
    }

    /**
     * Obtiene el valor de la propiedad idCancha.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCancha() {
        return idCancha;
    }

    /**
     * Define el valor de la propiedad idCancha.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCancha(Integer value) {
        this.idCancha = value;
    }

    /**
     * Obtiene el valor de la propiedad cancha.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCancha() {
        return cancha;
    }

    /**
     * Define el valor de la propiedad cancha.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCancha(JAXBElement<String> value) {
        this.cancha = value;
    }

    /**
     * Obtiene el valor de la propiedad diaStr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDiaStr() {
        return diaStr;
    }

    /**
     * Define el valor de la propiedad diaStr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDiaStr(JAXBElement<String> value) {
        this.diaStr = value;
    }

    /**
     * Obtiene el valor de la propiedad horaInicialStr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoraInicialStr() {
        return horaInicialStr;
    }

    /**
     * Define el valor de la propiedad horaInicialStr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoraInicialStr(JAXBElement<String> value) {
        this.horaInicialStr = value;
    }

    /**
     * Obtiene el valor de la propiedad horaFinalStr.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoraFinalStr() {
        return horaFinalStr;
    }

    /**
     * Define el valor de la propiedad horaFinalStr.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoraFinalStr(JAXBElement<String> value) {
        this.horaFinalStr = value;
    }

}
