package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number:");
		int number = sc.nextInt();
		sc.nextLine();
		Bank bank;
		System.out.print("Enter account holder:");
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)?");
		char x = sc.next().charAt(0);
		if (x == 'y' ) {
			System.out.print("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			bank = new Bank(number, holder, initialDeposit);
		}
		else {
		bank = new Bank(number, holder);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bank.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(bank);
		System.out.println();
		System.out.print("Enter a withdraw value:");
		double draw = sc.nextDouble();
		bank.withdraw(draw);
		System.out.println(bank);
		
		sc.close();	
	}
}
