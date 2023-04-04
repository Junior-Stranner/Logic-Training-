package ExcerciciosUdemy;

public class VerificarAnoBisexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ano = 2000;
		int ano2023  = 2023;
		int cont;
		System.out.println("2023 é ano Bisetxto ? \n");

		for( cont = ano; cont <= ano2023;cont++ ) {
			if(cont % 4 ==0) {
				System.out.println(cont+" : é ano  Bisetxo  ");
			}else
				System.out.println(cont+ " : não é ano Bisexto  ");

			if(cont == ano2023) {
				System.out.println("\n \n "+ano2023+ " Não é ano Biosexto");
			}
		}
	}
}
