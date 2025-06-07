package day2;

public class Main1 {
    public static void main(String[] args) {
        //initialize an instance
        //ClasName name = new ClasName();
        Student stu = new Student();
        //.  member operator    <->     of
//        stu.id = 1001;
//        stu.name = "Jack";
//        stu.age = -18;
        stu.setAge(-18);  //18
//        stu.gender = "male";
        stu.sleep();
//        System.out.println("the id of this student is "+stu.id);
//        System.out.println("the name of this student is "+stu.name);
//        System.out.println("the age of this student is "+stu.age);
//        System.out.println("the gender of this student is "+stu.gender);

        Student stu2 = new Student();
        stu2.setAge(-19);//19
        stu2.sleep();
    }
}
