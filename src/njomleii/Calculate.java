/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njomleii;

/**
 *
 * @author Erfan
 */
public class Calculate {
    // A utility function to return maximum of two integers  
    static int max(int m, int n) { 
        return (m > n) ? m : n; 
    } 
  
// A[] represents coefficients of first polynomial  
// B[] represents coefficients of second polynomial  
// m and n are sizes of A[] and B[] respectively  
    static int[] add(int A[], int B[], int m, int n) { 
        int size = max(m, n); 
        int sum[] = new int[size]; 
  
// Initialize the porduct polynomial  
        for (int i = 0; i < m; i++) { 
            sum[i] = A[i]; 
        } 
  
// Take ever term of first polynomial  
        for (int i = 0; i < n; i++) { 
            sum[i] += B[i]; 
        } 
  
        return sum; 
    } 
  
// A utility function to print a polynomial  
    static void printPoly(int poly[], int n) { 
        for (int i = 0; i < n; i++) { 
            System.out.print(poly[i]); 
            if (i != 0) { 
                System.out.print("x^" + i); 
            } 
            if (i != n - 1) { 
                System.out.print(" + "); 
            } 
        } 
    } 
  
// Driver program to test above functions  
   
    
}
