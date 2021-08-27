package exercicios;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valorInteiro = sc.nextInt();
		
		for(int i = 1; i <= valorInteiro; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
