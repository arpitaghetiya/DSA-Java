public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};

        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Second largest element = " + secondLargest);
    }
}
