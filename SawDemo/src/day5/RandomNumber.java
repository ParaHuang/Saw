package day5;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rd = new Random();   //a machine makes random number
        //int x = rd.nextInt();   //generate a big random number
        //int x = rd.nextInt(5);  //generate a number in the range of 0~bound-1
        int x = rd.nextInt(2,5);//generate a number in the range of origin~bound-1
        System.out.println(x);
    }
}
