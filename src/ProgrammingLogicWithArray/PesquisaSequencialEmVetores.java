package ProgrammingLogicWithArray;

import java.util.Scanner;

public class PesquisaSequencialEmVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int[] vet = new int[3];
	   int posicao,num;
	   
	   for(posicao = 0; posicao <3 ; posicao++) {
		   System.out.println("Digite um valor para o Array");
		   vet[posicao] = Integer.parseInt(in.nextLine());
	   }
	   
	   System.out.println("Digite um numero para pesquisar no Array");
	   num = Integer.parseInt(in.nextLine());
	   
	   posicao = 1;
	   
	   while(posicao < 3 && vet[posicao] != num) {
		   posicao = +1;
	   }
	   if(vet[posicao] == num) {
		   System.out.println("numero encontrado na Posicao "+posicao);
	   }else {
		   System.out.println("numero nao encontrado no Array");
	   }
	}

}
