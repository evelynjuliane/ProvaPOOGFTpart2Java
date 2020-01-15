package br.com.model;

public class Supervisor extends Funcionario {
	
	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	public double Bonificacao() {
		salario += 5000.00;
		super.Bonificacao();
		return salario;
	}
	
}
