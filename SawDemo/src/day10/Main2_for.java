package day10;

public class Main2_for {
    public static void main(String[] args) {

        for (int i=1 ; i<=9 ; i++){ //control line/row
            for (int j=1 ; j<=i ; j++){ //control column
                //i->row
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
