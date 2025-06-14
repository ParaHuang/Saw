package day5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        //command+option+L  : format code

        //0~60, fail
        //60~69, pass
        //70~79, ok
        //80~89, great
        //90~100,excellent
        //others,invalid score
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a score:");
        int score = sc.nextInt(); //0~100

        //nesting
        if (score >= 0 && score <= 100) {//valid
            if (score < 60) {
                System.out.println("fail");
            } else if (score <= 69) {
                System.out.println("pass");
            } else if (score <= 79) {
                System.out.println("ok");
            } else if (score <= 89) {
                System.out.println("great");
            } else {
                System.out.println("excellent");
            }
        } else {//invalid
            System.out.println("invalid score");
        }


    }
}
