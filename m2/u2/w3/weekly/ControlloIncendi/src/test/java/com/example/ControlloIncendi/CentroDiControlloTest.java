package com.example.ControlloIncendi;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.ControlloIncendi.models.Incendio;
import com.example.ControlloIncendi.models.Sonda;
import com.example.ControlloIncendi.observer.CentroDiControllo;

public class CentroDiControlloTest {
	
	
	
	Incendio incendio;
	CentroDiControllo cdc;
	Sonda son;
	
	@BeforeEach
	public void setUp() {
		son=new Sonda((long) 1,100, 100);
		incendio = new Incendio((long) 1, son, 6);
		cdc=new CentroDiControllo();
	}
	
	@Test
	public void testSegnala() {
		assertEquals("alarm/?idsonda="+son.getId()+"&lat="+son.getLatitudine()
		+"&lon="+son.getLongitudine()+"&smokelevel="+incendio.getQuantitaFumo(), cdc.segnala(incendio));
	}

}
