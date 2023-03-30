package ProgrammingLogicWithArray;

import java.util.Scanner;

public class somatorioDeCincoNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int[] num = new int[4];
		int soma = 0;
		
		for(int cont = 0; cont <4 ; cont++) {
			System.out.println("Digite um Numero ");
			num[cont] = Integer.parseInt(in.nextLine());
			
			soma = soma+num[cont];
			
		}
		System.out.println("A soma dos numeros e "+soma);
		
		for(int cont = 0; cont <4 ; cont++) {
			System.out.println(num[cont]);
		}
	}

}
