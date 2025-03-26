//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438

//Exercicio 7: Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.

import java.util.Scanner;

public class TP01Ex07{
	
	public static void main (String[] args){
		
		System.out.println("Digite o valor do primeiro numero: ");
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();

		System.out.println("Digite o valor do segundo numero: ");
		double num2 = scan.nextDouble();		

		double mult = num1 * num2;
		
		double media = Math.sqrt(mult);
		
		System.out.println("A media aritimetica dos quatro numeros e: " + media);
		
	}
	
}