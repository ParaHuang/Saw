package day9;

public class Main1_For {
    public static void main(String[] args) {
        /*
        int i=1;
        while(i<=5){
            System.out.println("hello");
            i++;
        }
        */

        for(int i=1 ; i<=5  ;  i++  ){
            System.out.println("hello");
        }

        for(int i=1 ; i<=100 ; i++){
            System.out.println(i);
        }

        for(int i=1 ; i<=100 ; i+=2){
            System.out.println(i);      //odd number from 1 to 100
        }

        for (int i=2 ; i<=100 ; i+=2){
            System.out.println(i);
        }

        for (int i=1 ; i<=100 ; i++){
            if(i%2!=0){
                System.out.println(i);  //odd number
            }
        }

    }
}
