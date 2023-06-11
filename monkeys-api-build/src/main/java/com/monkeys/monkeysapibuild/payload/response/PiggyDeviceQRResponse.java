package com.monkeys.monkeysapibuild.payload.response;

public class PiggyDeviceQRResponse {
	
	private String piggyDeviceName;
	
	private String piggyQRcode;
	

	public PiggyDeviceQRResponse(String piggyDeviceName, String piggyQRcode) {
		super();
		this.piggyDeviceName = piggyDeviceName;
		this.piggyQRcode = piggyQRcode;
	}

	public String getPiggyDeviceName() {
		return piggyDeviceName;
	}

	public String getPiggyQRcode() {
		return piggyQRcode;
	}
	
	

}
