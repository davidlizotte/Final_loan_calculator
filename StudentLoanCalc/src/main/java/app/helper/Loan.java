package app.helper;

public class Loan 
{
	public static double getTotalPayments(double principle, int termOfLoan, double interestRate)
	{
		interestRate/=1200;
		int months = termOfLoan*12;
		double numerator = interestRate*principle*months;
		double denominator = 1-(Math.pow(1+interestRate, -1*months));
		double totalPayment = numerator/denominator;
		
		return Math.round(totalPayment*100.0)/100.0;
	}
	
}