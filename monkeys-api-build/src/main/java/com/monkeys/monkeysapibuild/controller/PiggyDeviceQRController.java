package com.monkeys.monkeysapibuild.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.zxing.WriterException;
import com.monkeys.monkeysapibuild.model.PiggyDeviceQR;
import com.monkeys.monkeysapibuild.payload.response.PiggyDeviceQRResponse;
import com.monkeys.monkeysapibuild.repository.PiggyDeviceRepository;
import com.monkeys.monkeysapibuild.service.PiggyDeviceQRService;

@RestController
@RequestMapping(path="/api/v1/device")
public class PiggyDeviceQRController {
	
	@Autowired
	PiggyDeviceRepository piggyDeviceRepo;
	
	@Autowired
	PiggyDeviceQRService piggyDeviceQRService;
	
	@GetMapping("/generateQRcode/{deviceName}")
	public ResponseEntity<?> generateQRCode(@PathVariable("deviceName") String deviceName) throws WriterException, IOException{
		
		PiggyDeviceQR piggyQRDetails =  piggyDeviceQRService.addPiggyQR(deviceName);
		return ResponseEntity.ok(new PiggyDeviceQRResponse(piggyQRDetails.getPiggyDevice().getPiggyDeviceName(),piggyQRDetails.getPiggyQRCodeValue()));
	}
	
	


	

}
