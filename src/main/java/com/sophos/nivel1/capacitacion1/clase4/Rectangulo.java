package com.sophos.nivel1.capacitacion1.clase4;

public class Rectangulo extends Polihedro{
	int area;
	

	public Rectangulo (int numLado) {
		super(numLado);

	
	}
	

		public int getArea() { 
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	public void areaRectangulo() {
		area = getCantidadLados() [0] * getCantidadLados()[1];
		
	}



	private int[] getCatidadLados() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
