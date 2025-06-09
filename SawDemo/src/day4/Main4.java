package day4;

public class Main4 {
    public static void main(String[] args) {
        //!:
        System.out.println(!true);
        System.out.println(!false);
        System.out.println();

        //&&: and.  both expression have to be true, then the result is true
//        System.out.println(expression1 && expression);
        System.out.println(true && true);       //true
        System.out.println(true && false);      //false
        System.out.println(false && true);      //false
        System.out.println(false && false);     //false

        System.out.println();

        //||: or.  any expression is true, then the result is true
        System.out.println(true || true);       //true
        System.out.println(true || false);      //true
        System.out.println(false || true);      //true
        System.out.println(false || false);     //false
    }
}
