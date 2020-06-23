package com.sophos.nivel1.capacitacion1;
import java.util.Scanner;

public class mayordeedad {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		int edad;
		System.out.println("Digite su edad");
		edad= SC.nextInt();

		if (edad >= 18) {
			
			System.out.println("es mayor de edad");
		}

		else {
			System.out.println("es menor de edad");
		}

	}
}
