package atividades;

public class Esfera {

	double raio;
	double area;
	double volume;
	
	Esfera(double raio){
		this.raio = raio;
	}
	void calculaArea() {
			area = 4 * Math.PI * Math.pow(raio, 2);
	}
	void calculaVolume() {
		volume = (double) 3/4 * Math.PI * Math.pow(raio, 3);
	}	
}
