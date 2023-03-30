package ProgrammingLogicWithArray;

import java.util.Scanner;

public class EntradaDeCincoNomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String[] nomes = new String[5];
		int cont ;
		for( cont = 0;cont <=4;cont++) {
			System.out.println("Digite um nome ");
			nomes[cont]= in.nextLine();

		}
		System.out.println("\n Os Nomes digitados foram ");
		for( cont = 0;cont <=4;cont++) {
			
			System.out.println(nomes[cont]);
		}
		System.out.println("\n Os Nomes digitados em Ordem inversa foram");
		
		for( cont = 4;cont <=0;cont--) {
			
			System.out.println(nomes[cont]);
		}
	}

}
