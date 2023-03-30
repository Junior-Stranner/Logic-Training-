package ProgrammingLogicWithArray;

import java.util.Scanner;

public class OrdenacaoDeCodigo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int contadorA; 
		int contadorB,num = 0,aux; 
		int[] vet = new int[3];

		for( contadorA = 1 ; contadorA <= 3;contadorA++) {
           System.out.println("Digite um Numero");
           num = Integer.parseInt(in.nextLine());
           
           System.out.println("Vet"+"["+num+"]");
		}
		
		for(contadorA = 1 ;contadorA <= 2; contadorA++) {
			for(contadorB = 1 ; contadorA+1  <= 3; contadorB++) {
				
				if(vet[contadorA] > vet[contadorB]) {
					
					aux = vet[contadorB];
					vet[contadorB] = vet[contadorA];
					vet[contadorA] = aux;
				}
			}
		}
		for(contadorA = 1 ;contadorA <= 3; contadorA++) {
			System.out.println("vet"+"["+num+"]");
		}
		
	}

}
