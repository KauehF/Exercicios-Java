//Lucas da Silva Santos CB3030598
//Kaueh Farias Ferreira dos Santos CB3031438


//Exercicio 16: Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
//seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
//Lembre-se que uma função trigonométrica trabalha em radianos. 

import java.util.Scanner;

public class TP01Ex16{
	
	public static void main (String[] args){
		
		System.out.println("Digite o angulo em graus: ");
		Scanner scan = new Scanner(System.in);
		double anguloGraus = scan.nextDouble();
		
        double anguloRadianos = Math.toRadians(anguloGraus);
        
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        double secante = 1 / cosseno;
        
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
	}
	
}