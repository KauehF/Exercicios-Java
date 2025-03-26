//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438

// Exercício 1: Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua 	área.

import java.util.Scanner;

public class TP01Ex01{
	
	public static void main (String[] args){
		
		System.out.println("Digite a base: ");
		Scanner scan = new Scanner(System.in);
		double base = scan.nextDouble();
		
		System.out.println("Digite a altura: ");
		double altura = scan.nextDouble();
		
		double area = base * altura;
		
		System.out.println("A area do retangulo e: " + area);
		
	}
	
}