//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438


//Exercicio 9: Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
//valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.

import java.util.Scanner;

public class TP01Ex09{
	
	public static void main (String[] args){
		
		System.out.println("Digite o valor da resistencia: ");
		Scanner scan = new Scanner(System.in);
		double resistencia = scan.nextDouble();
		
		System.out.println("Digite o valor da corrente eletrica: ");
		double corrente = scan.nextDouble();
		
		double tensao = corrente * resistencia;
		
		System.out.println("A tensao do circuito e: " + tensao);
		
	}
	
}