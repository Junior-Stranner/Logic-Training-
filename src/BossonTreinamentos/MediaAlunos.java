package BossonTreinamentos;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double avaliacaoA , avaliacaoB , avaliacaoRe = 0;
		double media = 0;
		String res = "",aluno;
		
		
		System.out.println("Digite o nome do Aluno ");
		aluno = in.nextLine();
		System.out.println("Digite a nota da Primeira avaliacao = ");
		avaliacaoA = Double.parseDouble(in.nextLine());
		System.out.println("Digite a nota da Primeira avaliacao = ");
		avaliacaoB = Double.parseDouble(in.nextLine());
		
		if(avaliacaoB < 6) {
			System.out.println("Prova de Recuperacao = ");
			avaliacaoRe = Double.parseDouble(in.nextLine());
		}else {
			System.out.println("Sua nota esta na media "
					+ ", Nao sera necessario uma Prova nova");
			avaliacaoRe = 0;
		}
		System.out.println("\n Resultados das Avaliacoes \n");
		System.out.println("Resultado da Primeira Prova = "+avaliacaoA);
		System.out.println("Resultado da Segunda Prova = "+avaliacaoB);
		System.out.println("Resultado da Prova de Recuperacao= "+avaliacaoRe);
		System.out.println("----------------------------------");

		
		avaliacaoB = (avaliacaoB + avaliacaoRe)/2;
		
		media = (avaliacaoA + avaliacaoB) /2;
		
		if(media >=7) {
		    res = "Aprovado";
		}else {
			res = "Reprovado";
		}
		System.out.println("Novo Resultado da Prova B : "+avaliacaoB);
		System.out.println(aluno+"Voce foi : "+res);
		System.out.println(aluno+"Suia Media e : "+media);

	}

}
