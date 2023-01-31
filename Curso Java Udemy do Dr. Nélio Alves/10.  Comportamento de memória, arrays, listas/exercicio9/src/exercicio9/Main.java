package exercicio9;

import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. 
*/
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] vectNome = new String[n];
		int[] vectIdade = new int[n];
		String nome = null;
		int idade = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da "+(i+1) +"º pessoa:");
			System.out.print("Nome: ");
			vectNome[i] = sc.next();
			System.out.print("Idade: ");
			vectIdade[i] = sc.nextInt();
			if(vectIdade[i] > idade) {
				idade = vectIdade[i];
				nome = vectNome[i];
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + nome);
		
		sc.close();		
	}
}