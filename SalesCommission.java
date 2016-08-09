import java.util.Scanner;
public class SalesCommission {

	public static void main(String[] args) {
		int i,n;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of salesperson:");
		n=input.nextInt();
		int []grossSales=new int[n];
		int []salary=new int[n];
		int []arrayOfCounters={0,0,0,0,0,0,0,0,0};
		System.out.println("Enter gross sales of individual person:");
		for(i=0;i<n;i++){
			grossSales[i]=input.nextInt();
			salary[i]=200 + (int)(grossSales[i]*0.09);
			if((salary[i]>=200)&&(salary[i]<=299))
				arrayOfCounters[0]++;
			else if((salary[i]>=300)&&(salary[i]<=399))
				arrayOfCounters[1]++;
			else if((salary[i]>=400)&&(salary[i]<=499))
				arrayOfCounters[2]++;
			else if((salary[i]>=500)&&(salary[i]<=599))
				arrayOfCounters[3]++;
			else if((salary[i]>=600)&&(salary[i]<=699))
				arrayOfCounters[4]++;
			else if((salary[i]>=700)&&(salary[i]<=799))
				arrayOfCounters[5]++;
			else if((salary[i]>=800)&&(salary[i]<=899))
				arrayOfCounters[6]++;
			else if((salary[i]>=900)&&(salary[i]<=999))
				arrayOfCounters[7]++;
			else if(salary[i]>1000)
				arrayOfCounters[8]++;
		}
		System.out.println("Salary range"+"         "+"Count");
		for(i=2;i<=10;i++){
			
			int a=i*100;
			int b=a+99;
			if(i!=10)
				System.out.println("$"+a+"-"+b+"              "+arrayOfCounters[i-2]);
			else
				System.out.println("$1000 and above"+"        "+arrayOfCounters[i-2]);
		}
		}
			
			
		
	

	}


