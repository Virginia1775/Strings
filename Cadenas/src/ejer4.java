import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("introduce un texto");
		String cadena = entrada.nextLine();

		System.out.println("Introduce el caracter a buscar: ");
		char letra = entrada.nextLine().charAt(0);

		int posicion = cadena.indexOf(letra);
		if (posicion==-1) {
			System.out.println("No se ha encontrado la letra");
		}
		while (posicion!=-1) {
			System.out.printf("La letra %c está en la posición %d\n",
					letra, posicion);
			posicion = cadena.indexOf(letra, posicion+1);
		}

	}

}
