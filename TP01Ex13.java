//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438


//Exercicio 13: Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
//valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
//(em s) que serão digitados.

import java.util.Scanner;

public class TP01Ex13{
	
	public static void main (String[] args){
		
		System.out.println("Digite a velocidade inicial(em m/s): ");
		Scanner scan = new Scanner(System.in);
		double vInicial = scan.nextDouble();
		
		System.out.println("Digite a aceleração(em m/s2): ");
		double aceleracao = scan.nextDouble();
		
		System.out.println("Digite o tempo: ");
		double tempo = scan.nextDouble();
		
		double vFinal = vInicial + (aceleracao * tempo);
		
		System.out.println("A velocidade final em Km/h e: " + vFinal);
		
	}
	
}