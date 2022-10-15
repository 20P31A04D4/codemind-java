import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d=0,t,m,r=0;
        n=sc.nextInt();
        t=sc.nextInt();
        m=sc.nextInt();
        d=(int)Math.pow(n,t);
        r=d%m;
        System.out.println(r);
    }
}