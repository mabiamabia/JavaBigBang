package exercicios;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i = 0; i<numero; i++) {
			int x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in = in + 1;
			} else {
				out  = out +  1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
