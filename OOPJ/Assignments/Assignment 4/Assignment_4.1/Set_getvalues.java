package que1.assignment4;

public class Set_getvalues {
	private float monthlyPayment;
	private int principal;
	private float monthlyInterestRate;
	private int noOfMonths;
	private float annualIntrestrate;
	private int loanTerm;
	public void calculateMonthlyPayment() 
	{
	   noOfMonths= loanTerm * 12;
		this.monthlyInterestRate = annualIntrestrate / 12 / 100;
		this.monthlyPayment= (float)(principal * ((monthlyInterestRate) *Math.pow((1 + (monthlyInterestRate)),((float)noOfMonths))) / (Math.pow((1 + (monthlyInterestRate)),((float)noOfMonths)) - 1));
		this.setmonthlyPayment(this.monthlyPayment);
	}
	public float getmonthlyPayment()
	{
		return monthlyPayment;
	}
	public void setmonthlyPayment(float monthlyPayment)
	{
		this.monthlyPayment = monthlyPayment;
	}
	public int getPrincipal() {
		return principal;
	}
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	public float getMonthlyInterestRate() {
		return monthlyInterestRate;
	}
	public void setMonthlyInterestRate(float monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}
	public int getNoOfMonths() {
		return noOfMonths;
	}
	public void setNoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}
	public float getAnnualIntrestrate() {
		return annualIntrestrate;
	}
	public void setAnnualIntrestrate(float annualIntrestrate) {
		this.annualIntrestrate = annualIntrestrate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	
}
