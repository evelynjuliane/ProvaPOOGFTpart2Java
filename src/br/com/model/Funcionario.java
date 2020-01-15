package br.com.model;

public abstract class Funcionario {
	
	
	protected String nome;
	protected int idade;
	protected Double salario;
	
	
	public Funcionario(String nome, int idade, Double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public double Bonificacao() {
		System.out.println(salario);
		return salario;
		
	}
}
