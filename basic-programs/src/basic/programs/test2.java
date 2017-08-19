/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.programs;

import java.util.Scanner;


public class test2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int n1=n;
        int r,num=0;
        
        while(n != 0){
            r=n%10;
            num=num*10 + r;
            n=n/10;
        }
      //  System.out.println(num);
        
        if(num==n1)
            System.out.println("pal");
        else
            System.out.println("not");
        
    }
}
