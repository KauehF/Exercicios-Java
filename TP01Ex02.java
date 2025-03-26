//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438

// Exercicio 2: Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.

import java.util.Scanner;

public class TP01Ex02{
	
	public static void main (String[] args){
		
		System.out.println("Digite o tamanho da aresta do quadrado: ");
		Scanner scan = new Scanner(System.in);
		double aresta = scan.nextDouble();
		
		double area = aresta * aresta;
		System.out.println("A area do quadrado e: " + area);
	}
	
}