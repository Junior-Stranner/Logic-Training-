package BossonTreinamentos;

import java.util.Scanner;

public class Apresentacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("OLa , Qual e o seu nome ?");
		String nome = in.nextLine();
		
		System.out.println("Qual seria o seu SobreNome ?");
		String sobreNome = in.nextLine();
		
		System.out.println("Nome Completo : "+nome+" "+sobreNome);
	}

}
