
public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	public Employee(String f,String l,double s){
		firstName=f;
		lastName=l;
		salary=s;
	}
	public void setFirstName(String s){
		firstName=s;
	}
	public void setLastName(String a){
		lastName=a;
	}
	public void setSalary(double d){
		if(salary > 0)
			salary=d;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public double getSalary(){
		return salary;
	}
	public double annualSalary(){
		return salary*12;
	}
	public void salaryHike(){
		salary+=salary*0.1;
	}
	
	

}
