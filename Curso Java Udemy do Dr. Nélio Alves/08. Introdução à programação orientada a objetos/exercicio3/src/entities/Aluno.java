package entities;

public class Aluno {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double nFinal() {
		return n1 + n2 + n3;
	}
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", nFinal());
	}
}
