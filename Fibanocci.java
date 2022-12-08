import java.util.Scanner;
class Fibanocci
{
public static void main(String []args)
{

	int n,n1,i,sum;
	Scanner obj=new Scanner(System.in);
	System.out.print("enter your n, n1 values; ");
	n=obj.nextInt();
	n1=obj.nextInt();
	System.out.print(n);
	System.out.print(n1);
	i=2;
	do
	{
		sum=n+n1;
		System.out.print(sum+" ");
		n=n1;
		n1=sum;
		i++;
	}
	
	//for(i=2;i<=10;i++)
		while(i<=10);
		{
			
		//i++;
	}
	
}
}