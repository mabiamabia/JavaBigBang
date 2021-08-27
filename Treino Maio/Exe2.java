package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Entre com as coordenadas X e Y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int quadrante = 0;
		
		
		while(x != 0 && y != 0) {
			System.out.print("As coordenadas digitadas pertencem ao quadrante: ");
			if (x > 0 && y > 0) {
				quadrante = 1;
			} else if(x > 0 && y < 0) {
				quadrante = 2;
			}else if(x < 0 && y < 0) {
				quadrante = 3;
			}else {
				quadrante = 4;
			}
			System.out.println(quadrante);
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("Uma das coordenadas que você digitou, é nula");
		
		sc.close();
	}

}
