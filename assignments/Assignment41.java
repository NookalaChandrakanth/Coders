package worksheet.assignments;

public class Assignment41 {
	public static void main(String[] args) {
		
		String input ="Malayalam";
		String output ="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
		
		System.out.println(output);
		if(input.equalsIgnoreCase(output))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not a palindrome");
		}
		
	}

}
