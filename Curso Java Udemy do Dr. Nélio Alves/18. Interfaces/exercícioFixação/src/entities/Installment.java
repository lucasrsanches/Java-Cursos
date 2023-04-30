package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate dueDate;
	private Double amount;
	
	public Installment() {
		
	}

	public Installment(LocalDate date, Double amount) {
		this.dueDate = date;
		this.amount = amount;
	}

	public LocalDate getDate() {
		return dueDate;
	}

	public void setDate(LocalDate date) {
		this.dueDate = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
	}
	
	
}
