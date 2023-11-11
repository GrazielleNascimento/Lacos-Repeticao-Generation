package lacosRepeticao;

import java.util.Scanner;

public class Ex06MultiplosMedia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdMultiplos = 0;
		double media, soma = 0, num;
		
		do {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			if (num % 3 == 0 && num != 0) {
				qtdMultiplos++;
				soma += num;
			}

		} while (num != 0);
		
		media = soma / qtdMultiplos;
		System.out.println("A média de todos os nuúmeros múltiplos de 3 é: " +  media);
		sc.close();
	}

}
