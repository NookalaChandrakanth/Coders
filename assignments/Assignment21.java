package worksheet.assignments;

	class Srikanth 
	{
		void house()
		{
			System.out.println("srikanth have house");
		}
	}

	class Pradeep extends Srikanth      // multi level inheritance for non.static methods

	{
		void laptop() 
		{
		System.out.println("i have a laptop");
			
		}
	}

	public class Assignment21 extends Pradeep
	{
		
		void bike()
		{
			System.out.println("i have a bike");
		}
		
		
		
		public static void main(String[] args) {
			Assignment21 rv= new Assignment21();
			
			rv.bike();
			rv.laptop();
			rv.house();
			
			
			
		}
		
		
	
	
	

}
