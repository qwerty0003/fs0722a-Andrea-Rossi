package com.example.Lezione01_03;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.Lezione01_03.classes.Box;

public class BoxTest {

	@Test
	public void testGetArea() {
		Box b = new Box (20,10,"box test");
		assertEquals(200, b.getArea());
	}

	@Test
	public void testGetPerimeter() {
		Box b = new Box (20,10,"box test");
		assertEquals(60, b.getPerimeter());
	}

}
