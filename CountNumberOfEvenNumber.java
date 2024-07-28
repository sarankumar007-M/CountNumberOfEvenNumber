public class CountNumberOfEvenNumber {

    public static void main(String[] args) {
        
        int[] arr = {2, 5, 8, 10, 13, 15, 18, 29};

        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // check if the element is even
                evenCount++;
            }
        }

        System.out.println("Number of even numbers in the array: " + evenCount);
    }
}

