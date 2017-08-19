/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.programs;

import java.util.Scanner;

/**
 *
 * @author sayan
 */
//tc: O(n) 

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = s.nextInt();
        int end = n - 1;
        int start = 0;
        int[] arr = new int[n];
        System.out.println("Enter your array elements-->");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int x = s.nextInt();
        checking c=new checking();
        int result=c.check(arr,x);
        
        if(result==-1)
            System.out.println("not found");
        else
            System.out.println("element found at index "+result);
    }

}

class checking{
int check(int[] arr, int x) {
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x)
                return i;
            
        }
        return -1;
    }
}