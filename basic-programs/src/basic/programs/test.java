package basic.programs;

import java.util.Scanner;

public class test {
   
    public static void main(String[] args) {
    //no of test case
   Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    
    for(int i=0;i<n;i++){
        //array size
        int size=s.nextInt();
        int[] arr=new int[size];
        
        //take array i/p
        for(int j=0;j<size;j++){
           arr[j]=s.nextInt();
        }
        
        int x=s.nextInt();
        
        int a=find(arr,x);
        
        System.out.println(a);
     }
    }

    private static int find(int[] arr,int x) {
       for(int i=0;i<arr.length;i++){
           if(arr[i]==x)
               return i;
       }
       
       return -1;
    }
}
