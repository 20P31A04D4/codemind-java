import java.util.Scanner;
class Sample
{
    public static int  digits(int n)
    {
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,res=0;
        num=sc.nextInt();
        while(num!=0)
        {
            res=(digits(num));
            if(res<10)
            {
                System.out.println(res);
                break;
            }
            else
              {
                  num=res;
              }
        }
    }
}