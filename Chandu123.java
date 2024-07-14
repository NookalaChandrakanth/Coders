package corejava_programmes;

class Srikanth 
{
	void house()
	{
		System.out.println("srikanth have house");
	}
}

class Pradeep extends Srikanth

{
	void laptop() 
	{
	System.out.println("i have a laptop");
		
	}
}

public class Chandu123 extends Pradeep
{
	
	void bike()
	{
		System.out.println("i have a bike");
	}
	
	
	
	public static void main(String[] args) {
		Chandu123 rv= new Chandu123();
		
		rv.bike();
		rv.laptop();
		rv.house();
		
		
		
	}
	
	
}
 
 