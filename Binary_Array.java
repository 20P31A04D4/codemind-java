import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(x[i]==0|| x[i]==1)
               continue;
            else
            {
               System.out.println("False");
               System.exit(0);
            }
        }
        System.out.println("True");
    }
}