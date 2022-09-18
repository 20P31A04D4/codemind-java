import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,c=0;
        a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
           if(b[i]%2==0)
           {
               c=b[i];
           }
        }
        System.out.print(c);
    }
}