/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njomleii;

import java.util.Scanner;
import static njomleii.Calculate.add;
import static njomleii.Calculate.max;
import static njomleii.Calculate.printPoly;

/**
 *
 * @author Erfan
 */
public class NJomleii {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) { 
         Scanner s = new Scanner (System.in);
         System.out.println("عبارت اول چند جملع ای است؟");
         int a = s.nextInt()+1;
         System.out.println("عبارت دوم چند جملع ای است؟");
         int b = s.nextInt()+1;
         int A[] = new int[a];
         int B[] = new int[b];
         
         System.out.println("-------------------------------");
         System.out.println("عبارت اول:");
         System.out.println("-------------------------------");

         for (int i = 0; i < a; i++) {
             System.out.println("مقدار X^"+i+" را وارد کنید");
             A[i]=s.nextInt();
         }
         
                  System.out.println("-------------------------------");
         System.out.println("عبارت دوم :");
         System.out.println("-------------------------------");
         
         for (int i = 0; i < a; i++) {
             System.out.println("مقدار X^"+i+" را وارد کنید");
             B[i]=s.nextInt();
         }
        //int A[] = {5, 0, 10, 6};  
        
       // int B[] = {1, 2, 4}; 
        
        int m = A.length; 
        int n = B.length;
        System.out.println("-------------------------------");
        System.out.println("عبارت اول :"); 
        printPoly(A, m);
        
        System.out.println("\nعبارت دوم"); 
        printPoly(B, n); 
        
        int sum[] = add(A, B, m, n); 
        int size = max(m, n); 
        
        System.out.println("\nجمع عبارات "); 
        printPoly(sum, size); 
  
    } 
}
