package Homework4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;

public class Homework4_task2 {
    public static void main(String[] args){
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);
        int number4 = Integer.parseInt(args[3]);
        int number5 = Integer.parseInt(args[4]);
        int number6 = Integer.parseInt(args[5]);
        int number7 = Integer.parseInt(args[6]);
        int [] arr= new int[]{number1,number2,number3,number4,number5,number6,number7};
        System.out.println("base " + Arrays.toString(arr));

        Arrays.sort(arr, 0, 7);
        System.out.println("ask " + Arrays.toString(arr));

        Integer[] Array = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Array[i] = arr[i];
        }
        Arrays.sort(Array, Collections.reverseOrder());
        System.out.println("desk " + Arrays.toString(Array));

        ArrayDeque<Integer> states = new ArrayDeque<Integer>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            if(i%2 == 0) {
                states.addFirst(arr[i]);
            } else {
                states.addLast(arr[i]);
            }
        }
        System.out.println("inner " +  states);
    }
}
