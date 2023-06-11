package com.monkeys.monkeysapibuild.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monkeys.monkeysapibuild.model.PiggyDevice;
import com.monkeys.monkeysapibuild.model.PiggyDeviceQR;
import com.monkeys.monkeysapibuild.repository.PiggyDeviceQRRepository;
import com.monkeys.monkeysapibuild.repository.PiggyDeviceRepository;

@Service
public class PiggyDeviceQRService {
	
	@Autowired
	PiggyDeviceRepository piggyDeviceRepository;
	
	@Autowired
	PiggyDeviceQRRepository piggyDeviceQRRepository;
	
	public PiggyDeviceQR addPiggyQR(String deviceName) {
		
		PiggyDevice device = piggyDeviceRepository.findBypiggyDeviceName(deviceName);
		String random = generateAlphaNumberoic(30);
		PiggyDeviceQR piggyDeviceQR = new PiggyDeviceQR();
		piggyDeviceQR.setPiggyQRCodeValue(random);
		piggyDeviceQR.setCreatedAt(new Date());
		piggyDeviceQR.setIsActive(true);
		piggyDeviceQR.setPiggyDevice(device);
		piggyDeviceQRRepository.save(piggyDeviceQR);
		
		return piggyDeviceQR;
	}
	
	public static String generateAlphaNumberoic(int length){
		 
        char[] ALPHANUMERIC  ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        StringBuilder random = new StringBuilder();
        for(int i =0; i < length; i++) {
            int index = (int) (Math.random()*ALPHANUMERIC.length);
            random.append(ALPHANUMERIC[index]);
        }
        return random.toString();
    } 

}
