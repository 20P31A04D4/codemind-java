import java.util.Scanner;
class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],a,n,i,c=0;
        n=sc.nextInt();
        a=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%a==0)
            c++;
        }
        System.out.println(c);
    }
}