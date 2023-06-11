package com.monkeys.monkeysapibuild.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monkeys.monkeysapibuild.model.PiggyDevice;
import com.monkeys.monkeysapibuild.repository.PiggyDeviceRepository;

@Service
public class PiggyDeviceService {
	
	@Autowired
	PiggyDeviceRepository piggyDeviceRepo;
	
	public PiggyDevice addDevice() {
		
		UUID uuid = UUID.randomUUID();
		PiggyDevice piggyDevice = new PiggyDevice();
		piggyDevice.setPiggyDeviceName(uuid.toString());
		piggyDevice.setCreatedDate(new Date());
		piggyDevice.setIsActive(true);
		System.out.println("before save...."+piggyDevice.toString());
		piggyDeviceRepo.save(piggyDevice);
		System.out.println("after save button..."+piggyDevice.toString());
		return piggyDevice;
	}

}
