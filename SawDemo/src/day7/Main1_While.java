package day7;

public class Main1_While {
    public static void main(String[] args) {
//        if(1<5){
//            System.out.println("hello");
//        }

        //situation 1:endless loop
//        while(1<5){
//            System.out.println("hello");
//        }
        //situation 2:0 time loop
//        while(1>5){
//            System.out.println("hello");
//        }

        // situation 3: limit times of loop
        //(print hello for 5 times)
        int i=1;                //variable

        while(i<=5){
            System.out.println("hello");
            i++;    //i += 1;//i = i+1;   //to stop the loop, i should increase or decrease?   answer:increase
        }

    }
}



