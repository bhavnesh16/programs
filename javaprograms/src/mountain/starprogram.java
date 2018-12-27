package mountain;
public class starprogram 
{
	public static void main(String[] args)
	{		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<i;j++)
			{
			System.out.print("*");
	     	}
			System.out.println();
		}
		for(int i=0;i<10;i++)
		{
			for(int j=10;j>i;j--)
			{
			System.out.print("*");
	     	}
			System.out.println();
		}
		for(int i=0;i<=5;i++)
		{
			for(int j=2*(5-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
			System.out.print("* ");
	     	}
			System.out.println();
		}
		for(int i=0;i<=5;i++)
		{
			for(int j=5-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
			System.out.print("* ");
	     	}
			System.out.println();
		}
		int num;
		for(int i=0;i<5;i++)
		{
			num=0;
			for(int j=0;j<=i;j++)
			{
				num++;
				System.out.print(num+" ");
			}
			System.out.println();
		}
		int num1=0;
		for(int i=0;i<5;i++)
		{
			//num=0;
			for(int j=0;j<=i;j++)
			{
				num1++;
				System.out.print(num1+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");	
			}
			for(int k=1;k<i*2;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int k=0;k<=i*2;k++)
			{
				System.out.print(" ");
			}
			for(int j=2*(5-i);j>1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		int num2=0;
		for(int i=0;i<5;i++)
		{
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				num2++;
				System.out.print(num2+" ");
			}
			System.out.println();
		}
		int num3;
		for(int i=0;i<5;i++)
		{
			num3=0;
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				num3++;
				System.out.print(num3+" ");
			}
			System.out.println();
		}
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for(int i=1;i<=5;i++)
		{
		   for(int j=i;j>=1;j--)
		   {
			   System.out.print(j+" ");
		   }
		   System.out.println();
		}
		System.out.println("------------------------------");
		for(int i=1;i<=5;i++)
		{
		   for(int j=1;j<=i;j++)
		   {
			   if(j%2==0)
			   System.out.print("0");
			   else
			   System.out.print("1");
		   }
		   System.out.println();
		}
    }
}