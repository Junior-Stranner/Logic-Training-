package ExcerciciosUdemy;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		double nota = 0;
		int quantidadeNotas = 0;
		double mediaNotas	=0;	
		int cont = 0;
		while( cont <2) {
		System.out.println("Digite a nota");
		 nota = Double.parseDouble(in.nextLine());
		cont++;
		quantidadeNotas++;
		mediaNotas+=nota;
	
		}
		double media = mediaNotas / quantidadeNotas;
		if(media>=7) {
			System.out.println("Aluno Aprovado");
		}else if(media <7 && media > 5) {
			System.out.println("Aluno em Recuperação");
		}else {
			System.out.println("Aluno Reprovado");
		}
		System.out.println("média é "+media);
	}

}
