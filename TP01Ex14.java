//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438


//Exercicio 14: Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
//“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão digitados. 

import java.util.Scanner;

public class TP01Ex14{
	
	public static void main (String[] args){
		
		double pi = 3.14;
		
		System.out.println("Digite o raio da esfera: ");
		Scanner scan = new Scanner(System.in);
		double raio = scan.nextDouble();
		
		System.out.println("Digite a aresta do cubo: ");
		double aresta = scan.nextDouble();
	
		double cubo = aresta * aresta * aresta; 
		double esfera = (4/3) * pi * (raio * raio * raio);
		
		double resultado = cubo - esfera;
		
		System.out.println("O volume livre do ambiente e: " + resultado);
		
	}
	
}