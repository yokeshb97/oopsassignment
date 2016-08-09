import java.util.Scanner;

public class DuplicateValues {
	public static void display(int []dup,int count){
		if(count==0){
			System.out.println(dup[count]);
		}
		else{
			
		for(int i=0;i<=count;i++){
			for(int j=i+1;j<=count+1;j++){
				if(dup[i]!=dup[j])
					System.out.println(dup[i]);
				    break;
				
		   }
	    }
	 }
  }
		
	public static void main(String[] args) {
		int []duplicate=new int[6];
		int i,count=0;
		Scanner input=new Scanner(System.in);
		for(i=0;i<5;i++){
			System.out.println("Enter an integer:");
			duplicate[i]=input.nextInt();
			display(duplicate,count);
			count++;
		}
		
			
			
		
		
	}
}
