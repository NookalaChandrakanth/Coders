package worksheet.assignments;



class Override
{
	void mobile()
	{
		System.out.println("samsung ");  //method over riding
	}
	
}

public class Assignment31 extends Override {
	void mobile ()
	{
		System.out.println("samsung new version");
	}
	public static void main(String[] args) {
		
		Assignment31 a1= new Assignment31();
		a1.mobile();
		
	}

}
