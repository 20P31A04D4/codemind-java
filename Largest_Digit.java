import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
          int n,r,sum=0;
          n=sc.nextInt();
          while(n>0)
          {
              r=n%10;
              n=n/10;
              if(r>sum)
              {
                  sum=r;
              }
          }
          System.out.println(sum);
    }
}