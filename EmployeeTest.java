import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee b=new Employee("Shakthivel","Karunanithi",200000);
		String fn,ln;
		double sal;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the firstname,lastname and monthly salary of employee 1:");
		fn=input.next();
		ln=input.next();
		sal=input.nextDouble();
		Employee a=new Employee(fn,ln,sal);
		
		System.out.println("Enter the firstname,lastname and monthly salary of employee 2:");
		fn=input.next();
		ln=input.next();
		sal=input.nextDouble();
		b.setFirstName(fn);
		b.setLastName(ln);
		b.setSalary(sal);
		
		System.out.println("Displaying Employee detail 1 using constructor and getmethod:");
		System.out.println("Employee 1:");
		System.out.println("Name:" + a.getFirstName()+ a.getLastName());
		System.out.printf("Annual salary:%.2f",a.annualSalary());
		a.salaryHike();
		System.out.printf("\nSalary after hike is:%.2f",a.annualSalary());
		
		System.out.println("\nDisplaying Employee 2 details using get and set methods:");
		System.out.println("Employee 2:");
		System.out.println("Name:" + b.getFirstName()+ b.getLastName());
		System.out.printf("Annual salary:%.2f",b.annualSalary());
		b.salaryHike();
		System.out.printf("\nSalary after hike is:%.2f",b.annualSalary());
		
		
		

	}

}
