//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438


//Exercicio 15: Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
//dólares. Calcular e exibir o valor correspondente em Reais (R$).  

import java.util.Scanner;

public class TP01Ex15{
	
	public static void main (String[] args){
		
		System.out.println("Digite o valor da cotacao atual do dolar: ");
		Scanner scan = new Scanner(System.in);
		double cotacaoDolar = scan.nextDouble();
		
		System.out.println("Digite a quantidade de dolares para convercao: ");
		double dolar = scan.nextDouble();
		
		double real = cotacaoDolar * dolar;
		
		System.out.println("A quantidade de reais e: " + real);
		
	}
	
}