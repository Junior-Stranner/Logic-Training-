package ProgrammingLogicWithArray;

import java.util.Scanner;

public class EntradaDeDezNumerosArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] numA = new int[5];
		int[] numB = new int[5];
		int res = 0;

		for(int i = 0; i < 5;i++) {
			System.out.println("Digite um numero");
			numA[i] = Integer.parseInt(in.nextLine());

			numB[i] = numA[i] * 5;
			res = numB[i];
		}
		for(int i = 0; i < 5;i++) {
		
		System.out.println(numA[i]+" "+numB[i]);
		}
	}

}
