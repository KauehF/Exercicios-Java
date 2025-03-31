//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438


//Exercicio 17: Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
//cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln. 

import java.util.Scanner;

public class TP01Ex17{
	
	public static void main (String[] args){
		
		System.out.println("Digite o valor de X: ");
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		
		System.out.println("Digite o valor de Y: ");
		double y = scan.nextDouble();
		
        double resultado = Math.exp(y * Math.log(x));

        System.out.println("O valor de X elevado a Y e: " + resultado);
	}
	
}