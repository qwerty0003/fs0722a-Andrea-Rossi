package com.example.aaa.auth.devices;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface DeviceRepo extends JpaRepository<Device, Long> {
	Optional<Device> findByType(EType type);
	Optional<Device> findByState(EState state);
}
