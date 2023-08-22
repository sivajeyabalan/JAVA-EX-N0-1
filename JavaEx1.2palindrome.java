/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22cseb61javaex1;

import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=obj.nextInt();
        int rev=0;
        int num=n;
        while(n>0)
        {
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if(num==rev)
            System.out.println("The given number is a Palindrome.");
        else
            System.out.println("The given number is not a Palindrome.");

    }
    
}
