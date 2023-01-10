import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.printf("%s%n", "Hello World!");
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		int numero = input.nextInt();
		System.out.printf("Você digitou: %d%n", numero);

	}
}