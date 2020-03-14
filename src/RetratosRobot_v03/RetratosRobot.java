package RetratosRobot_v03;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class RetratosRobot {
	
	static Scanner teclado=new Scanner(System.in);
	
	
	static int PELO = 0; 
	static int OJOS = 1;
	static int NARIZ = 2;
	static int BOCA = 3;
	static int BARBILLA = 4;
	

	public static void main(String[] args) {
		
		
		
		Map <Integer,List<String>> rasgos = new TreeMap<>();
		
				
		List<String> pelo = new ArrayList<>();
		pelo.add("WWWWWWWWW");
		pelo.add("\\\\\\//////");
		pelo.add("|\"\"\"\"\"\"\"|");
		pelo.add("|||||||||");
		rasgos.put(PELO,pelo);
		
		List<String> ojos = new ArrayList<>();
		ojos.add("| 0   0 |");
		ojos.add("|-{· ·}-|");
		ojos.add("|-{o o}-|");
		ojos.add("| \\   / |");
		rasgos.put(OJOS,ojos);	
		
		List<String> nariz = new ArrayList<>();
		nariz.add("@   J   @");
		nariz.add("{   \\\"   }");
		nariz.add("[   j   ]");
		nariz.add("<   -   >");
		rasgos.put(NARIZ,nariz);	
		
		List<String> boca = new ArrayList<>();
		boca.add("|  ===  |");
		boca.add("|   -   |");
		boca.add("|  ___  |");
		boca.add("|  ---  |");
		rasgos.put(BOCA,boca);
		
		List<String> barbilla = new ArrayList<>();
		barbilla.add("\\_______/");
		barbilla.add("\\,,,,,,,/");
		rasgos.put(BARBILLA,barbilla);
		
		System.out.println("RETRATO ROBOT");
		
		menu(rasgos,pelo,ojos,nariz,boca,barbilla);
		
				

	}
	
	public static void menu (Map <Integer,List<String>> rasgos, List<String> pelo, List<String> ojos, List<String> nariz, List<String> boca, List<String> barbilla )  {
		
				
			Set <String> retrato = new LinkedHashSet <String>();			
		
			System.out.println(".-PELO");
			for (int i=0; i<pelo.size(); i++) {
				System.out.println((i+1)+"- "+pelo.get(i));
			}
			int opcionPelo = teclado.nextInt();
			while (opcionPelo < 1 || opcionPelo > 4) {
				System.out.println("Opción no válida. Teclea de nuevo");
				opcionPelo = teclado.nextInt();
			}
			
			 retrato.add(pelo.get(opcionPelo-1));
			
			
			System.out.println(".-OJOS");
			for (int i=0; i<ojos.size(); i++) {
				System.out.println((i+1)+"- "+ojos.get(i));
			}
			int opcionOjos = teclado.nextInt();
			while (opcionOjos < 1 || opcionOjos > 4) {
				System.out.println("Opción no válida. Teclea de nuevo");
				opcionOjos = teclado.nextInt();
			}
			
				
				 retrato.add(ojos.get(opcionOjos-1));
			
			
			System.out.println(".-NARIZ");
			for (int i=0; i<nariz.size(); i++) {
				System.out.println((i+1)+"- "+nariz.get(i));
			}
			int opcionNariz = teclado.nextInt();
			while (opcionNariz < 1 || opcionNariz > 4) {
				System.out.println("Opción no válida. Teclea de nuevo");
				opcionNariz = teclado.nextInt();
			}
						
				 retrato.add(nariz.get(opcionNariz-1));
			
			
			System.out.println(".-BOCA");
			for (int i=0; i<boca.size(); i++) {
				System.out.println((i+1)+"- "+nariz.get(i));
			}
			int opcionBoca = teclado.nextInt();
			while (opcionBoca < 1 || opcionBoca > 4) {
				System.out.println("Opción no válida. Teclea de nuevo");
				opcionBoca = teclado.nextInt();
			}
							
				 retrato.add(boca.get(opcionBoca-1));
						
			System.out.println(".-BARBILLA");
			for (int i=0; i<barbilla.size(); i++) {
				System.out.println((i+1)+"- "+barbilla.get(i));
			}
			int opcionBarbilla = teclado.nextInt();
			while (opcionBarbilla < 1 || opcionBarbilla > 4) {
				System.out.println("Opción no válida. Teclea de nuevo");
				opcionBarbilla = teclado.nextInt();
			}
							
				 retrato.add(barbilla.get(opcionBarbilla-1));
			
			añadirRasgo(rasgos, retrato);
				 
			
}
		
		public static void retrato(Set <String> retrato) {
			
			System.out.println("El retrato robot sería: ");
			Iterator it = retrato.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
	
		
	public static void añadirRasgo (Map <Integer,List<String>> rasgos, Set <String> retrato) {
		
			System.out.println("Añade rasgo a identificar: ");
			String faccion=teclado.next().toUpperCase();
			System.out.println("Indica el orden en el retrato: ");
			int orden=teclado.nextInt();
					
			System.out.println("Describe nuevo rasgo");
			String descripcion=teclado.next();
			retrato.add(descripcion);
			List <String> descrip = new ArrayList<String>();
			descrip.add(descripcion);
		
		rasgos.put(orden, descrip);
				
		retrato(retrato);
		
		
		
	}
	
	
	

}
