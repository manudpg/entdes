package ejercicios;

public class Metodos {

	public static void main(String[] args) {

	}


	static String concatenacion (String palabra1, String palabra2) {

		return palabra1 + palabra2;


	}

	static char caracter(int numero) {

		char valorCaracter = (char) numero;

		return valorCaracter;
	}



	static int valorDecimal (char caracter) {

		int valor = caracter;

		return valor;
	}
	static void multiplos3Hasta(int numero) {


		System.out.println("Los multiplos de 3 hasta el " + numero + " son : ");

		for (int i = 0; i < numero; i++) {


			if(i % 3 == 0 ){

				System.out.println(i);

			}
		}
	}
	
	static void cuentaAtras(int origen , int restador) {


		for (int i = origen; i >=0; i -=restador) {


			System.out.println(i);

		}
	}

	 
}

