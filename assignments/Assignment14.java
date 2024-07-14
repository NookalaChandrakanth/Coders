package worksheet.assignments;

public class Assignment14 {
	
	static void area ()
	{
	 int r= 45;
	 double pi=Math.PI;
	 double areaofcircle=pi*r*r;
	 System.out.println("area of a circle is " + areaofcircle);
	}
		static void circumferance()   //using static methods
		{
				 int r= 45;
				 double pi=Math.PI;
				 double circumferanceofcircle=2*pi*r;
				 System.out.println("circumferance of a circle is " + circumferanceofcircle);
		}
		
		
			void areanonstatic ()
			{
		 int r= 255;                 //area and circumferance of a circle using non-static methods
		 double pi=Math.PI;
		 double areaofcircle=pi*r*r;
		 System.out.println("area of a circle is " + areaofcircle);
		}
			 void circumferancenonstatic()  
			{
					 int r= 25;
					 double pi=Math.PI;
					 double circumferanceofcircle=2*pi*r;
					 System.out.println("circumferance of a circle is " + circumferanceofcircle);
			}

		public static void main(String[] args) {
			area();
			circumferance();
			Assignment14 r1=new Assignment14();
			r1.areanonstatic();
			r1.circumferancenonstatic();
			
			
			
			
		}
	
	

}
