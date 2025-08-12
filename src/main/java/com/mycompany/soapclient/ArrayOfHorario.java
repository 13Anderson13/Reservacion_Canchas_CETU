
package com.mycompany.soapclient;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfHorario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHorario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Horario" type="{http://schemas.datacontract.org/2004/07/}Horario" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHorario", namespace = "http://schemas.datacontract.org/2004/07/", propOrder = {
    "horario"
})
public class ArrayOfHorario {

    @XmlElement(name = "Horario", nillable = true)
    protected List<Horario> horario;

    /**
     * Gets the value of the horario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Horario }
     * 
     * 
     */
    public List<Horario> getHorario() {
        if (horario == null) {
            horario = new ArrayList<Horario>();
        }
        return this.horario;
    }

}
