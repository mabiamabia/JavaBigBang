package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		System.out.println("Digite um numero para ser o x:");
		System.out.println("Digite um número para ser o y: ");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if((x > 0) && (y > 0)) {
			System.out.println("Quadrante 1");
		} else if((x < 0) && (y > 0)) {
			System.out.println("Quadrante 2");
		}else if((y < 0) && ( x < 0)) {
			System.out.println("Quadrante 3");
		}else if((x > 0) && (y < 0)) {
			System.out.println("Quadrante 4");
		} else {
			System.out.println("Neutro");
		}
		
	}

}
