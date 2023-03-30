package BossonTreinamentos;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		float base , altura;
		
		System.out.println("Informe o tamanho da base ");
		base = Float.parseFloat(in.nextLine());
		System.out.println("Informe o tamanho da altura ");
		altura = Float.parseFloat(in.nextLine());
		
		float areaTriangulo = (base * altura) /2;
		
		System.out.println("Area do Triangulo "+areaTriangulo+ "cm");
		
		

	}

}
