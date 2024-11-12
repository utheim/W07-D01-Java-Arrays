public class Exercise3 {
    public static void main(String[] args) {

        int[] myArray = {10, 15, 3, 66, 4, 9, 1, 100, 2};

        int largest = findLargestNumber(myArray);
        int smallest = findSmallestNumber(myArray);

        System.out.println(largest + " is the largest number");
        System.out.println(smallest + " is the smallest number");
    }

    public static int findLargestNumber(int[] myArray) {
        int largest = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > largest) {
                largest = myArray[i];
         ;   }
        }
        return largest;
    }
    public static int findSmallestNumber(int[] myArray) {
        int smallest = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < smallest) {
                smallest = myArray[i];
                ;   }
        }
        return smallest;
    }

}
