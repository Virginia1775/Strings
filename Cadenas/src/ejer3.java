import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("introduce un texto");
		String cadena = entrada.nextLine();

		System.out.println("Introduce el caracter a buscar: ");
		char letra = entrada.nextLine().charAt(0);

		int posicion = -1;
		char vector []= cadena.toCharArray();
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == letra) {
				posicion=i;
				System.out.printf("El caracter %c está en la posición %d\n",
						letra, posicion);
			}
		}
		/*
		int posicion=-1;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == letra) {
				posicion=i;
				System.out.printf("El caracter %c está en la posición %d\n",
						letra, posicion);
			}
		}*/
		if (posicion == -1) {
			System.out.println("No se ha encontrado el caracter");
		}


	}



	}


