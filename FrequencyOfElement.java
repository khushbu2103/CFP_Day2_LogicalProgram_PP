package Day3_ArrayList_PP;

import com.sun.source.tree.ContinueTree;

import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        //int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int newArr = arr[i];
            if(newArr == -1) continue;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == newArr) {

                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println("Frequency of element");

            System.out.println(" " + newArr + " : " + count);

        }



    }
}
