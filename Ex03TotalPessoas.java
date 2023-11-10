package lacosRepeticao;

import java.util.Scanner;

public class Ex03TotalPessoas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade, menor = 0, maior = 0;

		System.out.print("Digite uma idade: ");
		idade = sc.nextInt();

		while (idade >= 0) {
			if (idade < 21) {
				menor++;
			} 
			if (idade > 50) {
				maior++;
			}

			System.out.print("Digite uma idade: ");
			idade = sc.nextInt();
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menor);

		System.out.println("Total de pessoas maiores de 50 anos: " + maior);

		sc.close();
	}

}
