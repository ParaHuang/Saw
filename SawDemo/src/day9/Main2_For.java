package day9;

public class Main2_For {
    public static void main(String[] args) {
        /*
        //A->B->D->C->B->D->C->B->D->C->B->D->C->B->D->C->B(finish it since condition is false)
        int i=1;                        //A
        while(i<=5){                    //B
            System.out.println("hello");//D
            i++;                        //C
        }
        */


        //      A        B        C
        for( int i=1  ; i<=5  ;  i++ ){
             System.out.println("hello");               //D
        }
        //A->B->D->C->B->D->C->B->D->C->B->D->C->B->D->C->B(finished loop since condition is false)
    }
}
