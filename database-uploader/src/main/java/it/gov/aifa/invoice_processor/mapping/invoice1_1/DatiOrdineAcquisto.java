
package it.gov.aifa.invoice_processor.mapping.invoice1_1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "IdDocumento", "Data", "RiferimentoNumeroLinea", "CodiceCIG" })
public class DatiOrdineAcquisto implements Serializable {

	@JsonProperty("IdDocumento")
	private String idDocumento;
	@JsonProperty("Data")
	private String data;
	@JsonProperty("RiferimentoNumeroLinea")
	private String riferimentoNumeroLinea;
	@JsonProperty("CodiceCIG")
	private String codiceCIG;
	@JsonIgnore
	@Valid
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 1818931439726761437L;

	public DatiOrdineAcquisto() {
	}

	public DatiOrdineAcquisto(String idDocumento, String data, String riferimentoNumeroLinea, String codiceCIG) {
		super();
		this.idDocumento = idDocumento;
		this.data = data;
		this.riferimentoNumeroLinea = riferimentoNumeroLinea;
		this.codiceCIG = codiceCIG;
	}

	@JsonProperty("IdDocumento")
	public String getIdDocumento() {
		return idDocumento;
	}

	@JsonProperty("IdDocumento")
	public void setIdDocumento(String idDocumento) {
		this.idDocumento = idDocumento;
	}

	@JsonProperty("Data")
	public String getData() {
		return data;
	}

	@JsonProperty("Data")
	public void setData(String data) {
		this.data = data;
	}

	@JsonProperty("RiferimentoNumeroLinea")
	public String getRiferimentoNumeroLinea() {
		return riferimentoNumeroLinea;
	}

	@JsonProperty("RiferimentoNumeroLinea")
	public void setRiferimentoNumeroLinea(String riferimentoNumeroLinea) {
		this.riferimentoNumeroLinea = riferimentoNumeroLinea;
	}

	@JsonProperty("CodiceCIG")
	public String getCodiceCIG() {
		return codiceCIG;
	}

	@JsonProperty("CodiceCIG")
	public void setCodiceCIG(String codiceCIG) {
		this.codiceCIG = codiceCIG;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(idDocumento).append(data).append(riferimentoNumeroLinea).append(codiceCIG)
				.append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof DatiOrdineAcquisto) == false) {
			return false;
		}
		DatiOrdineAcquisto rhs = ((DatiOrdineAcquisto) other);
		return new EqualsBuilder().append(idDocumento, rhs.idDocumento).append(data, rhs.data)
				.append(riferimentoNumeroLinea, rhs.riferimentoNumeroLinea).append(codiceCIG, rhs.codiceCIG)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
