package mystere;
import java.util.Random;
import java.util.Scanner;

public class NombreMystere {

	public static void main(String[] args) {

		System.out.println("Choisir votre mode de jeux");
		System.out.println("1- Trouver un Chiffre généré par l'ordinateur");
		System.out.println("2- Jouer avec l'ordinateur");
		
		
		Scanner clavier = new Scanner(System.in);
		String test = clavier.nextLine();

		switch (test) {
		
			case "1":
				
				exo1();
				break;
			case "2":
				
				exo2();
				break;
				
		
		}
		

	}

	private static void exo2() {
		
		Random r = new Random();
		int tentative = 0;
		int nb_final = r.nextInt(9999);
		int nombre = 0;
		int valeur = 0;
		
		System.out.println("Entrez un numéro entre 0 et 9999");
		Scanner scan = new Scanner(System.in);
		nombre = scan.nextInt();
		
		while(nb_final != nombre) {
		
			
			System.out.println(nb_final);
			System.out.println("1- Plus");
			System.out.println("2- Moins");
			Scanner test = new Scanner(System.in);
			
			valeur = test.nextInt();
			tentative++;
			
			if(valeur == 1) {
				System.out.println("C'est plus !");
				nb_final = r.nextInt(nb_final + 500);
			} else if(valeur == 2) {
				System.out.println("C'est moins !");
				nb_final = r.nextInt(nb_final - 250);
			}
			
			if(tentative == 10) {
				break;
			}
		}
		if(nb_final == nombre) {
			System.out.print("Bravo ! Le résultat est : " + nombre);
			System.out.print(" en " + tentative + " tentative");
		}
		else {
			System.out.print("RIP ! Le résultat est : " + nombre);
			System.out.print(" Vous avez utilisé vos 10 tentatives");
		}
		
	}

	private static void exo1() {
		
		Random r = new Random();
		int tentative = 0;
		int nb_final = r.nextInt(9999);
		int nombre = 0;
	
		while(nb_final != nombre) {
		
			System.out.println("Entrez un numéro entre 0 et 9999");
			Scanner scan = new Scanner(System.in);
			
			nombre = scan.nextInt();
			tentative++;
			
			if(nb_final > nombre) {
				System.out.println("C'est plus !");
			} else {
				System.out.println("C'est moins !");
			}
			
			if(tentative == 10) {
				break;
			}
		}
		
		if(nb_final == nombre) {
			System.out.print("Bravo ! Le résultat est : " + nb_final);
			System.out.print(" en " + tentative + " tentative");
		}
		else {
			System.out.print("RIP ! Le résultat est : " + nb_final);
			System.out.print(" Vous avez utilisé vos 10 tentatives");
		}
		
		
	}
}
	
	
	