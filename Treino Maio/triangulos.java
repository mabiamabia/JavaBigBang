package orientaObj;

import java.util.Scanner;

public class triangulos {

	public static void main(String[] args) {
		System.out.println("Entre com as medidas do primeiro triangulo:");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int p = (a+b+c)/2;
		int areaTriangulo = p * (p - a) * (p - b) * (p - c);
		
		System.out.println(p);
		System.out.println(areaTriangulo);
		
		sc.close();

	}

}
