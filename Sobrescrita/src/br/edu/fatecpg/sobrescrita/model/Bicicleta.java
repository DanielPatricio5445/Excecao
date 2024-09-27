package br.edu.fatecpg.sobrescrita.model;

public class Bicicleta extends Veiculo{
	private String cor;
	
	public Bicicleta (String mrc, String cor) {
		super(mrc);
		this.cor = cor;
	}
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("Bicicleta está pedalando!");
	}
}
