import java.util.Scanner;
class Patterns4
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
            System.out.print((char)(65+r-i)+" ");
          }
         System.out.println();
       }
   }
 }
