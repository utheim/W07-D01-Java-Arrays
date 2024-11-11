import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Arrays in Java are FIXED size

//        declare a new int array

        int[] myNumbersArray = new int[5];



//        access individual values in my array
        myNumbersArray[0] = 100;
        myNumbersArray[1] = 200;

//        print values from my array
        System.out.println(myNumbersArray[3]);


        int myNumber = 10;

        for(int i =0;i<myNumber;i++){
//            System.out.println(i);
        }

//        .length attribute
        System.out.println(myNumbersArray.length);

//        looping through an array

        for(int i =0; i<myNumbersArray.length;i++){
            System.out.println(myNumbersArray[i]);
        }

        boolean[] newArr = new boolean[5];


        for(int i =0; i<newArr.length;i++){
//            System.out.println(newArr[i]);
        }


//        declaring an array and initializing the values

        int[] newNumbersArray = {100,10000,7,2,400,500};

//        System.out.println(newNumbersArray[0]);

        for(int i= 0; i<newNumbersArray.length;i++){
            System.out.println(newNumbersArray[i]);
        }


//      enhanced for Loop
        for(int i : newNumbersArray){
            System.out.println(i);
        }

        String[] myStudents = {"Hasan","Maryam","Paul","Martine"};

        for(String oneStudent : myStudents){
            System.out.println(oneStudent);
        }

        for(int i =0; i<myStudents.length;i++){
            String oneStudent = myStudents[i];

            System.out.println(oneStudent);
        }



//        printing my array using the Arrays class from java utils package
        System.out.println(Arrays.toString(newNumbersArray));

        Arrays.sort(newNumbersArray);

        System.out.println(Arrays.toString(newNumbersArray));


//        printing random number
        Random random = new Random();

        System.out.println(random.nextInt(100));


        int[] originalArray = {1,2,3,4,5,6};

        int[] copiedArray = Arrays.copyOf(originalArray,originalArray.length);

        System.out.println(originalArray);
        System.out.println(copiedArray);


        int mySecondNumber = 200;

        int copiedNumber = mySecondNumber;

        copiedNumber = 300;
        System.out.println(mySecondNumber);
        System.out.println(copiedNumber);






        /*
        Variables
        originalArray = [I@eed1f14
        copiedArray = [I@eed1f14
        mySecondNumber = 100

        Arrays
        {1,2,3,4,5,6} = [I@eed1f14
        */
    }





}