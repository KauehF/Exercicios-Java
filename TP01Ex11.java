//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438


//Exercicio 11: A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.

import java.util.Scanner;

public class TP01Ex11{
	
	public static void main (String[] args){
		
		System.out.println("Digite o valor ddo diametro do circulo: ");
		Scanner scan = new Scanner(System.in);
		double diametro = scan.nextDouble();
		
		double raio = diametro / 2;
		
		double pi = 3.14;
		
		double area = pi * (raio * raio);
		
		System.out.println("A area do circulo e: " + area);
		
	}
	
}