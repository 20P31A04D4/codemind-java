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
        for(int j=0;j<a;j++)
        {
           if(b[j]%2!=0)
           {
               c=j;
           }
        }
        System.out.print(c);
    }
}