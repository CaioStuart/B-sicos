package atividades;

import java.util.Scanner;
public class AppEsferaEstruturada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		
		// Entrada
		System.out.println("Digite o valor do Raio: ");
		double raio = sc.nextDouble();
		
		
		Esfera esfera = new Esfera(raio);
		
		System.out.println("Raio    : " + esfera.raio);
		System.out.println("Área    : " + esfera.area);
		System.out.println("Volume  : " + esfera.volume);
		
		esfera.calculaArea();
		esfera.calculaVolume();
		System.out.println("................................");
		System.out.println("Raio    :        " + esfera.raio);
		System.out.printf("Área    : %10.3f\n", esfera.area);
		System.out.printf("Volume  : %10.3f\n", esfera.volume);
		
		
	}
}