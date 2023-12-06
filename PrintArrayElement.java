package Day3_ArrayList_PP;

import java.util.Scanner;

public class PrintArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int lengthOfArr = sc.nextInt();
        int[] arr = new int[lengthOfArr];
        for(int i = 0; i < lengthOfArr; i++) {
             arr[i] = sc.nextInt();
        }
        System.out.println("Array element");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
