
package com.mycompany.soapclient;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Horario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Horario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cancha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Dia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HoraFinal" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="HoraInicial" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="IdCancha" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdHorario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Horario", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "cancha",
    "dia",
    "horaFinal",
    "horaInicial",
    "idCancha",
    "idHorario"
})
public class Horario {

    @XmlElementRef(name = "Cancha", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cancha;
    @XmlElement(name = "Dia")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dia;
    @XmlElementRef(name = "HoraFinal", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> horaFinal;
    @XmlElementRef(name = "HoraInicial", namespace = "http://schemas.datacontract.org/2004/07/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> horaInicial;
    @XmlElement(name = "IdCancha")
    protected Integer idCancha;
    @XmlElement(name = "IdHorario")
    protected Integer idHorario;

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
     * Obtiene el valor de la propiedad dia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDia() {
        return dia;
    }

    /**
     * Define el valor de la propiedad dia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDia(XMLGregorianCalendar value) {
        this.dia = value;
    }

    /**
     * Obtiene el valor de la propiedad horaFinal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getHoraFinal() {
        return horaFinal;
    }

    /**
     * Define el valor de la propiedad horaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setHoraFinal(JAXBElement<Duration> value) {
        this.horaFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad horaInicial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getHoraInicial() {
        return horaInicial;
    }

    /**
     * Define el valor de la propiedad horaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setHoraInicial(JAXBElement<Duration> value) {
        this.horaInicial = value;
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

}
