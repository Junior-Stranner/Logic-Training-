package BossonTreinamentos;

public class InvbersaoDeValores {

	public static void main(String[] args) {

		int a = 10,b = 20 , c = a + 20,d = a + b + 20, z = 0;
		
		System.out.println("Vamos Realizar a Troca desses valores , sem Mistura eles"
				+ "\n");
		
		z = a;
		a = b;
		b = c;
	    c = d;
	    d = z;
		
		
		System.out.println("A"+a+" , B "+b+" , C "+c+" , D "+d
				+" \n"
				+" \n Troca de Valores Realizado assim "
				+" \n A Ficou com Valor B"
				+" \n B ficou com valor C"
				+" \n C ficou com Valor de D "
				+" \n D Recebe A");
		
		
	}

}
