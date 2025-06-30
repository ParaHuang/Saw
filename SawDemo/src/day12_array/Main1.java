package day12_array;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        //1.define an array,declare the length
        int[] arr = new int[15];     //5->length

        Random random = new Random();
        //access array element by arr[index]        ,   index:0 ~ length-1
//        arr[0] = random.nextInt(1,101);
//        arr[1] = random.nextInt(1,101);
//        arr[2] = random.nextInt(1,101);
//        arr[3] = random.nextInt(1,101);
//        arr[4] = random.nextInt(1,101);
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = random.nextInt(1,101);
        }

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }


    }
}
