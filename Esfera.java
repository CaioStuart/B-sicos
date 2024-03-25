package atividades;

import java.util.Scanner;
public class Esfera {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		
		// Entrada
		System.out.println("Digite o valor do Raio: ");
		double raio = sc.nextDouble();
		
		double resposta = calculaArea(raio);
		double volume = calculaVolume(raio);
		
		System.out.printf("Area   : %10.3f\n", calculaArea(raio));
		System.out.printf("Volume : %10.3f\n", calculaVolume(raio));
	}

	public static double calculaArea(Double r) {
		double area = 4 * Math.PI * Math.pow(r, 2);
		return area;
	}
	public static double calculaVolume(Double r) {
		return (double) 3/4 * Math.PI * Math.pow(r, 3);
		
	
	}
}