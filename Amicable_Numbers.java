import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,sum=0;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=1;i<m;i++)
        {
            if(m%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
          System.out.println("Amicable");
        else
          System.out.println("Not Amicable");
    }
}