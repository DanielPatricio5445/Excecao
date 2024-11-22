package br.edu.fatecpg.service;

import br.edu.fatecpg.exception.ValorNegativoException;

public class VerificadorService {
	public void dividir(int num1, int num2) {
		if(num2 == 0)
		{
			throw new ArithmeticException("Divisão por Zero");
		}
		System.out.println(num1/num2);
	}
	public void verificaValor(int valor) throws ValorNegativoException{
		if(valor < 0)
		{
			throw new ValorNegativoException();
		}else {
			System.out.println("Valor aceito!" + valor);
			}
	}

}
