package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		System.out.println("Digite o valor do seu salario mensal: ");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto = 0;
		
		if(salario <= 2000.00) {
			System.out.println("Você está isenta do imposto");
		} else if(salario <= 3000.00) {
			imposto = (salario - 2000) * 0.08;
			System.out.println("Você pagará de imposto: ");
			System.out.println(imposto);
		} else if(salario <= 4500.00) {
			imposto = (salario - 3000) * 0.18 + 1000.0 * 0.08;
			System.out.println("Você pagará de imposto: ");
			System.out.println(imposto);
		} else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.println("Você pagará de imposto: ");
			System.out.println(imposto);
		}
		
		
		sc.close();
		
		

	}

}
