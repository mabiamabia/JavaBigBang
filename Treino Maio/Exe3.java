package exercicios;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1-Álcool");
		System.out.println("2-Gasolina");
		System.out.println("3-Diesel");
		System.out.println("4-Fim");
		
		System.out.println("Digite o número do combustível que deseja adquirir: ");
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		
		while(codigo > 0 && codigo < 5) {
			if(codigo == 1) {
				System.out.println("Você escolheu Alcool");
			}else if (codigo == 2) {
				System.out.println("Você escolheu Gasolina");
			}else if (codigo ==  3) {
				System.out.println("Você escolheu Diesel");
			} else {
				System.out.println("Fim!");
			}System.out.println("Muito Obrigada pela compra, até a próxima!");
			codigo = sc.nextInt();
		}
		sc.close();

	}

}
