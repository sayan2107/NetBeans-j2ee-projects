package basic.programs;

import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
    //variables and objects 
    Scanner s=new Scanner(System.in);
    int i,j,min,temp;
    //arr size
    int n=s.nextInt();
    
    int[] arr=new int[n];
    
    
    //take i/p in array
    for(i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
 
     //main operation   
    for(i=0;i<n-1;i++){
        
       min = i ;

       for(j=i+1;j<n;j++){
           if(arr[j]<arr[min]){
              min=j;
           }
       }
       
       temp=arr[i];
       arr[i]=arr[min];
       arr[min]=temp;
    }
    
    
    //printing sorted elements
    for(i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    
    }
   
}
