package course;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// min 1h max 24h , 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a hora inicial do jogo: ");
		int horaInicial = sc.nextInt();
		
		System.out.println("Entre com a hora final do jogo: ");
		int horaFinal = sc.nextInt();
		
		int total = (horaFinal - horaInicial);
		
		System.out.print("A duração do jogo foi de: ");
		System.out.print(total);
		System.out.print(" horas");
		
		sc.close();

	}

}
