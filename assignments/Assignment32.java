package worksheet.assignments;
class Overrides
{

	void mobile()
	{
		
	
	System.out.println("samsung ");  //method over riding by using super keyword
}
}
public class Assignment32 extends Overrides{
	void mobile()
	{ super.mobile();
		System.out.println("samsung new version ");  
	}
	public static void main(String[] args) {
		
		Assignment32 as= new Assignment32()	;
		as.mobile();
		
		
		
	}
	
}
