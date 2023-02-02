package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> wishList = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("Inserisci un nuovo desiderio nella lista:");
			String newWish = scan.nextLine();
			wishList.add(newWish);
			
			Collections.sort(wishList); 
			
			System.out.println("Lista dei desideri:");
			for (int i = 0; i < wishList.size(); i++) {
				System.out.println("- " + wishList.get(i));
			}
			System.out.println();

			while (true) {
				try {
					System.out.println("La lista contiene n." + wishList.size() + " desideri");
					System.out.println("Vuoi inserirne un altro?");
					System.out.println("1 - SI | 2 - NO");
					int choice = Integer.parseInt(scan.nextLine());
					
					if (choice == 1) {						
						System.out.println();
						break;
					} else if (choice == 2) {
						System.out.println();
						System.out.println("Arrivederci");
						scan.close();
						return;
					} else {
						System.out.println("Inserimento errato! Riprovare...");
						System.out.println();
					}
				} catch (NumberFormatException e) {
					System.out.println("Inserimento errato! Riprovare...");
					System.out.println();
				}
			}
		}
	}
}
