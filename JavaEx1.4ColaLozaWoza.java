/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaex1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author 22cseb57
 */
public class JavaEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number");
        int f=obj.nextInt();
        System.out.println("Enter the last number");
        int l=obj.nextInt();
        for(int i=f;i<=l;i++)
        {
            if((i%3==0) & (i%5==0))
            {
                System.out.print("ColaLoza ");
            }
            else if(i%3==0)
            {
                System.out.print("Cola ");
            }
            else if(i%5==0)
            {
                System.out.print("Loza ");
            }
            else if(i%7==0)
            {
                System.out.print("Woza ");
            }
            else
            {
                System.out.print(i+" ");
            }
            if(i%11==0)
            {
                System.out.println();
            }
        }
    }
    
}
