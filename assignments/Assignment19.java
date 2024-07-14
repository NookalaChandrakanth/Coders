package worksheet.assignments;



class land {
	
	static void plot() {       //single level inheritance
		
		System.out.println("Father have plot");
	}
}
public class Assignment19 extends land
{

	static void bike() {
		System.out.println("I have bike");
	}
public static void main(String[] args) {
	bike();
	plot();
	
}
}			
