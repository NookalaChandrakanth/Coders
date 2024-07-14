package worksheet.assignments;

class Concept
{
	final void mobile()
	
		{
			
		System.out.println("samsung ");
		                                //method over riding by using final keyword in the parent class
	    }	
}
public class Assignment33 extends Concept
{
		void mobile()
		{
			
		System.out.println("samsung new version ");  
		
	}
		public static void main(String[] args) {
			
			Assignment33 a1= new Assignment33();
			a1.mobile();
			
			
		}

}
