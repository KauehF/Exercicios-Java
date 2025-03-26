//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438


 //Exercicio 5: Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.

import java.util.Scanner;

public class TP01Ex05{
	
	public static void main (String[] args){
		
		System.out.println("Digite o valor do diametro: ");
		Scanner scan = new Scanner(System.in);
		double diametro = scan.nextDouble();
		
		double raio = (diametro / 2);
		double pi = 3.14;
		
		double area = (4.0/3.0) * pi * (raio * raio * raio);
		
		System.out.println("O volume da esfera e: " + area);
		
	}
	
}