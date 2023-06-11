package com.monkeys.monkeysapibuild.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monkeys.monkeysapibuild.model.PiggyDeviceQR;

@Repository
public interface PiggyDeviceQRRepository extends JpaRepository<PiggyDeviceQR, Long> {

}
