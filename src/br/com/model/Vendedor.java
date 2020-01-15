package br.com.model;

public class Vendedor extends Funcionario {
	
	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	public double Bonificacao() {
		salario += 3000.00;
		super.Bonificacao();
		return salario;
	}
	
}
