package exercicio11;

import java.util.Locale;
import java.util.Scanner;
/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. */
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		char [] gen = new char[n];
		double [] altura = new double[n];
		double mediaAlturaFeminina = 0.0;
		int div = 0;
		int homens = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i+1) + "º pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "º pessoa:");
			gen[i] = sc.next().charAt(0);
			if(gen[i] == 'F') {
				mediaAlturaFeminina += altura[i];
				div++;
			}
			else {
				homens++;
			}
			sc.nextLine();
		}
		
		double maior = altura[0];
		double menor = altura[0];
		
		for(int i = 0; i < n; i++) {
			if(altura[i] > maior) {
				maior = altura[i];
			}
			if(altura[i] < menor) {
				menor = altura[i];
			}
		}
		
		System.out.println("Menor altura = " + menor);
		
		System.out.println("Maior altura = " + maior);
		
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaFeminina/div);
		
		System.out.println("Numero de homens = " + homens);
		
		sc.close();
	}
}