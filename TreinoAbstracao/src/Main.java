import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ystem.out.println("Olá!");
		//String nome = "Ale";
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Opção - 1 - SOma");
		//System.out.println("Opção - 2 - Subtração");
		//System.out.println("Opção - 3 - Multiplição");
		//System.out.println("Opção - 4 - Divisão");
		//System.out.println("Abaixo escreva a opção que desejar");
		//int n;
		//n = scan.nextInt();
		
		
		Girafa giraMili = new Girafa(1.5, 45.5);
		
		giraMili.comer();
		
		System.out.println(giraMili.idade);
		
		Cinema cinema = new Cinema(100, 100, 100);
		cinema.passarfilme();
		
		System.out.println(cinema.qtdlugar);
		
		ArteDigital arte = new ArteDigital("Pixel", "Vintage", "Caneta");
		arte.Representaralgo();
		
		System.out.println(arte.estilo);
		
		IdadeMedia ano_ = new IdadeMedia(100, "Romana", "Grega");
		
		System.out.println(ano_.ano);
		
		Osmose agua = new Osmose();
		agua.transportaragua();
		
		
		
		
		
	}

}
