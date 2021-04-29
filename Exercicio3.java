package course;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// se n1 % n2 == 0 então esses numeros são multiplos entre si
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int primeiroNumero = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int segundoNumero = sc.nextInt();
		
		if((primeiroNumero >= segundoNumero)&& (primeiroNumero % segundoNumero == 0)) {
			System.out.print("Os números: ");
			System.out.print(primeiroNumero);
			System.out.print(" e ");
			System.out.print( segundoNumero);
			System.out.print(", são multiplos entre si");
			
		} else if((segundoNumero >= primeiroNumero) && (segundoNumero % primeiroNumero == 0)) {
			System.out.print("Os números: ");
			System.out.print(primeiroNumero);
			System.out.print(" e ");
			System.out.print( segundoNumero);
			System.out.print(", são multiplos entre si");
			
		} else {
			System.out.print("Os números: ");
			System.out.print(primeiroNumero);
			System.out.print(" e ");
			System.out.print(segundoNumero);
			System.out.print(", NÃO são multiplos entre si");
		}
		sc.close();
	}

}
