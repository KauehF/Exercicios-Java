//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438


//Exercicio 8: Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e dois metros e 
//que um quilômetro possui mil metros, fazer um programa para converter milhas marítimas em quilômetros.

import java.util.Scanner;

public class TP01Ex08{
	
	public static void main (String[] args){
		
		System.out.println("Digite a quantida de milhas maritimas: ");
		Scanner scan = new Scanner(System.in);
		double milhaM = scan.nextDouble();
		
		double km = milhaM * 1.852; 
		
		System.out.println("A conversao de milha para quilometros e: " + km);
		
	}
	
}