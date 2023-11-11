package lacosRepeticao;

import java.util.Scanner;

public class Ex01Multiplos {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i, num1, num2;
		
		System.out.println("\nEntre com o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("\nEntre com o primeiro número: ");
		num2 = sc.nextInt();
		sc.close();
		if(num1>num2) {
			System.out.println("Intervalo inválido");
		} else {
			for(i=num1; i<num2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
					
}
		}
	}
}