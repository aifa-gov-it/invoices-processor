//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.16 at 02:40:54 PM UTC 
//

package it.gov.aifa.invoice_processor.mapping.invoice1_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "NaturaType")
@XmlEnum
public enum NaturaType {

	@XmlEnumValue("N1")
	N_1("N1"),

	@XmlEnumValue("N2")
	N_2("N2"),

	@XmlEnumValue("N3")
	N_3("N3"),

	@XmlEnumValue("N4")
	N_4("N4"),

	@XmlEnumValue("N5")
	N_5("N5"),

	@XmlEnumValue("N6")
	N_6("N6"),

	@XmlEnumValue("N7")
	N_7("N7");
	public static NaturaType fromValue(String v) {
		for (NaturaType c : NaturaType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

	private final String value;

	NaturaType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

}
