package day1;

public class Start1 {
    public static void main(String[] args) {
        //access Student
        //initialize:create an object
        //Type name = new Type();
        Student stu = new Student();    //new->create
        //name.filed = value;
        //. -> of
        stu.number = 1001;
        stu.name = "Jack";
//        stu.age = 18;
        stu.className = "Java03";

        stu.study();
        stu.eat();

        Student stu2 = new Student();
        stu2.name = "Alex";
//        stu2.age = -180000;
        stu2.study();





        //int x = 12;

    }
}
