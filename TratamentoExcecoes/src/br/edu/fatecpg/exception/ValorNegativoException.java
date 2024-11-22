package br.edu.fatecpg.exception;

public class ValorNegativoException extends Exception{
	public ValorNegativoException() {
		super("O valor não pode ser negativo");
	}
	
}
