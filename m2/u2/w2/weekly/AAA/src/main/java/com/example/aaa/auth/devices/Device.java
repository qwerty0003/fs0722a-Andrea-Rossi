package com.example.aaa.auth.devices;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "be_service_devices")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Device {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Enumerated(EnumType.STRING)
	private EType type;
	@Enumerated(EnumType.STRING)
	private EState state;

}
