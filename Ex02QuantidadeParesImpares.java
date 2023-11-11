package lacosRepeticao;

import java.util.Scanner;

public class Ex02QuantidadeParesImpares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, num, pares = 0, impares = 0;

		for (i = 1; i < 11; i++) {
			System.out.print("Digite o " + i + "º" + "numero" + ":  ");
			num = sc.nextInt();
			sc.close();
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}

		System.out.println("\nTotal de números pares: " + pares);
		System.out.println("Total de números impares: " + impares);

	
	}

}
