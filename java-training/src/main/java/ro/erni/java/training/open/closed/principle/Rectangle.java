/*
 * Copyright 2009 by Abraxas Informatik AG,
 * Waltersbachstrasse 5, CH-8006 Zürich
 * All rights reserved.
 *
 * Created: 17 apr. 2016
 */
package ro.erni.java.training.open.closed.principle;

public class Rectangle extends Shape {
	Rectangle() {
		super.m_type = 1;
	}

	@Override
	void draw() {
		System.out.println("Rectangle is drown ");
	}
}
