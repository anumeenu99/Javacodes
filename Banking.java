import java.util.Scanner;
class Banking
{
	static int b=5000;
	public static void main(String []args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your number: ");
		System.out.println("1.deposit");
		System.out.println("2.withdrawal");
		System.out.println("3.balance");
		
		int num=obj.nextInt();
		if(num==1)
		{
			Banking.deposit();
		}
		else if(num==2)
		{
			Banking.withdrawal();
		}
		else if(num==3)
		{
			Banking.balance();
		}
		else{
			System.out.println("invalid number");
		}
	}
	public static void deposit()
	{
		System.out.println("enter your deposit amount: ");
		Scanner obj1=new Scanner(System.in);
		int dep=obj1.nextInt();
		Banking.b=Banking.b+dep;     //static variable-->classname.variable name
		System.out.println("b= "+b);
	}
	public static void withdrawal()
	{
		System.out.println("enter your withdrawal amount: ");
		Scanner obj2=new Scanner(System.in);
		int with=obj2.nextInt();
		if(b>=with)
		{
			Banking.b=Banking.b-with;
			System.out.println("your new balance is: "+b);
		}
		else 
		{
			System.out.println("insufficient balance");
		}
	}
		public static void balance()
		{
			
			System.out.println("current balance is: "+b);
		}
	
}
		
