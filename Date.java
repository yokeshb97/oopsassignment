
public class Date {
	private int month;
	private int date;
	private int year;
	
	public Date(int x,int y,int z){
		month=x;
		date=y;
		year=z;
	}
	public void setMonth(int x){
		month=x;
	}
	public void setDate(int y){
		date=y;
	}
	public void setYear(int z){
		year=z;
	}
    public int getMonth(){
    	return month;
    }
    public int getDate(){
    	return date;
    }
    public int getYear(){
    	return year;
    }
    public void displayDate(){
    	System.out.println(date + "/" + month + "/" + year);
    }
}
