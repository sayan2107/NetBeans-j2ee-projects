package basic.programs;

import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
    //variables and objects 
    Scanner s=new Scanner(System.in);
    int i,j,temp;
    
    //arr size
    int n=s.nextInt();
    
    int[] arr=new int[n];
    
    
    //take i/p in array
    for(i=0;i<n;i++){
        arr[i]=s.nextInt();
    }

     //main operation  
     for(i=1;i<n;i++){
           temp=arr[i];
            j = i-1;
            while(j >=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
     }
     
     
     //print sorted list
     print(arr);
        
    }//end of main function
    
    
    //print function
     public static void print(int[] arr){
         for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
       }
    }
     
     
}//end of main class

