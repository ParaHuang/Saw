package day10;

public class Main1_for {
    public static void main(String[] args) {
        for (int i=1 ; i<=15 ; i++){
            for (int j=1 ; j<=15 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1 ; i<=15 ; i++){ //control line/row
            for (int j=1 ; j<=i ; j++){ //control column
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
