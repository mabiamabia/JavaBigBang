package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
	 /*
	  * entrada
	  * while
	  * variavel senha
	  */
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a senha: ");
	int senha = sc.nextInt();
	
	while(senha != 2002) {
		System.out.println("Senha Inválida, digite a senha correta");
		senha = sc.nextInt();
	}
	System.out.println("Acesso Permitido");

	sc.close();

	}

}
