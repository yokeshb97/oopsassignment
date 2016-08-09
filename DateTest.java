import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		Date day=new Date(1,2,2016);
		System.out.print("Displaying date using the values of constructor:");
		day.displayDate();
		int d,m,y;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter date,month,year:");
		d=input.nextInt();
		m=input.nextInt();
		y=input.nextInt();
		
		day.setMonth(m);
		day.setDate(d);
		day.setYear(y);
		System.out.println("Displaying date using getMethod:");
		System.out.println("Date:"+day.getDate());
		System.out.println("Month:"+day.getMonth());
		System.out.println("Year:"+day.getYear());
		System.out.print("Displaying date in the required format:");
		day.displayDate();
	}

}
