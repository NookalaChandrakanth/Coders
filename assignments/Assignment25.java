package worksheet.assignments;

 class Assignment25 {
	
 Assignment25 ()
{
	System.out.println("fisrt class");
}
}

 
  class Assigner2 extends Assignment25
 {
	 Assigner2()
	 {
		 System.out.println("third class");
	 }
 }
public class Child extends Assigner2   {	
	

	 public static void main(String[] args)
	 {
		Child c=new Child();
		 
		
	}
}
	 
	 
 
 

 