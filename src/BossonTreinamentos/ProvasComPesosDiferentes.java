package BossonTreinamentos;

import java.util.Scanner;

public class ProvasComPesosDiferentes {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println(" Prova 1");
		float prova1 = Float.parseFloat(in.nextLine());
		System.out.println(" Prova 2");
		float prova2 = Float.parseFloat(in.nextLine());
		System.out.println(" Prova 3");
		float prova3 = Float.parseFloat(in.nextLine());
		
		float soma = (prova1 * 2) + (prova2 * 3 )+ (prova3 * 5);
		float media = soma /10;
		
		System.out.println("A media do Aluno x e : "+media);
		
		
	}

}
