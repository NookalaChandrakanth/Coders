package worksheet.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment39 {
	public static void main(String[] args) {
		
		int s1[]= new int[3];
		Scanner sc= new Scanner(System.in);
		for (int i=0;i<3;i++)
		{
			
			s1[i]=sc.nextInt();  
		}
		
		System.out.println(Arrays.toString(s1));
		

	boolean b1[]= new boolean[3];
	
	
	for (int i=0;i<3;i++)
	{
		b1[i] =sc.nextBoolean(); 
	}
	
	System.out.println(Arrays.toString(b1));
	double[] d1= new double[4];
	for(int i=0;i<3;i++)
	{
	d1[i]=sc.nextDouble();
	}
System.out.println(Arrays.toString(d1));

}}
	
