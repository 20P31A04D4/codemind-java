import java.util.Scanner;
class Patterns2
{
  public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
      int r;
      r=sc.nextInt();
      for(int i=1;i<=r;i++)
       { 
         for(int j=i;j<=r;j++)
          {
            System.out.print(j+" ");
          }
         System.out.println();
       }
   }
 }