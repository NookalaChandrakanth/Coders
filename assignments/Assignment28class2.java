package worksheet.assignments;

public class Assignment28class2 {
	
 public static void main(String[] args) {
		/*Assignment28 as=new Assignment28();
		
		as.add();
		                  //non static access specifiers methods executed by creating object
		as.sub();         //same package different classes
                          //**private can't able to access
		as.multi();
		*/
		Assignment28.add();    //static access specifiers methods executed by creating class1.method name in class2
		Assignment28.sub();
		Assignment28.multi();
		
	}

}
