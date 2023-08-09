package br.com.fiap;

//Classe principal (main)

public class App {
	
	public static void main(String[] args) {
		
		//Declaraçao obeto do tipo contax/constutor
		Conta contax = new Conta();
		
		contax.setNome("Bianca");
		
				
		//Para mostrar no console
		//System.out.println(contax.getNome() );
		
		//Outro objeto
		Conta contay = new Conta("Mel","123456", "245" );
		contay.depositar(1000);
		double saldo = contay.getSaldo();
		
		System.out.println("Saldo = R$ " + saldo);
		
		contay.sacar(200.50);
		saldo = contay.getSaldo();
		
		System.out.println("Olá, " + contay.getNome() );
		
		System.out.println("Seu Saldo é = R$ " + saldo);
		
		
	}

}
