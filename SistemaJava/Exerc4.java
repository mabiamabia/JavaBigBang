package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(b == 0) {
				System.out.println("Divisão Impossível!");
			} else {
				double divisao = a / b;
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		sc.close();
		

	}

}
