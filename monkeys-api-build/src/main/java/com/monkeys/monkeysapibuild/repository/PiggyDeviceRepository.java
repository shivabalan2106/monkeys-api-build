package com.monkeys.monkeysapibuild.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monkeys.monkeysapibuild.model.PiggyDevice;

@Repository
public interface PiggyDeviceRepository extends JpaRepository<PiggyDevice, Long> {
	
	//PiggyDevice save(PiggyDevice piggyDevice);
	
	PiggyDevice findBypiggyDeviceName(String deviceName);

}
