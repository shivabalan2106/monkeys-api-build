package com.monkeys.monkeysapibuild.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monkeys.monkeysapibuild.model.PiggyDevice;
import com.monkeys.monkeysapibuild.payload.response.PiggyDeviceResponse;
import com.monkeys.monkeysapibuild.service.PiggyDeviceService;

@RestController
@RequestMapping(path="/api/v1/device") //, produces ="application/json"
public class PiggyDeviceController {

	@Autowired
	PiggyDeviceService piggyDeviceService;
	
	@PostMapping("/adddevice")
	public ResponseEntity<?> addDevice(){

		PiggyDevice getDevice =  piggyDeviceService.addDevice();
		return ResponseEntity.ok(new PiggyDeviceResponse(getDevice.getPiggyDeviceName(),getDevice.getCreatedDate()));
	}
	

}
