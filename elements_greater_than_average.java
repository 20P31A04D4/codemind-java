import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,sum=0,c=0,co=0;
        float avg;
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
        c=sum/a;
        for(int j=0;j<a;j++)
        {
            if(b[j]>=c)
            {
                co++;
            }
        }
        System.out.print(co+" ");
    }
}