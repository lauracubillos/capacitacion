package com.sophos.nivel1.capacitacion1.clase4;

public class Modificadores1 {

	private String variable1 = "carros lujosos";
	protected String variable2 = "ingenieros";
	public String variable3= "Servicios";

	public String retornoVariable1() {
		return variable1 + "valor x";
	}

	protected String retornoVariable2() {
		return variable1 + "valor y";
	}

	private String retornoVariable3() {
		return variable1 + "valor z";
	}

}
