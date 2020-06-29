package com.sophos.nivel1.capacitacion1.clase4;

public class Carro {
	private int numeroOcupantes;
	private String color;
	private int cantidadLlantas;
	private String marcaCarro;

	public Carro() {
		numeroOcupantes = 0;
		color = null;
		cantidadLlantas = 0;
		marcaCarro = null;
		

	}

	public int getNumeroOcupantes() {
		return numeroOcupantes;
	}

	public void setNumeroOcupantes(int numeroOcupantes) {
		if (numeroOcupantes<100) {
			this.numeroOcupantes = numeroOcupantes;
		}else {
			System.out.println("Error no se permite crear carros con mas de 100 pasajeros");
		}
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCantidadLlantas() {
		return cantidadLlantas;
	}

	public void setCantidadLlantas(int cantidadLlantas) {
		this.cantidadLlantas = cantidadLlantas;
	}

	public String getMarcaCarro() {
		return marcaCarro;
	}

	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}


}
