
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		int idade = 21;
		int quantidadePessoas = 1;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("Valor de acompanhado =" + acompanhado);
		
		System.out.println("valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vinda!");
		} else {
			System.out.println("Você não pode entrar!");
		}
		
		
		
		
	}
}

		