/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasimple;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.print("Enter the No of elements of array :");
        int n = obj.nextInt();
        System.out.println("Enter the elements");
        int element[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("\nEnter element"+i+" :"); 
            element[i] = obj.nextInt();
        }
        System.out.println("Entered Array");
            for(int i=0;i<n;i++){
            System.out.print(element[i]); 
        }
        oddeven A = new oddeven();
        A.FIND(element,n);
        
    }
    
}

class oddeven 
{
   void FIND(int e[],int n)
   {   System.out.println("\nODD Numbers");
       for (int i=0;i<n;i++){
           if(e[i]%2!=0)
           {
               System.out.println(e[i]);
           }
       }
        System.out.println("EVEN Numbers");
         for (int i=0;i<n;i++){
            if(e[i]%2==0)
            {
                System.out.println(e[i]);
            }
       }
   }
}















