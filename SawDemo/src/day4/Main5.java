package day4;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        //           create
        Scanner sc = new Scanner(System.in);  //System.in->input equipment of your system->keyboard
        //this will pause your program, because it's waiting for you to input an integer number
        //input the number, then press enter->to confirm  , then this number will be saved in x
        int x = sc.nextInt();

//        int x = 10;
        int y = sc.nextInt();
        System.out.println(x+y);
    }
}
