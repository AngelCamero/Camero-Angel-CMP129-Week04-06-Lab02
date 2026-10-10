public class SortingBenchmarks {

    public static void main(String[] args) {
        // Original array with 20 integers
        int[] originalArray = {
            45, 12, 78, 34, 89, 23, 56, 90, 11, 67,
            33, 88, 22, 55, 99, 44, 77, 10, 66, 50
        };

        // Create two identical arrays manually without importing anything
        int[] bubbleArray = new int[originalArray.length];
        int[] selectionArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            bubbleArray[i] = originalArray[i];
            selectionArray[i] = originalArray[i];
        }

        // Print initial array manually
        System.out.print("Initial Array: ");
        printArray(originalArray);
        System.out.println("--------------------------------------------------");

        // Run Bubble Sort and get the number of exchanges
        int bubbleExchanges = bubbleSort(bubbleArray);
        System.out.print("Bubble Sort Result:   ");
        printArray(bubbleArray);
        System.out.println("Bubble Sort Exchanges: " + bubbleExchanges);

        System.out.println("--------------------------------------------------");

        // Run Selection Sort and get the number of exchanges
        int selectionExchanges = selectionSort(selectionArray);
        System.out.print("Selection Sort Result: ");
        printArray(selectionArray);
        System.out.println("Selection Sort Exchanges: " + selectionExchanges);
    }

    /**
     * Sorts an array using the bubble sort algorithm in ascending order.
     * Keeps a count of the number of element exchanges (swaps).
     */
    public static int bubbleSort(int[] array) {
        int exchanges = 0;
        boolean swapped;
        
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    exchanges++;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return exchanges;
    }

    /**
     * Sorts an array using the selection sort algorithm in ascending order.
     * Keeps a count of the number of element exchanges (swaps).
     */
    public static int selectionSort(int[] array) {
        int exchanges = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
                exchanges++;
            }
        }
        return exchanges;
    }
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}