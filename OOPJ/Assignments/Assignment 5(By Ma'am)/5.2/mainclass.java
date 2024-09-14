package Assignment_5_2;

public class mainclass {

	public static void main(String[] args) {
	select ch;
	   Car c=new Car();
			   while((ch=Car.choise())!=select.Exit)
			   {
				 switch (ch) {
				case Accept:
					c.accept_record();
					break; 
                 case Print:
					c.print_record();
					break;
				default:
					break;
				}
			   }

	}

}
