package competetive;
//https://code.google.com/codejam/contest/4344486/dashboard

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class check {

    int chk(char a) {
        if (a == 'A') {
            return 0;
        } else if (a == 'B') {
            return 1;
        } else if (a == 'C') {
            return 2;
        } else if (a == 'D') {
            return 3;
        } else if (a == 'E') {
            return 4;
        } else if (a == 'F') {
            return 5;
        } else if (a == 'G') {
            return 6;
        } else if (a == 'H') {
            return 7;
        } else if (a == 'I') {
            return 8;
        } else if (a == 'J') {
            return 9;
        } else if (a == 'K') {
            return 10;
        } else if (a == 'L') {
            return 11;
        } else if (a == 'M') {
            return 12;
        } else if (a == 'N') {
            return 13;
        } else if (a == 'O') {
            return 14;
        } else if (a == 'P') {
            return 15;
        } else if (a == 'Q') {
            return 16;
        } else if (a == 'R') {
            return 17;
        } else if (a == 'S') {
            return 18;
        } else if (a == 'T') {
            return 19;
        } else if (a == 'U') {
            return 20;
        } else if (a == 'V') {
            return 21;
        } else if (a == 'W') {
            return 22;
        } else if (a == 'X') {
            return 23;
        } else if (a == 'Y') {
            return 24;
        } else if (a == 'Z') {
            return 25;
        }
        return -1;
    }
}

public class Competetive {

    public static void main(String[] args) {
        check c;
        int x;
        List<Integer> myList = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);
        System.out.println("No of test cases:");
        int n = s.nextInt();

        for (int Z = 0; Z < n; Z++) {
            System.out.println("\n Enter the messege to decrypt:");
            char[] word = s.next().toCharArray();
            for (int j = 0; j < word.length; j++) {
                c = new check();
                x = c.chk(word[j]);
                myList.add(x);
            }
            
            //array containing index of 'A' to 'Z'
            int[] arr = new int[myList.size()];
            for (int i = 0; i < myList.size(); i++) {
                if (myList.get(i) != null) {
                    arr[i] = myList.get(i);
                }
            }
            
            int[] arr2=arr.clone();
            
           //main decryption operation
           for(int i=0;i<arr.length;i++){
              int a= (arr[0]+arr[0+1])%26;
              int b=(arr[arr.length-1]+arr[arr.length-2])%26;
              
           }
            
            
          myList.clear();  
        }//test case for loop

    }

}
