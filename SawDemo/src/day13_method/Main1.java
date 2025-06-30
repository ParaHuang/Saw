package day13_method;

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

        print("hello",3);     //print 3 "hello"
        System.out.println("~~~~~~~~~~~~~~");
        print("hey",8);       //print 8 "hey"
        System.out.println("~~~~~~~~~~~~~~");
        print("你好",5);      //print 5 "你好"
    }

    public static void print(String x,int y){
        for(int i=1 ; i<=y ; i++){
            System.out.println(x);
        }
    }

    //method:a code block with some certain logic.
    // then whenever you want to use this logic, you just call the method
    /*
    public returnType methodName(parameterList){
        code block
    }
    */

    public static void print5Hello(){
        for(int i=1 ; i<=5 ; i++){
            System.out.println("hello");
        }
    }


}

