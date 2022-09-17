import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t>0)
        {
        int n;
        n=sc.nextInt();
        double d=Math.sqrt(n);
        if(d-(int)d > 0)
          System.out.println("False");
        else
          System.out.println("True");
        t--;
        }
        sc.close();
    }
}

