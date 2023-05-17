package application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Set <Integer> a = new HashSet<>();
		Set <Integer> b = new HashSet<>();
		Set <Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A?");
		int xA = sc.nextInt();
		
		for(int i =0; i<xA; i++) {
			int y = sc.nextInt();
			a.add(y);
		}
		
		System.out.print("How many students for course B?");
		int xB = sc.nextInt();
		
		for(int i =0; i<xB; i++) {
			int y = sc.nextInt();
			b.add(y);
		}
		
		System.out.print("How many students for course A?");
		int xC = sc.nextInt();
		
		for(int i =0; i<xC; i++) {
			int y = sc.nextInt();
			c.add(y);
		}
		
		Set <Integer> tot = new HashSet<>(c);
		
		tot.addAll(b);
		tot.addAll(a);
		
		System.out.println("Total students: " + tot.size());
		
		
		sc.close();
	}

}
