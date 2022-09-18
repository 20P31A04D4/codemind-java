import java.util.Scanner;
class Sample
{
    public static boolean ispal(int n)
    {
        int r,d=0,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            d=d*10+r;
            n=n/10;
        }
        if(d==temp)
          return true;
        else
         return false;
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int x[],n,i,c=0;
       n=sc.nextInt();
       x=new int[n];
       for(i=0;i<n;i++)
       {
           x[i]=sc.nextInt();
       }
       for(i=0;i<n;i++)
       {
           if(ispal(x[i]))
           c++;
       }
       System.out.println(c);
    }
}