package com.monkeys.monkeysapibuild.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monkeys.monkeysapibuild.model.PiggyCurrency;

public interface PiggyCurrecyRepository extends JpaRepository<PiggyCurrency, Integer> {

}
