package corejava_programmes;

import java.util.Scanner;

public class Circumferanceofcircle {

	public static void main(String[] args) {
		
	Scanner s2= new Scanner(System.in);
	
	System.out.println("enter the value of radius");
	double r=s2.nextDouble();
	
	double area = Math.PI*r*r;
	System.out.println("area of a circle is " + area);
	
	double circumferance=2*Math.PI*r;
	System.out.println("circumferance of a circle is " + circumferance);
	System.out.println("enter the value of area");
	double i=s2.nextDouble();
	double i2=i*i;
	System.out.println("area of square is " +i2);
	System.out.println("enter the value of square");
	double db=s2.nextDouble();
	double db2=4*db;
	System.out.println("circumferance of square is " + db2);

	
	System.out.println("enter the value of breadth");
	double a1=s2.nextDouble();
	System.out.println("enter the value of height");
	double a2=s2.nextDouble();
	double triangle=0.5*a1*a2;
	System.out.println("area of triangle is " + triangle);
	System.out.println("enter the value of a");
	double a=s2.nextDouble();
	System.out.println("enter the value of b");
	double b=s2.nextDouble();
	System.out.println("enter the value of c");
	double c=s2.nextDouble();
	double d=a+b+c;
	System.out.println("circumferance of triangle is " + d);
	
	System.out.println("enter the value of length");
		double l1=s2.nextDouble();
		System.out.println("enter the value of width");
		double d1=s2.nextDouble();
		double rectangle=l1*d1;
		System.out.println("area of rectangle is " + rectangle);
		System.out.println("enter the value of length");
		double l2=s2.nextDouble();
		System.out.println("enter the value of width");
		double d2=s2.nextDouble();
		double cr=2*l2+2*d2;
		System.out.println("circumferance of rectangle is " + cr);
	
		
	System.out.println("enter the value of height");
	double d10=s2.nextDouble();
	System.out.println("enter the value of a");
	double a10=s2.nextDouble();
	System.out.println("enter the value of b");
	double b10=s2.nextDouble();
	double a3=a10+b10;
	double trapezium=0.5*d*a3;
	System.out.println("area of trapezium is " + trapezium);
	System.out.println("enter the value of a");
	double t1=s2.nextDouble();
	System.out.println("enter the value of b is");
	double t2=s2.nextDouble();
	System.out.println("enter the value of c is");
	double t3=s2.nextDouble();
	System.out.println("enter the value of d is");
	double t4=s2.nextDouble();
	double t5=t1*t2;
	double t6=t2*t3;
	double t7=t3*t4;
	double t8=t4*t1;
	double trapeziumcir=t5+t6+t7+t8;
	System.out.println("circumferance of trapezium is " + trapeziumcir);
	
				
	}
}
