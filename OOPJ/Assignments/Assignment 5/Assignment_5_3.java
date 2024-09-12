
package Assignment.three.java;
class Employee{
	private String name;
	private int EmpId;
	private float Salary;
	static private int totaEmp=0;
	static private float totalexpance;
    private double percentage;
    private double raiseSalary;
	public double getRaiseSalary() {
		return raiseSalary;
	}
	public void setRaiseSalary(double raiseSalary) {
		this.raiseSalary = raiseSalary;
	}
	public Employee()
	{
		this("",0,0.0f);		
	}
	public Employee(String name, int empId, float salary) {
		this.name = name;
		EmpId = empId;
		Salary = salary;
		this.totaEmp++;
		setTotaEmp(totaEmp);
		this.totalexpance=totalexpance+this.getSalary();
		setTotalexpance(totalexpance);		
	}
	public void applyRaise(double percentage)
	{
		this.raiseSalary=(float)(Salary+Salary*(percentage/100));
		setRaiseSalary(raiseSalary);
	}
	public void calculatetotalExpance()
	{
		this.totalexpance=totalexpance+this.getSalary();
		setTotalexpance(totalexpance);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public static int getTotaEmp() {
		return totaEmp;
	}
	public static void setTotaEmp(int totaEmp) {
		Employee.totaEmp = totaEmp;
	}
	public static float getTotalexpance() {
		return totalexpance;
	}
	public static void setTotalexpance(float totalexpance) {
		totalexpance = totalexpance;
	}
	public void printrecord() {
		System.out.println("Name of Employee:   "+this.getName());
		System.out.println("Employee ID of Employee:   "+this.getEmpId());
		System.out.println("Privious Salary of Employee:   "+this.getSalary());
		System.out.println("Salary After Raise of Employee:   "+this.getRaiseSalary());		
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");		
	}
}
public class Assignment_5_3 {

	public static void main(String[] args) {
		Employee emp1 =new Employee("Soham",333,45000f);
		emp1.applyRaise(10.0);
		emp1.printrecord();
		Employee emp2 =new Employee("Sham",334,55000f);
		emp2.applyRaise(10.0);
		emp2.printrecord();
		System.out.println("Number of Total Employees is : "+Employee.getTotaEmp());
		System.out.println("Total Expance is : "+Employee.getTotalexpance());
//		Employee emp2 =new Employee();
//		Employee emp3 =new Employee();
//		Employee emp4 =new Employee();
//		Employee emp5 =new Employee();
		

	}

}
