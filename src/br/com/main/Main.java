package br.com.main;

import br.com.model.*;

public class Main {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Ana", 25, 1000);
		gerente.Bonificacao();
		
		Supervisor supervisor = new Supervisor("Jo�o", 35, 2000); 
		supervisor.Bonificacao();
		
		Vendedor vendedor = new Vendedor("Leonardo", 20, 1000);
		vendedor.Bonificacao();
	}
}
