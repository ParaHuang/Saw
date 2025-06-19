package day8;

public class Main2_While {
    public static void main(String[] args) {
        /*
        int i = 1;
        while(i<=100){
            System.out.println(i);
            i++;
        }
        */

        //odd number
        /*
        int i=1 ;
        while(i<=100){
            System.out.println(i);
            i+=2;   //i is only odd number
        }
         */
        /*
        int i=1;
        while(i<=100){
            if(i%2 != 0) {
                System.out.println(i);//only print i when it's odd
            }
            i++;//i will be every number from 1 to 100 (odd + even)
        }
         */
        int i=1;
        while(i<=100){
            if(i%2 == 0){
                System.out.println(i);
            }
            i++;
        }

        //print all the leap year in the latest 1000 years(1025~2025)
        //1.divisible by 4 but not divisible by 100
        //2.divisible by 400
    }
}
