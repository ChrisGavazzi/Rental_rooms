package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.println("Register rentals (y/n)? ");
		char option =sc.next().charAt(0);
		
		while (option == 'y') {
			System.out.println("How many rooms will be rented? ");
			int n = sc.nextInt();
			if(option != 'n') {
				for (int i=1; i<=n; i++) {
					System.out.println("Rent #" + i + ":");
					System.out.println("Name: ");
					sc.nextLine();
					String name = sc.next();
					System.out.println("E-mail: ");
					String email = sc.next();
					System.out.println("Daily: ");
					int daily = sc.nextInt();
					System.out.println("Room: ");
					int room = sc.nextInt();
					vect[room] = new Rent(name, email, daily);
				}
			System.out.println("Do you want to continue registering? ");
			option =sc.next().charAt(0);
			}
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}
}
