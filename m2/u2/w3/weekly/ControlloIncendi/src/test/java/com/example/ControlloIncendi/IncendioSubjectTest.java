package com.example.ControlloIncendi;


import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.ControlloIncendi.models.Incendio;
import com.example.ControlloIncendi.models.Sonda;
import com.example.ControlloIncendi.observer.IncendioObserver;

public class IncendioSubjectTest {
	
	IncendioObserver obs1;
	IncendioObserver obs2;
	IncendioObserver obs3;
	List<IncendioObserver> incObs;
	Sonda son;
	Incendio inc;

	
	@BeforeEach
	public void setUp() {
		incObs = new ArrayList<>();
		son=new Sonda((long) 1, 100, 100);
		inc=new Incendio((long) 1, son, 6);
	}
	
	@Test
	public void testAggiungiOsservatore() { 
		incObs.add(obs1);
		assertEquals(1, incObs.size(), "test1");
	}

	@Test
	public void testRimuoviOsservatore() {
		incObs.add(obs2);
		incObs.add(obs3);
		assertEquals(2, incObs.size());
		incObs.remove(0);
		assertEquals(1, incObs.size());
	}

	@Test
	public void testSegnalaIncendi() {
		assertTrue(inc.getQuantitaFumo()>5);
	}
}
