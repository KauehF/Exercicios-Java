//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438


 //Exercicio 4: A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

import java.util.Scanner;

public class TP01Ex04{
	
	public static void main (String[] args){
		
		System.out.println("Digite o valor da base do triangulo: ");
		Scanner scan = new Scanner(System.in);
		double base = scan.nextDouble();
		
		System.out.println("Digite o valor da altura do triangulo: ");
		double altura = scan.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("A area do triangulo vale: " + area);
		
	}
	
}