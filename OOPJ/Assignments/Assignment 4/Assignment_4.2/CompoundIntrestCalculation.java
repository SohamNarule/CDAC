package org.compoundintrest2;

public class CompoundIntrestCalculation {

	public static void main(String[] args) {
		 CompoundIntrestUtil CIU =new CompoundIntrestUtil();
		 CompoundIntrestFields CIF =new CompoundIntrestFields();
		 int ch;
		 while( (ch=CIU.select())!=0)
		 {
	 
			 switch (ch) {
			case 1:
			{
				 CIU.accept_record();
			}
			break;
			case 2:
			{
				CIU.print_record();
			}				
			break;
			default:
				break;
			}
		 } 
	}
	
}
