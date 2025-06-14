package day5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //image that you have 3kg gold saved in a safe
        //but this safe is inside the other one

        //the process to get your gold out is
        //1.input the password of first safe
        //2.if it's incorrect, then the system shut down
        //  otherwise , then input the password of inside safe
        //3.    if it's incorrect, then the system shut down
        //      otherwise you can get gold
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the password for the outside safe:");
        int password1 = sc.nextInt();
        if(password1 != 12347){
            System.out.println("incorrect outside password, now system is shutting down");
        }else{
            System.out.println("outside password is correct, now please enter the password for the insde safe:");
            int password2 = sc.nextInt();
            if(password2 != 456){
                System.out.println("incorrect inside password, now system is shutting down");
            }else{
                System.out.println("inside password is correct, please take your gold");
            }
        }



    }
}
