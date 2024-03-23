package Treinando;

import java.util.Scanner;

public class Temperatura {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Double K, Re, Ra, F;
	
	System.out.println("Insira a temperatura: ");
	Double c = sc.nextDouble();
	
	K = c + 273.15;
	F = c * 1.8 + 32;
	Re = c * 0.8;
	Ra = c * 1.8 + 32 + 459.67;
	
	System.out.println("Temperatura em Kelvin é: " + K);
	System.out.println("Temperatura em Fahrenheit é: " + F);
	System.out.println("Temperatura em Réaumur é: " + Re);
	System.out.println("Temperatura em Rankine é: " + Ra);
  }
}
