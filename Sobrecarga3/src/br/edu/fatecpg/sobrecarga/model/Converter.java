package br.edu.fatecpg.sobrecarga.model;

public class Converter {
	
	public void converter(double n1)
	{
		double r = n1 * 31;
	}
	public void converter(int n1)
	{
		double r = n1 / 1609;
	}
	public void converter(String n1)
	{
		n1.toUpperCase();
	}
	

}
