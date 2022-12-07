 class Assignment1
 {
	 String name;
	 int s1,s2,s3;
	 public static void main(String []args)
	 {
		Assignment1 obj=new Assignment1("anu",88,82,96);
		obj.grade();
		Assignment1 obj1=new Assignment1("Sneha",91,83,90);
		obj1.grade();
	 }
	 public int total()
	 {
		int total=(s1+s2+s3);
		int average=total/3;
		System.out.println("Total mark = "+total);
		return average;
	 }
	 public void grade()
	 {
		 System.out.println("Name:"+name);
		 int av=total();
		 if(av>90)
		 {
			 System.out.println("Grade: O");
		 }
		 else if((av<=90)&&(av>75))
		 {
			System.out.println("Grade: A");
		 } 
		 else if((av<=75)&&(av>60))
		 {
			System.out.println("Grade: B");
		 } 
		 else if((av<=60)&&(av>40))
		 {
			System.out.println("Grade: C");
		 }
		else
		{
			System.out.println("Fail");
		} 
			
	 }
	 Assignment1(String n1,int a,int b,int c)
	 {
		name=n1;
		s1=a;
		s2=b;
		s3=c;
	 }
	
 }