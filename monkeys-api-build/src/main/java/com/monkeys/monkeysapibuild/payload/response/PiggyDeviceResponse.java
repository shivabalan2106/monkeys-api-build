package com.monkeys.monkeysapibuild.payload.response;

import java.util.Date;

public class PiggyDeviceResponse {
	
	private String piggyDeviceName;
	
	private Date createdDate;
	
	

	public PiggyDeviceResponse(String piggyDeviceName, Date createdDate) {
		this.piggyDeviceName = piggyDeviceName;
		this.createdDate = createdDate;
	}

	public String getPiggyDeviceName() {
		return piggyDeviceName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
	
	

}
