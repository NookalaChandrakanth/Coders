package worksheet.assignments;

public class Assignment37 {
	public static void main(String[] args) {
		String name = "Chandra Kanth";
		System.out.println(name.length());
		System.out.println(name.isEmpty());
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.replace('a', 'i'));
		System.out.println(name.replaceAll("Chandra123", "Chandu"));
		System.out.println(name.matches("(.*)h"));
		System.out.println(name.matches("C(.*)"));
		System.out.println(name.matches("(.*)K(.*)"));
		System.out.println(name.matches("............."));
		
		
		
		
		
	}

}
