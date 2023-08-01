package com.cgr.forex.data;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private Long id;
	@Column(name = "currency_from")
	private String de;
	@Column(name = "currency_to")
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDe() {
		return de;
	}
	public void setFrom(String de) {
		this.de = de;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

	public ExchangeValue() {
		// TODO Auto-generated constructor stub
	}
	public ExchangeValue(Long id, String de, String to, BigDecimal conversionMultiple, int port) {
		super();
		this.id = id;
		this.de = de;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.port = port;
	}
	@Override
	public String toString() {
		return "ExchangeValue [id=" + id + ", de=" + de + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + ", port=" + port + "]";
	}
	
	
	
}
