package br.edu.fatecpg.view;

import br.edu.fatecpg.service.VerificadorService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerificadorService verifica = new VerificadorService();
		try {
			verifica.dividir(10, 0);
			verifica.verificaValor(0);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Sempre passa por aqui!");
		}
		
		
	}

}
