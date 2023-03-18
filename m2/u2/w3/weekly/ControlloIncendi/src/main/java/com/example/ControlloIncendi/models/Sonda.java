package com.example.ControlloIncendi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@Table(name = "sonde")
@Entity
public class Sonda{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private double latitudine;
	private double longitudine;
	
}
