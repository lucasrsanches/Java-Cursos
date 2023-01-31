package exercicio4;

import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		sc.nextLine();
		String [] nome = new String[n];
		int [] idade = new int[n];
		double [] altura = new double[n];
		double somaAltura=0.0;
		int somaIdade=0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da "+(i+1)+"º pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			if (idade[i] < 16) {
				somaIdade++;
			}
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			sc.nextLine();
			somaAltura += altura[i];
		}
		System.out.println();
		double mediaAltura = somaAltura / altura.length;
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		double perIdade = (double) (somaIdade / n)*100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", perIdade);
		for(int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}
}
