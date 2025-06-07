package day3;

public class Main1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("VW");  //Toyota
        car1.display("nice");  //this is a nice car
//        String volumn = car1.createSmoke();
//        System.out.println("car1 create "+volumn + " gas");
        String make1 = car1.getMake();
        System.out.println("the make of this car is "+make1);

        System.out.println();

        Car car2 = new Car();
        car2.setMake("Ford");  //Ford
        car2.display("great");//this is a great car
    }
}
