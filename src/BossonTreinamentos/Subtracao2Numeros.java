package BossonTreinamentos;

import java.util.Scanner;

public class Subtracao2Numeros {

	public static void main(String[] args) {
       
		Scanner in = new Scanner(System.in);
		
		int numX ,numY,resultado;
		System.out.println("Digite numero X ");
		numX = Integer.parseInt(in.nextLine());
		System.out.println("Digite numero Y ");
		numY = Integer.parseInt(in.nextLine());
		
		resultado = numX - numY;
		
		System.out.println(numX+ " - "+numY+ " = "+resultado);

	}

}
