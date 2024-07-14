package corejava_programmes;
class chandu {
	static void house()
	{
		System.out.println("Father have house");
	}
	static void savings() {
		System.out.println("father have savings");
	}
}

class parent extends chandu {
	
	static void plot() {
		
		System.out.println("Father have plot");
	}
}
public class MultipleClasses  extends parent{

	static void bike() {
		System.out.println("I have bike");
	}
public static void main(String[] args) {
	bike();
	plot();
	savings();
	house();
			
	
	
	
	
}
}
