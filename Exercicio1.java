package course;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int firstNumber = sc.nextInt();
		
		if(firstNumber < 0) {
			System.out.println("O n�mero que voc� digitou, � negativo");
		} else {
			System.out.println("O n�mero que voc� digitou � positivo");
		}
		
		sc.close();

	}

}
