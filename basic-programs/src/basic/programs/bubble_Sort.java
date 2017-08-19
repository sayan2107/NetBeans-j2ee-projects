/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.programs;

import java.util.Scanner;

public class bubble_Sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int temp;
        
        //take i/p arr size
        int n=s.nextInt();
          int[] A=new int[n];
   
          //put elements into array 
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        
        
        
        //shorting
        for(int k = 0; k< n-1; k++) {
        for(int i = 0; i < n-k-1; i++) {
            if(A[ i ] > A[ i+1] ) {
                // here swapping of positions is being done.
                temp = A[ i ];
                A[ i ] = A[ i+1 ];
                A[ i + 1] = temp;
            }
        }
    }
        
        
     for(int i=0;i<n;i++){
         System.out.print(A[i]+" ");
     }
       
    }
}
