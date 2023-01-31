package exercicio10;

import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).*/
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String [] nome = new String[n];
		double [] p1 = new double[n];
		double [] p2 = new double[n];
		double [] media = new double [n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"º aluno:");
			sc.nextLine();
			nome[i] = sc.nextLine();
			p1 [i] = sc.nextDouble();
			p2 [i] = sc.nextDouble();
			media[i] = (p1[i] + p2[i])/2;
		}
		
		System.out.println("Alunos aprovados: ");
		
		for(int i = 0; i < n; i++) {
			if(media[i] >= 6) {
				System.out.println(nome[i]);
			}
		}
		sc.close();
	}
}