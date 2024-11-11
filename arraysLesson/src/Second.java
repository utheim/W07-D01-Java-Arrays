public class Second {
    public static void main(String[] args){


        System.out.println(isNumberBigger(10,new int[]{1,2,3,4,5}));


    }

//    method that returns true if the number given is greater than all numbers in the array

    public static boolean isNumberBigger(int myNumber, int[] myArray){

//      Traditional for loop solution
        for(int i =0; i<myArray.length; i++){

            if(myNumber<myArray[i]){
                return false;
            }
        }


//      Enhanced for loop solution
        for(int oneNumber : myArray){
            if(myNumber<oneNumber){
                return false;
            }
        }
        return true;
    }



    public static void sayGoodmorning(String name){
        System.out.println("good morning " + name);
    }

    public static int addTwoNumbers(int num1, int num2){



        return num1 + num2;
    }


}
