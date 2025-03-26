//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438

//Exercicio 6: Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

import java.util.Scanner;

public class TP01Ex06{
	
	public static void main (String[] args){
		
		System.out.println("Digite o valor do primeiro numero: ");
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();

		System.out.println("Digite o valor do segundo numero: ");
		double num2 = scan.nextDouble();		

		System.out.println("Digite o valor do terceiro numero: ");
		double num3 = scan.nextDouble();	
		
		System.out.println("Digite o valor do quarto numero: ");
		double num4 = scan.nextDouble();	
		
		double area = (num1 + num2 + num3 + num4) / 4;
		
		System.out.println("A media aritimetica dos quatro numeros e: " + area);
		
	}
	
}