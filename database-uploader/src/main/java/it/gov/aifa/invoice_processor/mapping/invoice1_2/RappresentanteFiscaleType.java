//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.16 at 02:40:54 PM UTC 
//


package it.gov.aifa.invoice_processor.mapping.invoice1_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Blocco relativo ai dati del Rappresentante Fiscale
 *         
 * 
 * <p>Java class for RappresentanteFiscaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RappresentanteFiscaleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatiAnagrafici" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}DatiAnagraficiRappresentanteType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RappresentanteFiscaleType", propOrder = {
    "datiAnagrafici"
})
public class RappresentanteFiscaleType {

    @XmlElement(name = "DatiAnagrafici", required = true)
    protected DatiAnagraficiRappresentanteType datiAnagrafici;

    /**
     * Gets the value of the datiAnagrafici property.
     * 
     * @return
     *     possible object is
     *     {@link DatiAnagraficiRappresentanteType }
     *     
     */
    public DatiAnagraficiRappresentanteType getDatiAnagrafici() {
        return datiAnagrafici;
    }

    /**
     * Sets the value of the datiAnagrafici property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiAnagraficiRappresentanteType }
     *     
     */
    public void setDatiAnagrafici(DatiAnagraficiRappresentanteType value) {
        this.datiAnagrafici = value;
    }

}
