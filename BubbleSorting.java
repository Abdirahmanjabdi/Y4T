public class BubbleSorting {
    public static void main(String[] args) {
        int arr[] = {93, 42, 51, 3, 455, 20, 5, 100, 5487, 87, 96, 21};
        int n = arr.length;
        int temp;
        boolean Swapped;
        for (int i = 0; i < n; i++) {
            Swapped = false;
            for (int j = 0; j < (n - i - 1); j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    Swapped = true;
                }
                // Print the array after each pass
                System.out.print("Pass " + (i + 1) + ": ");
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            if (Swapped = false) {
                break;
            }
            System.out.println();
        }
        return;
    }

}

