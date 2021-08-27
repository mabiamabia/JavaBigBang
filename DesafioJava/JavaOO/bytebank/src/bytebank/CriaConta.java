package bytebank;

public class CriaConta {

	public static void main(String[] args) {
			Conta primeiraConta = new Conta();
			primeiraConta.saldo = 200;
			System.out.println(primeiraConta.saldo);
			
			primeiraConta.saldo += 100;
			System.out.println(primeiraConta.saldo);
			
			Conta segundaConta = new Conta();
			segundaConta.saldo = 50;
			System.out.println("Na primeira conta tem R$ " + primeiraConta.saldo);
			System.out.println("Na segunda conta tem R$ " + segundaConta.saldo);
			
			System.out.println(primeiraConta.agencia);
			System.out.println(segundaConta.numero);
			
			System.out.println(primeiraConta.agencia);
			
			segundaConta.agencia = 146;
			System.out.println("agora a segunda conta esta na agencia " + segundaConta.agencia);
			
			if(primeiraConta == segundaConta) {
				System.out.println("São a mesma conta");
			}else {
				System.out.println("Não é a mesma conta, são diferentes");
			}
			
	}

}
