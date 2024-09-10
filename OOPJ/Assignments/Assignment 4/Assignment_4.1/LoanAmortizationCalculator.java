package que1.assignment4;
public class LoanAmortizationCalculator {
public static void main(String[] args) {		
Method_call mc =new Method_call();
Set_getvalues sg = new Set_getvalues();
sg.calculateMonthlyPayment();
int choice;
while((choice=mc.babu())!=0)
{
	switch (choice) {
	case 1:
	{
		mc.accept_record();
	}
     case 2:
     {
    	 mc.printRecord();
 	}
		break;

	default:
		System.out.println("Invalid Input !!!!!!!");
		break;
	}
	String str=mc.toString();
	System.out.println(str);
}	
	}
}
