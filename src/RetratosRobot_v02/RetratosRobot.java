package RetratosRobot_v02;

import java.util.Scanner;

public class RetratosRobot {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String pelo[] = { "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||" };
		String ojos[] = { "| 0   0 |", "|-{· ·}-|", "|-{o o}-|", "| \\   / |" };
		String nariz[] = { "@   J   @", "{   \\\"   }", "[   j   ]", "<   -   >" };
		String boca[] = { "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |" };
		String barbilla[] = { "\\_______/", "\\,,,,,,,/" };

		System.out.println("RETRATO ROBOT");
		System.out.println("-------------");
		System.out.println("PELO");
		System.out.println("1. WWWWWWWWW");
		System.out.println("2. \\\\\\//////");
		System.out.println("3. |\"\"\"\"\"\"\"|");
		System.out.println("4. |||||||||");
		int opcionPelo = teclado.nextInt();
		while (opcionPelo < 1 || opcionPelo > 4) {
			System.out.println("Opción no válida. Teclea de nuevo");
			opcionPelo = teclado.nextInt();
		}

		System.out.println(" ");
		System.out.println("OJOS");
		System.out.println("1. | 0   0 |");
		System.out.println("2. |-{· ·}-|");
		System.out.println("3. |-{o o}-|");
		System.out.println("4. | \\   / |");
		int opcionOjos = teclado.nextInt();
		while (opcionOjos < 1 || opcionOjos > 4) {
			System.out.println("Opción no válida. Teclea de nuevo");
			opcionOjos = teclado.nextInt();
		}
		System.out.println(" ");
		System.out.println("NARIZ");
		System.out.println("1. @   J   @");
		System.out.println("2. {   \"   }");
		System.out.println("3. [   j   ]");
		System.out.println("4. <   -   >");
		int opcionNariz = teclado.nextInt();
		while (opcionNariz < 1 || opcionNariz > 4) {
			System.out.println("Opción no válida. Teclea de nuevo");
			opcionNariz = teclado.nextInt();
		}
		System.out.println(" ");
		System.out.println("BOCA");
		System.out.println("1. |  ===  |");
		System.out.println("2. |   -   |");
		System.out.println("3. |  ___  |");
		System.out.println("4. |  ---  |");
		int opcionBoca = teclado.nextInt();
		while (opcionBoca < 1 || opcionBoca > 4) {
			System.out.println("Opción no válida. Teclea de nuevo");
			opcionBoca = teclado.nextInt();
		}
		System.out.println(" ");
		System.out.println("BARBILLA");
		System.out.println("1. \\_______/");
		System.out.println("2. \\,,,,,,,/");
		int opcionBarbilla = teclado.nextInt();
		while (opcionBarbilla < 1 || opcionBarbilla > 2) {
			System.out.println("Opción no válida. Teclea de nuevo");
			opcionBarbilla = teclado.nextInt();
		}

		System.out.println("-------------------");
		System.out.println("El resultado del retrato robot es: ");
		System.out.println(" ");

		System.out.println(pelo[opcionPelo - 1]);
		System.out.println(ojos[opcionOjos - 1]);
		System.out.println(nariz[opcionNariz - 1]);
		System.out.println(boca[opcionBoca - 1]);
		System.out.println(barbilla[opcionBarbilla - 1]);
	}

}
