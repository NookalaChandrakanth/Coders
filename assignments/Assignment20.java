package worksheet.assignments;



class chandu {
	static void house()
	{
		System.out.println("Father have house");
	}
	static void savings() {
		System.out.println("father have savings");
	}
}

class parent extends chandu {     //multi level inheritance using static methods
	
	static void plot() {
		
		System.out.println("Father have plot");
	}
}
public class Assignment20  extends parent{

	static void bike() {
		System.out.println("I have bike");
	}
public static void main(String[] args)
{
	bike();
	plot();
	savings();
	house();
			
}

}
