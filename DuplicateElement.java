package Day3_ArrayList_PP;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {8, 2, 9, 4, 2, 7, 9, 8, 3};
        System.out.println("Duplicate elements in given array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    boolean isDuplicate = false;
                    for (int k = 0; k < i; k++) {
                        if (arr[i] == arr[k]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        System.out.print(arr[i] + " ");
                    }
                }
            }

        }
    }
}
