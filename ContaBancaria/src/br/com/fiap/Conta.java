package br.com.fiap;


	// definição da classe

	public class Conta {
	
	//atributos
	
	private String nome;
	private String numeroDaConta;
	private String agencia;
	private double saldo;
	
	//construtores
	//padrão
	
	public Conta() {}
	
	//construtor com argumentos
	public Conta(String nome, String numeroDaConta, String agencia) {
		this.nome = nome;
		this.numeroDaConta = numeroDaConta;
		this.agencia = agencia ; 
	}
	
	
	//metodos
	//acessores -get - retorna valor
	
	public String getNome() {
		return nome;
	}
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	public String getAgencia() {
		return agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	//metodos
	//modificadores - set
	
	public void setNome(String nomeDoTitular) {
		
		//this. serve para falar que esse nome ta lá em cima
		this.nome = nomeDoTitular;
	}
	
	public void setNumeroDaConta(String numeroDaConta) {
			
		//this. serve para falar que esse nome ta lá em cima
		this.numeroDaConta = numeroDaConta;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
		
	
	//metodos da nossa lógica
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	public void sacar(double valor) {
		saldo = saldo - valor;
		}

}
