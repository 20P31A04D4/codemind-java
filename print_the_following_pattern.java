import java.util.Scanner;
class Pattern3 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r,c;
		r=sc.nextInt();
		for(int i=1;i<=r;i++)			
		{
			for(int j=1;j<=r;j++)	
			{
			    if(j==i)
				System.out.print("0");
				else
				 System.out.print("x");
			}
			System.out.println();
		}
	}
}