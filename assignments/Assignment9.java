package worksheet.assignments;

public class Assignment9 {
	
	public static void main(String[] args) {
		
	int a=20;                         //if conditional statement
	int b=30;
	int c=40;
	if(a<b)
	{ 
		System.out.println("my condition for if is right");
	}
	if(a<20)
	{
		System.out.println("my name is chandu"); //if else conditional statement
	}
	else {
		System.out.println("iam from kurnool");
	}
	
	
	if(c>b) 
	{
		System.out.println("i got 95% in 10th"); //if else if condition is executed
	}
	else if( c<b) 
	{
		System.out.println("i got 91.3% in intermediate");
	}
	else {
		System.out.println("iam learning java");
	}
	
	if(a>=b)
	{
	System.out.println("my nested parent is true");	
	if(a>b) {
		System.out.println("my child nested if is correct");}
		
		else
	{ 
		System.out.println("my child else is true"); //nested if is executed
	}
	}
	else {
		System.out.println("my parent else will execute");
	} 
	
		
	}
	
	
	
	
	
}


