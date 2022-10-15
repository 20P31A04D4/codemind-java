import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,c=0,sum=0,count=0;
        a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
           b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            sum=sum+b[i];
        }
        c=(int)sum/a;
        for(int i=0;i<a;i++)
        {
            if(b[i]==c)
            {
                count=1;
            }
        }
        if(count==1)
        System.out.print("True");
        else
        System.out.print("False");
        
    }
}