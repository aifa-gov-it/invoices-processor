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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerzoIntermediarioSoggettoEmittenteType", propOrder = { "datiAnagrafici" })
public class TerzoIntermediarioSoggettoEmittenteType {

	@XmlElement(name = "DatiAnagrafici", required = true)
	protected DatiAnagraficiTerzoIntermediarioType datiAnagrafici;

	public TerzoIntermediarioSoggettoEmittenteType() {
	}

	public TerzoIntermediarioSoggettoEmittenteType(DatiAnagraficiTerzoIntermediarioType datiAnagrafici) {
		this.datiAnagrafici = datiAnagrafici;
	}

	public DatiAnagraficiTerzoIntermediarioType getDatiAnagrafici() {
		return datiAnagrafici;
	}

	public void setDatiAnagrafici(DatiAnagraficiTerzoIntermediarioType value) {
		this.datiAnagrafici = value;
	}

}
