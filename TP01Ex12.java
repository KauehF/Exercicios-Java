//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438


//Exercicio 12: Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
//base que serão digitados.

import java.util.Scanner;

public class TP01Ex12{
	
	public static void main (String[] args){
		
		System.out.println("Digite o valor do raio da base: ");
		Scanner scan = new Scanner(System.in);
		double raio = scan.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		double altura = scan.nextDouble();
		
		double pi = 3.14;
		
		double volume = (1.0/3.0) * pi * (raio * raio) * altura;
		
		System.out.println("O volume do cone e: " + volume);
		
	}
	
}