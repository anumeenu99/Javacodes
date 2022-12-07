class Armstrong
{
	public static void main(String []args)
	{
		int a=153,rem,res=0;
		int temp=a;
		System.out.println("a="+a);
		
			
			while(temp!=0)
			{
				rem=temp%10;
				res=res+(rem*rem*rem);
				temp=temp/10;
				//System.out.print(temp);
			}
			if(res==a)
			{
				System.out.println("Armstrong");
			}
			else
			{
				System.out.println("not armstrong");
			}
			
		
	}
}
		
		
		
		