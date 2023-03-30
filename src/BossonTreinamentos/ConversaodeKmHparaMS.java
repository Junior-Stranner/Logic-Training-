package BossonTreinamentos;

import java.util.Scanner;

public class ConversaodeKmHparaMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		double velKmh,ms = 1000;

		System.out.println(" digite a velocidade que o veiculo esta indo ");
		velKmh = Double.parseDouble(in.nextLine());

		
		ms = velKmh * ms;
		System.out.println("A velocidade do Veiculo em Metros por segundo ms e : "+ms);
	}
}
