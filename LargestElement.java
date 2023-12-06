package Day3_ArrayList_PP;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 8, 3, 10, 2, 2, 5, 1};
        int max = arr[1];
        //int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) //2
                max = arr[i];

        }
        System.out.println("Largest element: " + max);
    }
}
