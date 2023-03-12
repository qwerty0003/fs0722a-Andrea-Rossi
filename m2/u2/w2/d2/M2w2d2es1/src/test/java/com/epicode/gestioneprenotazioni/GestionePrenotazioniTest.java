package com.epicode.gestioneprenotazioni;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class GestionePrenotazioniTest {

	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate tr;
	
	@Test
	public void controllo() {
		assertThat(
			tr.getForObject("http://localhost:" + port + "/saluto", String.class)
			.contains("HOLA")
		);
	}
	@Test
	public void controllo2() {
		assertThat(
				tr.getForObject("http://localhost:" + port + "/lingua?lang=IT", String.class)
				.contains("giorno")
				);
	}
	@Test
	public void controllo3() {
		assertThat(
				tr.getForObject("http://localhost:" + port + "/lingua?lang=EN", String.class)
				.contains("date")
				);
	}
	@Test
	public void controllo4() {
		assertThat(
				tr.getForObject("http://localhost:" + port + "/lingua/EN", String.class)
				.contains("date")
				);
	}
	@Test
	public void controllo5() {
		assertThat(
				tr.getForObject("http://localhost:" + port + "/lingua/IT", String.class)
				.contains("giorno")
				);
	}
	@Test
	public void controllo6() {
		assertThat(
				tr.getForObject("http://localhost:" + port + "/lingua/KR", String.class)
				.contains("avaiable")
				);
	}
	
}
