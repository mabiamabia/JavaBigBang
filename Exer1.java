package exercicios;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para ver sua tabuada: ");
		int numero = sc.nextInt();
		
		for(int i=1; i <= 10; i++) {
			int produto = i * numero;
			System.out.println(i + " X " + numero + " = " + produto);
		}
				
		sc.close();
		

	}

}
