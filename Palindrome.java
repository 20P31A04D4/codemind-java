import java.util.Scanner;
class Sample
{
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp,sum=0,r;
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
          System.out.println("True");
        else
          System.out.println("False");
    }
}