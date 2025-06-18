package day6;

public class Main2_Switch {
    public static void main(String[] args) {
        //1: this month has 31 days
        //2: this month has 28 days
        //3: this month has 31 days
        //....
        //12: this month has 31 days

        //1,3,5,7,8,10,12   ->  31days
        //2                 ->  28days
        //4,6,9,11          ->  30days

        int month = 12;
        switch (month){
            case 2:
                System.out.println("this month has 28 days");
                break;
            case 4,6,9,11:
                System.out.println("this month has 30 days");
                break; //stop program keep going to the other case
            case 1,3,5,7,8,10,12:
                System.out.println("this month has 31 days");
                break;
            default:
                System.out.println("invalid month");
        }

        if(month == 2){
            System.out.println("this mon th has 28 days");
        }else if(month == 4 || month == 6 || month == 9 || month == 12 ){
            System.out.println("30 days");
        }


    }
}
