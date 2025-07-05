package day14;

public class Main1 {
    public static void main(String[] args) {
        //3.xxxx
//        boolean x = isPrime(13);    //see if 13 is prime number or not
//        System.out.println(x);
//        boolean y = isPrime(121);    //see if 121 is prime number or not
//        System.out.println(y);
        boolean z = isPrime(59);    //see if 59 is prime number or not
        System.out.println(z);
    }

    //define a method, which takes an integer variable as parameter
    //return boolean value to represent if this parameter is prime number or not
    //prime number: an integer number which is greater than 1 and only divisible by 1 and itself
    //                  12      17      13      15      21      29      121     2(smallest prime number)
    //prime number:     no      yes     yes     no      no      yes     no      yes
    public static boolean isPrime(int value){
        //purpose:this method will tell if value is prime number or not
        if(value == 1){ //1 is not prime number
            return false;
        }

        //value: 13 -> is or not
        //13%2 == 0          no
        //13%3 == 0          no
        //....               no
        //13%6 == 0          no
        //13 is prime

        //value: 121 -> is or not
        //121%2 == 0          no
        //121%3 == 0          no
        //121%4 == 0          no
        //....
        //121%10 == 0          no
        //121%11 == 0          yes
        //not need to check other number, just proved 121 is not prime
        for(int i=2 ; i<=Math.sqrt(value) ; i++){
//            System.out.println(i);
            if(value % i == 0){
                return false;   //not a prime number
            }
        }
        //once your code reach here, then we can say this number is prime number
        return true;
    }
    //sqrt:the square root
    //the sqrt of 9 is 3
    //the sqrt of 36 is 6
    //the sqrt of 53 is 7.28   7*7=49   8*8=64
    //53%2 ==0    no            2*26.5
    //53%3 ==0     no            3*17.6666
    //53%4 ==0     no            4*13.24
    //53%5 ==0     no            5*10.6
    //53%6 ==0     no            6*8.9xxxx
    //53%7 ==0     no            7*7.57                 -> 7.28
    //53%8 ==0     no            8*6.625
    //53%9 ==0     no            9*5.888
    //53%10 ==0     no           10*5.3
}


// is 8 divisible by 1? divisible by 8? divisible by 2?
//      yes                 yes             yes                 -> not prime
// is 5 divisible by 1? divisible by 15? divisible by 3?
//      yes                 yes             yes                 -> not prime

