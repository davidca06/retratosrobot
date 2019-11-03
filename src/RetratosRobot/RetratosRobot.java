package RetratosRobot;

import java.util.Scanner;

public class RetratosRobot {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("RETRATO ROBOT");
		System.out.println("-------------");
		System.out.println("PELO");
		System.out.println("1. WWWWWWWWW");
		System.out.println("2. \\\\\\//////");
		System.out.println("3. |\"\"\"\"\"\"\"|");
		System.out.println("4. |||||||||");
		int pelo=teclado.nextInt();
		System.out.println(" ");
		System.out.println("OJOS");
		System.out.println("1. | 0   0 |");
		System.out.println("2. |-{· ·}-|");
		System.out.println("3. |-{o o}-|");
		System.out.println("4. | \\   / |");
		int ojos=teclado.nextInt();
		System.out.println(" ");
		System.out.println("NARIZ");
		System.out.println("1. @   J   @");
		System.out.println("2. {   \"   }");
		System.out.println("3. [   j   ]");
		System.out.println("4. <   -   >");
		int nariz=teclado.nextInt();
		System.out.println(" ");
		System.out.println("BOCA");
		System.out.println("1. |  ===  |");
		System.out.println("2. |   -   |");
		System.out.println("3. |  ___  |");
		System.out.println("4. |  ---  |");
		int boca=teclado.nextInt();
		System.out.println(" ");
		System.out.println("BARBILLA");
		System.out.println("1. \\_______/");
		System.out.println("2. \\,,,,,,,/");
		int barbilla=teclado.nextInt();
		System.out.println("-------------------");
		System.out.println("El resultado del retrato robot es: ");
		System.out.println(" ");
		switch (pelo)
		{
		case 1:
			System.out.println("WWWWWWWWW");
			break;
		case 2:
			System.out.println("\\\\\\//////");
			break;
		case 3:
			System.out.println("|\"\"\"\"\"\"\"|");
			break;
		case 4:
			System.out.println("|||||||||");
			break;
		default:
			System.out.println("Opción no válida");
		}
			switch (ojos)
			{
			case 1:
				System.out.println("| 0   0 |");
				break;
			case 2:
				System.out.println("|-{· ·}-|");
				break;
			case 3:
				System.out.println("|-{o o}-|");
				break;
			case 4:
				System.out.println("| \\   / |");
				break;
			default:
				System.out.println("Opción no válida");	
			}
			switch (nariz)
			{
			case 1:
				System.out.println("@   J   @");
				break;
			case 2:
				System.out.println("{   \"   }");
				break;
			case 3:
				System.out.println("[   j   ]");
				break;
			case 4:
				System.out.println("<   -   >");
				break;
			default:
				System.out.println("Opción no válida");	
			}
			switch (boca)
			{
			case 1:
				System.out.println("|  ===  |");
				break;
			case 2:
				System.out.println("|   -   |");
				break;
			case 3:
				System.out.println("|  ___  |");
				break;
			case 4:
				System.out.println("|  ---  |");
				break;
			default:
				System.out.println("Opción no válida");	
			}
			switch (barbilla)
			{
			case 1:
				System.out.println("\\_______/");
				break;
			case 2:
				System.out.println("\\,,,,,,,/");
				break;
			default:
				System.out.println("Opción no válida");	
			}
	}
	
}
