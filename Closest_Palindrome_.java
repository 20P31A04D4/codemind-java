import java.util.Scanner;
class Sample
{
    public static boolean isprime(int n)
    {
        int temp=n,sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
          return true;
        else
         return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          int num,d1,d2;
          num=sc.nextInt();
          for(int i=num-1;;i--)
          {
              if(isprime(i))
              {
                  d1=i;
                  break;
              }
          }
          for(int i=num+1;;i++)
          {
              if(isprime(i))
              {
                  d2=i;
                  break;
              }
          }
          if((num-d1)>(d2-num))
             System.out.println(d2);
          else if((num-d1)<(d2-num))
              System.out.println(d1);
          else
             System.out.println(d1+" "+d2);
    }
}