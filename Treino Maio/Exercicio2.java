package course;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro, para saber se � par ou impar: " );
		int numeroDigitado = sc.nextInt();
		
		if(numeroDigitado % 2 == 0 ) {
			System.out.println("O n�mero � par!");
		} else {
			System.out.println("O n�mero � impar!");
		}
		
		
		sc.close();

	}

}
