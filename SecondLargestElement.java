package Day3_ArrayList_PP;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 2, 7, 9, 8, 3};
        int temp = 0;
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nSecond largest: " + arr[arr.length-2] + " ");
    }
}
