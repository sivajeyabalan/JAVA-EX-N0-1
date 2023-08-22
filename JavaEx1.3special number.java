
package pkg22cseb61javaex1.Newmain2;

import java.util.*;

public class Newmain2 
{

    public static void main(String[] args) 
    {
          Scanner obj=new Scanner(System.in);
          System.out.print("Enter the number: ");
          int n=obj.nextInt();
          int num=n;
          int num1=n;
          int num2=n;
          int sum=0;
          while(n>0)
          {
              int rem=n%10;
              sum=sum+rem;
              n=n/10;
          }
          int mul=1;
          while (num1>0)
          {
              int r=num1%10;
              mul=mul*r;
              num1=num1/10;
          }
          int ans=sum+mul;
          if(num2==ans)
          {
            System.out.println("The given number "+num2+" is a special number."); 
          }
          else
          {
             System.out.println("The given number "+num2+" is not a special number.");
          }
              
          
    }
    
}
