//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438


//Exercicio 10: Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
//exibir sua temperatura equivalente em Fahrenheit.

import java.util.Scanner;

public class TP01Ex10{
	
	public static void main (String[] args){
		
		System.out.println("Digite o valor da temperatura em Celsius: ");
		Scanner scan = new Scanner(System.in);
		double celsius = scan.nextDouble();
		
		double fahrenheit = (celsius * 1.8) + 32;
		
		System.out.println("A temperatura em Fahrenheit e: " + fahrenheit);
		
	}
	
}