package mortgagecalc;

import java.text.NumberFormat;
import java.util.Scanner;

public class myClass {

	public static void main(String[] args) {
		final int MONTHS_IN_YEAR = 12;
		final int PERCENT = 100;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Property Value: ");
		int principal = scanner.nextInt();

		System.out.print("Annual Interest Rate: ");
		double annualInterest = scanner.nextDouble();
		double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

		System.out.print("Mortgage Period in (Years): ");
		int years = scanner.nextInt();
		int numberOfPayments = years * MONTHS_IN_YEAR;

		double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
				/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Your Mortgage Will Be: " + mortgageFormatted);
		scanner.close();
	}
} 
