package it.gov.aifa.invoice_processor.entity.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.annotation.Validated;

import it.gov.aifa.invoice_processor.entity.impl.AbstractInvoiceReferenceEntity;

@Entity
@Table(name = "MEF_DATI_RIEPILOGO_FATTURA")
@Validated
public class DatiRiepilogo extends AbstractInvoiceReferenceEntity {
	private static final long serialVersionUID = -2915903776609151751L;

	private BigDecimal aliquotaIVA;

	private BigDecimal arrotondamento;

	private String esigibilitaIVA;

	private BigDecimal imponibileImporto;

	private BigDecimal imposta;

	private String natura;
	
	private String riferimentoNormativo;

	private BigDecimal speseAccessorie;

	public DatiRiepilogo() {
		super();
	}
	
	public DatiRiepilogo(
			@NotNull BigDecimal aliquotaIVA
			, BigDecimal arrotondamento
			, String esigibilitaIVA
			, @NotNull BigDecimal imponibileImporto
			, @NotNull BigDecimal imposta
			, Invoice invoice
			, String natura
			, String riferimentoNormativo
			, BigDecimal speseAccessorie) {
		super(invoice);
		this.aliquotaIVA = aliquotaIVA;
		this.arrotondamento = arrotondamento;
		this.esigibilitaIVA = esigibilitaIVA;
		this.imponibileImporto = imponibileImporto;
		this.imposta = imposta;
		this.natura = natura;
		this.riferimentoNormativo = riferimentoNormativo;
		this.speseAccessorie = speseAccessorie;
	}
	
	@Override
	@Transient
	protected List<String> getAdditionalIdValues() {
		List<String> additionalIdValues = new ArrayList<>();
		additionalIdValues.add(aliquotaIVA.toString());
		additionalIdValues.add(imponibileImporto.toString());
		additionalIdValues.add(imposta.toString());
		if(StringUtils.isNotBlank(esigibilitaIVA))
			additionalIdValues.add(esigibilitaIVA);
		if(natura != null)
			additionalIdValues.add(natura.toString());
		return Collections.unmodifiableList(additionalIdValues);
	}
	
	public BigDecimal getAliquotaIVA() {
		return aliquotaIVA;
	}
	
	public BigDecimal getArrotondamento() {
		return arrotondamento;
	}
	
	public String getEsigibilitaIVA() {
		return esigibilitaIVA;
	}
	
	public BigDecimal getImponibileImporto() {
		return imponibileImporto;
	}
	
	public BigDecimal getImposta() {
		return imposta;
	}
	
	public String getNatura() {
		return natura;
	}

	public String getRiferimentoNormativo() {
		return riferimentoNormativo;
	}

	public BigDecimal getSpeseAccessorie() {
		return speseAccessorie;
	}

	public void setAliquotaIVA(@NotNull BigDecimal aliquotaIVA) {
		this.aliquotaIVA = aliquotaIVA;
	}

	public void setArrotondamento(BigDecimal arrotondamento) {
		this.arrotondamento = arrotondamento;
	}

	public void setEsigibilitaIVA(String esigibilitaIVA) {
		this.esigibilitaIVA = esigibilitaIVA;
	}

	public void setImponibileImporto(@NotNull BigDecimal imponibileImporto) {
		this.imponibileImporto = imponibileImporto;
	}

	public void setImposta(@NotNull BigDecimal imposta) {
		this.imposta = imposta;
	}

	public void setNatura(String natura) {
		this.natura = natura;
	}

	public void setRiferimentoNormativo(String riferimentoNormativo) {
		this.riferimentoNormativo = riferimentoNormativo;
	}

	public void setSpeseAccessorie(BigDecimal speseAccessorie) {
		this.speseAccessorie = speseAccessorie;
	}
}
