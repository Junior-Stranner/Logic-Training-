package BossonTreinamentos;

import java.util.Scanner;

public class DescobrirOVolume {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	
		
		float altura = 60 ,largura = 50 ,profundidade  = 10;
	
		float volume = altura* largura * profundidade ;
		
		System.out.println("Volume da Caixa d Agua e : "+volume+" cm");
	}

}
