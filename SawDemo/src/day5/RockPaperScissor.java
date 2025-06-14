package day5;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please choose: 1-rock 2-paper 3-scissors:");
        int user = sc.nextInt();
        if(user == 1){
            System.out.println("user chose rock");
        }else if(user == 2){
            System.out.println("user chose paper");
        }else{
            System.out.println("user chose scissors");
        }


        Random rd = new Random();
        int computer = rd.nextInt(1,4);
        System.out.println(computer);
        //finish part 1:display what computer chose


        //finish part 2:display the result
        //first result: it's a tie
        //second result:user win
        //last result:computer win
    }
}
