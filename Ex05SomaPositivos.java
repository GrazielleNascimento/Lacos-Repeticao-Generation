package lacosRepeticao;

import java.util.Scanner;

public class Ex05SomaPositivos {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num, soma=0;
	
	do {
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		
		if(num > 0) {
			soma += num;
		}
		
		
		
	}while(num != 0);
	
	System.out.println("A soma dos números positivos é: " + soma);
	sc.close();

	}

}
