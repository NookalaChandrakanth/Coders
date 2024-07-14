package worksheet.assignments;

import java.util.Arrays;

public class Assignment42 {
	public static void main(String[] args) {
		int input[]=new int[3];
		input[0]=56;
		input[1]=65;
		input[2]=85;
		int output[]= new int[3];
		for(int i=0;i<=2;i++)
		{
			output[i]=input[i];
		}
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));
		
	}

}
