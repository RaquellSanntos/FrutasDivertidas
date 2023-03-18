import java.util.Scanner;

public class InserirDadoPeloTeclado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		//Entrada de texto
		String nome;
		System.out.println("Digite aqui o nome em seguida ENTER: ");
		nome = scanner.next();
		System.out.println("voce digitou: " + nome);
		
		//Entrada de numeros
		int numero;
		System.out.println("Digite aqui um número em seguida ENTER: ");
		numero = scanner.nextInt();
				System.out.println("voce digitou: " + numero);
		scanner.close();
	}

}
