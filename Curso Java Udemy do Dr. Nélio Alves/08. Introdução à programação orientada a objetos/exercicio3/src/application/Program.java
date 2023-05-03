package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;
/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota).*/
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		aluno.name = sc.nextLine();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		if (aluno.nFinal() < 60) {
			System.out.println(aluno);
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60 - aluno.nFinal());
		}
		else {
			System.out.println(aluno);
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
