package day2;

//OOP(object oriented programming)
//Encapsulation:for code safety.(make fields private,make methods public.access those private fields by public methods)
public class Student {  //a description of all the students group
    //attributes,fields,instance variables,member variables

    //with private, you can only access it inside of current class
    private int id;
    private String name;
    private int age;
    private String gender;

    //access those private fields by public methods   -- getters/setter
    //int abc;
    //1st thing:     abc = 20;                    ->setters     public void setAbc(){}
    //2nd thing:    System.out.println(abc);      ->getters

    //declare parameter/variable
    //parameter:the data needed inside of a method
    public void setAge(int newA){
        //add a checking process here
        if(newA<0){
            //throw a bomb
            throw new RuntimeException("invalid age");
        }
        age = newA;
    }

    public void sleep(){
        System.out.println("this "+age+" years old student is sleeping");
    }

}
//naming rule in java
//1.you can only use letters,numbers or _
//2.can't start with number

//hello1 ,      hello_1     ,hello1o1,  _hello000
