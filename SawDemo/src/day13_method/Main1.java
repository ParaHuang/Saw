package day13_method;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {//entrance of program
        /*
        print5Hello();
        System.out.println("--------------");

        print5Hello();
        System.out.println("===============");

        print5Hello();
        System.out.println("~~~~~~~~~~~~~~");
        */
        /*
        print("hello",3);     //print 3 "hello"
        System.out.println("~~~~~~~~~~~~~~");
        print("hey",8);       //print 8 "hey"
        System.out.println("~~~~~~~~~~~~~~");
        print("你好",5);      //print 5 "你好"
         */

        int x = generateNumber1to100();
        System.out.println(x);

        int x1 = addAbs(-8,3);
        int x2 = addAbs(7,4);
        int x3 = addAbs(-9,-7);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }

    //4.with parameter with return
    public static int addAbs(int a,int b){//find out the sum of absolute value of a and b
        //the absolute value of -5 is 5
        //the absolute value of 3 is 3
        //a=-8 , b = 3 -> result = 11
        //a=7 , b = 4  ->  result = 11
        //a=-9, b= -7 ->   result = 16
        if(a<0){
            a *= -1;        //a = -1 * a;
        }
        if(b<0){
            b *= -1;
        }

        int result = a + b;
        return result;
    }

    //3.no parameter with return
    public static int generateNumber1to100(){
        //a lot of code
        Random random = new Random();
        int result = random.nextInt(1,101);
        return result;//this value usually is the result of process above
    }


    //method:a code block with some certain logic.
    // then whenever you want to use this logic, you just call the method
    /*
    public returnType methodName(parameterList){
        code block
    }
    */

    //1.no parameter no return
    public static void print5Hello(){
        for(int i=1 ; i<=5 ; i++){
            System.out.println("hello");
        }
    }

    //2.with parameter no return
    public static void print(String x,int y){
        for(int i=1 ; i<=y ; i++){
            System.out.println(x);
        }
    }

}

