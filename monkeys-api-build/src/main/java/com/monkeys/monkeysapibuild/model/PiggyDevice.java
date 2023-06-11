package com.monkeys.monkeysapibuild.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="piggy_device")
public class PiggyDevice implements Serializable{

	private static final long serialVersionUID = -1810931424305454495L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="piggy_device_id")
	private Long piggyDeviceId;
	
	@Column(name="piggy_device_name")
	private String piggyDeviceName;
	
	@Column(name="created_at")
	private Date createdDate;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@OneToMany(mappedBy="piggyDevice")
	private List<PiggyDeviceQR> piggyDeviceQR;
	

	public PiggyDevice() {
	}

	
	public Long getPiggyDeviceId() {
		return piggyDeviceId;
	}

	public void setPiggyDeviceId(Long piggyDeviceId) {
		this.piggyDeviceId = piggyDeviceId;
	}

	public String getPiggyDeviceName() {
		return piggyDeviceName;
	}

	public void setPiggyDeviceName(String piggyDeviceName) {
		this.piggyDeviceName = piggyDeviceName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	public List<PiggyDeviceQR> getPiggyDeviceQR() {
		return piggyDeviceQR;
	}

	public void setPiggyDeviceQR(List<PiggyDeviceQR> piggyDeviceQR) {
		this.piggyDeviceQR = piggyDeviceQR;
	}

	@Override
	public String toString() {
		return "PiggyDevice [piggyDeviceId=" + piggyDeviceId + ", piggyDeviceName=" + piggyDeviceName + ", createdDate="
				+ createdDate + "]";
	}
	
	
	
}
