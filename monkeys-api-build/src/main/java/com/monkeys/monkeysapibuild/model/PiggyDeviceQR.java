package com.monkeys.monkeysapibuild.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="piggy_device_QR")
public class PiggyDeviceQR implements Serializable{
	
	private static final long serialVersionUID = -3328933172450360105L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="piggy_device_QR_id")
	private Long piggyDeviceQRId;
	
	@Column(name="piggy_QR_code_value")
	private String piggyQRCodeValue;
	
	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@ManyToOne
	@JoinColumn(name="piggy_device_id", nullable=false)
	private PiggyDevice piggyDevice;
	

	public PiggyDeviceQR() {

	}

	public Long getPiggyDeviceQRId() {
		return piggyDeviceQRId;
	}

	public void setPiggyDeviceQRId(Long piggyDeviceQRId) {
		this.piggyDeviceQRId = piggyDeviceQRId;
	}

	public String getPiggyQRCodeValue() {
		return piggyQRCodeValue;
	}

	public void setPiggyQRCodeValue(String piggyQRCodeValue) {
		this.piggyQRCodeValue = piggyQRCodeValue;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public PiggyDevice getPiggyDevice() {
		return piggyDevice;
	}

	public void setPiggyDevice(PiggyDevice piggyDevice) {
		this.piggyDevice = piggyDevice;
	}
	
	

}
