import com.sun.nio.sctp.SctpStandardSocketOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Question 1
//       ArrayList<String> longest = new ArrayList<>();
//
//        String[] words = {"is","cat" , "dog", "red", "is" ,"am"};
//       int max =0;
//        for (String w: words){
//            if(w.length()>max)
//            { max=w.length();
//                longest.clear();
//                longest.add(w);}
//            else if (w.length()== max)
//                    longest.add(w);
//
//        }
//        System.out.println("Longest words is "+longest);
//***************************************************************************
        //Question 2
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(1);
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(3);
//        numbers.add(5);
//
//        int count =1;
//        for (int i = 1; i <numbers.size() ; i++) {
//            if(numbers.get(i).equals(numbers.get(i-1))){
//                count++;}
//            else {
//                System.out.println(numbers.get(i - 1) + " count " + count + " times");
//            count=1;
//            }
//        }
//        System.out.println(numbers.getLast()+ " count "+count+ " times");

//***************************************************************************
        //Question 3

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(4);
//        numbers.add(17);
//        numbers.add(7);
//        numbers.add(25);
//        numbers.add(3);
//        numbers.add(100);
//        System.out.println("enter how many largest number you want");
//        int k = input.nextInt();
//        ArrayList<Integer> newArray = new ArrayList<>();
//
//
//        while (k!=0 & !numbers.isEmpty()){
//            int max =numbers.get(0);
//            for (int n :numbers){
//            if(n>max){
//                max=n;}
//            }
//
//        newArray.add(max);
//        numbers.remove(Integer.valueOf(max));
//        k--;
//        }
//        System.out.println(newArray.size()+" Larger element of array are: "+newArray);

//************************************************************************
//Question 4 (Revers array)
//ArrayList<Integer> original =new ArrayList<>();
//        original.add(5);
//        original.add(4);
//        original.add(3);
//        original.add(2);
//        original.add(1);
//        System.out.println("Original array is :"+original);
//        System.out.println("Revers array is :"+revers(original));
//************************************************************************
//Question 5 (Menu)
//        System.out.println("Please enter size of array");
//        int size = input.nextInt();
//
//        int [] array = new int[size];
//        int currentSize = 0;
//
//        int num=0;
//        do {
//            System.out.println("Please select one of the menu");
//            System.out.println("1- Accept elements of an array");
//            System.out.println("2- Display elements of an array");
//            System.out.println("3- Search the element within array");
//            System.out.println("4- Sort the array");
//            System.out.println("5- Stop");
//            num= input.nextInt();
//
//            switch (num){
//                case 1:
//                    do{
//                    if(currentSize<array.length){
//                            System.out.println("enter elements to add ");
//                            int element = input.nextInt();
//                            add(array, element, currentSize);
//                            currentSize++; }
//                    else System.out.println("Sorry array is full");
//                        }while (currentSize<array.length);
//                    break;
//                case 2:
//                    display(array);
//                    break;
//                case 3:
//                    System.out.println("Enter the element to search");
//                    int element = input.nextInt();
//                    int result = search(array,element);
//                    if(result==-1){
//                        System.out.println("Not found");
//                    }else System.out.println("The index of "+element+" is "+result);
//                    break;
//                case 4:
//                    Arrays.sort(array);
//                    break;
//                case 5:
//                    break;
//            }
//
//        }while (num!=5);

//************************************************************************
//Question 6 (Random)
//        Random random=new Random();
//
//        System.out.println("Enter the minimum value of range");
//        int min = input.nextInt();
//        System.out.println("Enter the maximum value of range");
//        int max = input.nextInt();
//        System.out.println("Enter the number of random value to generate");
//        int num = input.nextInt();
//
//        while (num!=1){
//        int randomNumber = random.nextInt(max-min)+min;
//            System.out.print(randomNumber+"-");
//            num--;
//        }
//        int randomNumber = random.nextInt(max-min)+min;
//        System.out.print(randomNumber);

// ************************************************************************
//Question 7 (Password)
//        System.out.println("Enter password");
//        String pass = input.nextLine();
//        int lengthScore=checkLength(pass);
//        int specialCharecter=checkSpecialCharecter(pass);
//        int LowerUpperCase =checkLowerUpperCase(pass);
//        int totalScore = lengthScore+specialCharecter+LowerUpperCase;
//
//        if(totalScore>=8){
//            System.out.println("Strong password");
//        } else if (totalScore>=5) {
//            System.out.println("Moderately Strong");
//        }else System.out.println("Weak");



// ************************************************************************
//Question 8 (Fibonacci)
        System.out.println("Enter the number of fibonacci terms");
        int num = input.nextInt();
        int sumA = 0;
        int sumB = 1;
        for (int i =0 ;i<num ;i++){
            System.out.print(sumA+" ");
            int next = sumA+sumB;
            sumA=sumB;
            sumB=next;

        }



//***********************************************************************
    }//end of main

//Q4
    public static ArrayList<Integer> revers(ArrayList<Integer> array) {
        int n=array.size();
        for (int i = 0; i < n/2; i++) {
            int temp = array.get(i);
            array.set(i,array.get(n-1-i));
            array.set(n-1-i , temp);
        }

            return array;
    }

    //Q5
    public static void add(int [] array, int element, int index){
            array[index]=element;
    }

    public static void display(int [] array){
        System.out.println(Arrays.toString(array));
    }

public static int search (int [] array, int element){
    for (int i = 0; i < array.length; i++) {
        if (array[i] == element)
            return i;
    }
        return -1;
}


//Q7
    public static int checkLength(String pass){
        if(pass.length()<=5){return 0;}
        else if(pass.length()>=6&&pass.length()<=7){return 2;}
        else return 3;
    }

    public static int checkSpecialCharecter(String pass){

        if(pass.matches("[a-zA-Z0-9]+")){
            return 0;
        }else return 2;
    }

    public static int checkLowerUpperCase(String pass){
            if(pass.replaceAll("[^a-zA-Z]", "").isEmpty())
                return 0;
            else return 3;

    }

    }