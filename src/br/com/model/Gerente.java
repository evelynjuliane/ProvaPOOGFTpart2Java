package br.com.model;

public class Gerente extends Funcionario{

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	public double Bonificacao() {
		salario +=  10000.00;
		super.Bonificacao();
		return salario;
	}
	
}
