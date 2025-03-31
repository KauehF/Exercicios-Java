//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438


//Exercicio 18: Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
//valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido. 

import java.util.Scanner;

public class TP01Ex18{
	
	public static void main (String[] args){
		
		System.out.println("Digite o valor dos 5 produtos: ");
		Scanner scan = new Scanner(System.in);
		double prod1 = scan.nextDouble();
		double prod2 = scan.nextDouble();
		double prod3 = scan.nextDouble();
		double prod4 = scan.nextDouble();
		double prod5 = scan.nextDouble();
		
		double valorProd = prod1 + prod2 + prod3 + prod4 + prod5;
		
		System.out.println("Digite o valor do dinheiro recebido: ");
		double valorRecebido = scan.nextDouble();
		
		double troco = valorRecebido - valorProd;
		
        System.out.println("O troco deve ser de: " + troco);
	}
	
}