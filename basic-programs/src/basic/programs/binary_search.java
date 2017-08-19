package basic.programs;

import java.util.Scanner;

//array elements should be shorted like 1 2 3 4 5 .....
//tc O(log n) -> log base 2

class check {

    public int init_chk(int arr[], int start, int end, int x) {
        {
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == x) {
                    return mid;

                } else if (x < arr[mid]) {
                    end = mid - 1;
                } else if (x > arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

public class binary_search {

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
        check c = new check();
        int result = c.init_chk(arr, start, end, x);

        if (result == -1) {
            System.out.println("not found");
        } else {
            System.out.println("element " + x + " found at index " + result);
        }
    }//end psvm
}//end main class
