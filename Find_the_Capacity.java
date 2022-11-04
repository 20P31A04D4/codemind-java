import java.util.Scanner;
class Sample
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int t,s,b,c,d;
       t=sc.nextInt();
       s=sc.nextInt();
       b=sc.nextInt();
       c=2*t*b*s*512;
       d=c/1024;
       System.out.println(d+"KB");
   }
}