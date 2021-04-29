package course;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio6 {

	public static void main(String[] args) {

		System.out.println("Digite um n�mero qualquer: ");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numb = sc.nextDouble();
		
		if((numb >= 0) && (numb <= 25)) {
			System.out.println("O numero que voc� digitou est� entre 0 e 25");
		} else if ((numb > 25) && (numb < 50)) {
			System.out.println("O numero que voc� digitou est� entre 25 e 50");
		}else if ((numb > 50) && (numb < 75)) {
			System.out.println("O numero que voc� digitou est� entre 50 e 75");
		}else if ((numb > 75) && (numb <= 100)) {
			System.out.println("O numero que voc� digitou est� entre 75 e 100");
		} else {
			System.out.println("O n�mero digitado est� fora do intervalo");
		}
		sc.close();
	}
}
