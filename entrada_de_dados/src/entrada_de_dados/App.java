package entrada_de_dados;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		System.out.println("Digite algo!");
		x = sc.next();
		System.out.println("Você digitou: '" + x + "'" );
		
		System.out.println("Agora me informe um número!");
		try {
			y = sc.nextInt();
			System.out.println("Você digitou o número: '" + y + "'");
			
		} catch (Exception e) {
			System.out.println("Ops! Você não digitou um número!");
		}
		sc.close();
	}

}
