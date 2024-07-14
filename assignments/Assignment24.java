package worksheet.assignments;

 class Assignment24 {
 void AP() {
	 System.out.println("Andhra pradesh");
 }

}
 class Districts extends Assignment24{
	 void District()
	 {
		 System.out.println("kurnool");
	 }

	}
 class Areas extends Assignment24 {
 void Area() 
 {
	 System.out.println("abbas nagar");
 }

}
 class Landmark extends Districts
 {
	 void Tree()                           
	 {
		 System.out.println("near register office");
	 }

 
 public static void main(String[] args) {
	 
	
	Landmark l1= new Landmark();
	l1.Tree();
	l1.AP();
	Areas a1=new Areas();
	a1.Area();
	
	a1.AP();
	
	
	
	
}
 }
 
