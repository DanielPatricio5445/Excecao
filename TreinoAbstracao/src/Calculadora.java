import java.util.Scanner;
public class Calculadora {
	Scanner scan = new Scanner(System.in);
	double num1;
	double num2;
	Calculadora calc = new Calculadora();
	
	public double soma(double num1, double num2) {
		return num1 + num2;
	}
	public double subtracao(double num1, double num2) {
		return  num1 - num2;
	}
	public double multiplicacao(double num1, double num2)
	{
		return num1 * num2;
	}
	public double divisao(double num1, double num2)
	{
		
		return num1/num2;
		
	}
public void selecionarop(int n)
	
	
	{
		switch (n) {
	
	case 1:
		recebervalores();
	System.out.println(calc.soma(num1,num2));
	break; 
	
	case 2:
		recebervalores();
	System.out.println(calc.subtracao(num1,num2));
	break;
	case 3:
		recebervalores();
	System.out.println(calc.multiplicacao(num1, num2));
	break;
	case 4:
		recebervalores();
	System.out.println(calc.divisao(num1, num2));
	break;
		}
	
	}
	
	
	public void recebervalores()
	{
		System.out.println("Abaixo escreva o valor 1:");
		double num1 = scan.nextDouble();
		System.out.println("Abaixo escreva o valor 2:");
		double num2 = scan.nextDouble();
		Calculadora calc = new Calculadora();
	}
}

