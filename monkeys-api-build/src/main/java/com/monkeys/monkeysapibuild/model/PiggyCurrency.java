package com.monkeys.monkeysapibuild.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="piggy_currency")
public class PiggyCurrency implements Serializable{
	
	private static final long serialVersionUID = -325642083079750005L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="piggy_currency_id")
	private Integer piggyCurrencyId;
	
	@Column(name="piggy_currency_value")
	private Integer piggyCurrencyValue;
	
	@Column(name="is_active")
	private Boolean isActive;

	
	public PiggyCurrency() {

	}

	public Integer getPiggyCurrencyId() {
		return piggyCurrencyId;
	}

	public void setPiggyCurrencyId(Integer piggyCurrencyId) {
		this.piggyCurrencyId = piggyCurrencyId;
	}

	public Integer getPiggyCurrencyValue() {
		return piggyCurrencyValue;
	}

	public void setPiggyCurrencyValue(Integer piggyCurrencyValue) {
		this.piggyCurrencyValue = piggyCurrencyValue;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	

}
