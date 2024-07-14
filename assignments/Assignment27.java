package worksheet.assignments;

public class Assignment27 {
	public static void add()
	{
System.out.println("first number"); //calling multiple access specifiers within the class
}
	protected static  void sub()
	{
System.out.println("second number");
}
	   static void multi()
	{
System.out.println("third number");
}
	  private static  void divide()
	{
System.out.println("fourth number");
}
	
	public static void main(String[] args) {
		
		divide();
		multi();
		sub();
		add();
		
		
		
	}

}
