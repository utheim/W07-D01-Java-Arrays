import java.util.Random;


public class Exercise4 {
    public static void main(String[] args) {
        int[] randomArray = createRandomizedArray(4);
        System.out.println("This is the random array: ");
        for (int num : randomArray) {
            System.out.println(num);
        }

        int sum = sumArray(randomArray);
        System.out.println("This is the sum of the random array: " + sum );
    }

    public static int[] createRandomizedArray(int length) {
        int[] randomArray = new int[length];
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            randomArray[i] = rand.nextInt(100);
        }
        return randomArray;
    }

    public static int sumArray(int[] myArray) {
        int sum = 0;

        for (int j : myArray) {
            sum += j;
        }
         return sum;
    }
}
