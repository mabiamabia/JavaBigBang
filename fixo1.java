package exercicios;

import java.util.Scanner;

public class fixo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		while(n < 0) {
			System.out.println("O número digitado não é positivo, digite um número positivo: ");
			n = sc.nextInt();
		
		for(int i = 1; i <= n; i++ ) {
			System.out.println("Digite um número para x: ");
			System.out.println("Digite um numero para y: ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x > y) {
				System.out.println("O número " + x + " é o maior");
			}
		}
		sc.close();
		}
}
}