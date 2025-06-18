package day6;

public class Main1_Switch {
    public static void main(String[] args) {
        //4294967296 possible values
        int num = 2147483647;          //~2147483648~2147483647

        int day = 16;
        //1:today is Monday
        //2:today is Tuesday
        //3:today is Wednesday
        //...
        //7:today is Sunday
        //others: invalid day number
        switch (day){
            case 1:
                System.out.println("today is Monday");
                break;
            case 2:
                System.out.println("today is Tuesday");
                break;
            case 3:
                System.out.println("today is Wednesday");
                break;
            case 4:
                System.out.println("today is Thursday");
                break;
            case 5:
                System.out.println("today is Friday");
                break;
            case 6:
                System.out.println("today is Saturday");
                break;
            case 7:
                System.out.println("today is Sunday");
                break;
            default:
                System.out.println("invalid day");
        }


    }
}
