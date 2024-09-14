package Assignment_5_2;

public class Vehicle {
  protected String model_launch_year;
  protected String origin_company;
  public Vehicle(){
	    
	  }
public Vehicle(String model_launch_year, String origin_company) {
	this.model_launch_year = model_launch_year;
	this.origin_company = origin_company;
}
public String getModel_launch_year() {
	return model_launch_year;
}
public void setModel_launch_year(String model_launch_year) {
	this.model_launch_year = model_launch_year;
}
public String getOrigin_company() {
	return origin_company;
}
public void setOrigin_company(String origin_company) {
	this.origin_company = origin_company;
}
}
