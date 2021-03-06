package ejercicios;

public class Metodos {

	public static void main(String[] args) {

		cuentaAtras(51, 5);

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


	static void cuentaAtras(int origen , int restador) {


		for (int i = origen; i >=0; i -=restador) {


			System.out.println(i);

		}


	}
}

