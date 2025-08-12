
package com.mycompany.soapclient;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfReservaPendiente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfReservaPendiente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReservaPendiente" type="{http://schemas.datacontract.org/2004/07/}ReservaPendiente" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfReservaPendiente", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "reservaPendiente"
})
public class ArrayOfReservaPendiente {

    @XmlElement(name = "ReservaPendiente", nillable = true)
    protected List<ReservaPendiente> reservaPendiente;

    /**
     * Gets the value of the reservaPendiente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservaPendiente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservaPendiente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservaPendiente }
     * 
     * 
     */
    public List<ReservaPendiente> getReservaPendiente() {
        if (reservaPendiente == null) {
            reservaPendiente = new ArrayList<ReservaPendiente>();
        }
        return this.reservaPendiente;
    }

}
