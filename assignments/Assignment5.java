package worksheet.assignments;

public class Assignment5 {
	
	void add()
{
		int a=20;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
}
	
	 void sub()
		{
			int a= 50;
			int b= 30;
			int subtraction=a-b;
	System.out.println(subtraction);
	}
		 void multiply()
		{
			int a= 20;
			int b= 30;
			int multiplication=a*b;
	System.out.println(multiplication);

}
		 public static void main(String[] args) {//calling multiple non-static methods to main method
			 Assignment5 A5= new Assignment5();
			 A5.add();
			 A5.sub();
			 A5.multiply();
			 
		 }
		}
