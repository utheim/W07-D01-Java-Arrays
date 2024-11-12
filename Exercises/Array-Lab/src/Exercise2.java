import java.util.Random;


public class Exercise2 {
     public static void main(String[] args) {
        int[] randomArray = createRandomizedArray(10);
        for (int num : randomArray) {
            System.out.println(num);
        }
    }
    public static int[] createRandomizedArray(int length) {
        int[] randomArray = new int[length];

        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            randomArray[i] = rand.nextInt(1000);
        }
        return randomArray;
    }
}
