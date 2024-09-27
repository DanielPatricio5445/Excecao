package br.edu.fatecpg.sobrecarga.view;

import br.edu.fatecpg.sobrecarga.model.Converter;

public class Main {

	public static void main(String[] args) {
		Converter produto = new Converter();
		
		System.out.print(produto.converter(5.555));
		System.out.print(produto.converter(5));
		System.out.print(produto.converter("Daniel"));
	}

}
