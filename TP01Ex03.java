//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438

// Exercicio 3: Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.

import java.util.Scanner;

public class TP01Ex03{
	
	public static void main (String[] args){
		
		System.out.println("Digite o valor da diagonal do quadrado: ");
		Scanner scan = new Scanner(System.in);
		double diagonal = scan.nextDouble();
		
		double area = (diagonal * diagonal) / 2;
		
		System.out.println("A area do quadrado vale: " + area);
		
	}
	
}