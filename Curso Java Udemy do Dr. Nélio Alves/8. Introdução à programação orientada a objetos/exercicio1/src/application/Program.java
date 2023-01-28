package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal.*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.println(retangulo);
		
		sc.close();
	}

}
