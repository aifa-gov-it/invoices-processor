//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.16 at 02:40:54 PM UTC 
//


package it.gov.aifa.invoice_processor.mapping.invoice1_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DatiDocumentiCorrelatiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiDocumentiCorrelatiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RiferimentoNumeroLinea" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}RiferimentoNumeroLineaType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IdDocumento" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type"/>
 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NumItem" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type" minOccurs="0"/>
 *         &lt;element name="CodiceCommessaConvenzione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String100LatinType" minOccurs="0"/>
 *         &lt;element name="CodiceCUP" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String15Type" minOccurs="0"/>
 *         &lt;element name="CodiceCIG" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String15Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiDocumentiCorrelatiType", propOrder = {
    "riferimentoNumeroLinea",
    "idDocumento",
    "data",
    "numItem",
    "codiceCommessaConvenzione",
    "codiceCUP",
    "codiceCIG"
})
public class DatiDocumentiCorrelatiType {

    @XmlElement(name = "RiferimentoNumeroLinea", type = Integer.class)
    @XmlSchemaType(name = "integer")
    protected List<Integer> riferimentoNumeroLinea;
    @XmlElement(name = "IdDocumento", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String idDocumento;
    @XmlElement(name = "Data")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "NumItem")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String numItem;
    @XmlElement(name = "CodiceCommessaConvenzione")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String codiceCommessaConvenzione;
    @XmlElement(name = "CodiceCUP")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String codiceCUP;
    @XmlElement(name = "CodiceCIG")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String codiceCIG;

    /**
     * Gets the value of the riferimentoNumeroLinea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riferimentoNumeroLinea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiferimentoNumeroLinea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getRiferimentoNumeroLinea() {
        if (riferimentoNumeroLinea == null) {
            riferimentoNumeroLinea = new ArrayList<Integer>();
        }
        return this.riferimentoNumeroLinea;
    }

    /**
     * Gets the value of the idDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * Sets the value of the idDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumento(String value) {
        this.idDocumento = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Gets the value of the numItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumItem() {
        return numItem;
    }

    /**
     * Sets the value of the numItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumItem(String value) {
        this.numItem = value;
    }

    /**
     * Gets the value of the codiceCommessaConvenzione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCommessaConvenzione() {
        return codiceCommessaConvenzione;
    }

    /**
     * Sets the value of the codiceCommessaConvenzione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCommessaConvenzione(String value) {
        this.codiceCommessaConvenzione = value;
    }

    /**
     * Gets the value of the codiceCUP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCUP() {
        return codiceCUP;
    }

    /**
     * Sets the value of the codiceCUP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCUP(String value) {
        this.codiceCUP = value;
    }

    /**
     * Gets the value of the codiceCIG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCIG() {
        return codiceCIG;
    }

    /**
     * Sets the value of the codiceCIG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCIG(String value) {
        this.codiceCIG = value;
    }

}
