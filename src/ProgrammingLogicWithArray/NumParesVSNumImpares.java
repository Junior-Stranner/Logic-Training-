package ProgrammingLogicWithArray;

import java.util.Scanner;

public class NumParesVSNumImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int[] vetPar = new int[10];
		int[] vetImpar = new int[10];
		int num = 0;
		
		for(int i = 0; i <10 ; i++) {
		System.out.println("Digite um Numero");
		num = Integer.parseInt(in.nextLine());
	
			if(num % 2 ==0) {
				vetPar[i] = num;
			}else {
				vetImpar[i] = num;
			}
		}
		System.out.println("\n"
				+ "Array de Pares"
				+ "\n");
		for(int i = 0; i <10 ;i++) {
			System.out.println(vetPar[i]);
		}
		System.out.println("\n"
				+ "Array de Impares"
				+ "\n");
		for(int i = 0; i <10 ;i++) {
			System.out.println(vetImpar[i]);
		}
	}
}
