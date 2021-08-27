package course;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		double um = 4.00;
		double dois = 4.50;
		double tres = 5.00;
		double quatro = 2.00;
		double cinco = 1.50;
		
		System.out.println("Seja Bem Vinda ao restaurante Comendo bem Que Mal Tem!");
		System.out.println("um - Cachorro Quente");
		System.out.println("dois - X-Salada");
		System.out.println("tres - X-Bacon");
		System.out.println("quatro - Torrada Simples");
		System.out.println("cinco - Refrigerante");
		
		
		System.out.println("Digite o número do seu pedido: ");
		try (Scanner sc = new Scanner(System.in)) {
			int pedido1 = sc.nextInt();
			
			if(pedido1 == um) {
				System.out.print("Você pediu um Cachorro quente, que custa R$ ");
				System.out.println(um);
				
			} else if (pedido1 == dois) {
				System.out.print("Você pediu um X-Salada, que custa R$ ");
				System.out.println(dois);
				
			}else if (pedido1 == tres){
				System.out.print("Você pediu um X-Bacon, que custa R$ ");
				System.out.println(tres);
				
			}else if (pedido1 == quatro) {
				System.out.print("Você pediu uma Torrada Simples, que custa R$ ");
				System.out.println(quatro);
				
			}else if (pedido1 == cinco) {
				System.out.print("Você pediu um Refrigerante, que custa R$ ");
				System.out.println(cinco);
			}
		}

	}

}
