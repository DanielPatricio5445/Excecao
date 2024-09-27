package br.edu.fatecpg.sobrescrita.model;

//extends é a palavra reservada
public class Carro extends Veiculo{
	private String modelo;
	
	public Carro(String mrc, String mdl) {
		//super porque ele vem do veiculo
		super(mrc);
		this.modelo = mdl;
	}
	//a overhide informa ao sistema que o método ja existe 
	//na super classe, mas ele teve o comportamento alterado
	
	@Override //sobrescreve
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("O carro está dirigindo!");
	}

}
