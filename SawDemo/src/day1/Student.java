package day1;

//class->template，model
//  |
//Object
public class Student {
    //fields(variables):number, name,age,className(instance variable)
    int number;
    String name;
    private int age;
    String className;

    //methods:what things a method can do
    //big eyes, long legs, thin, gentle personality，hard working    -> fileds
    //can study, can read,                              ->  methods
    //    Someone
    //study
    /*
    public   returnType     methodName(parameterList){
        whatever you want to do in this method
    }
    parameterList: the data we need to complete the operations
    returnType:void   or the result that method wants to give away

     */
    public void study(){
        System.out.println(name+" is studying,he is "+age+"years old");
    }
    //eat, "the student is eatting"
    public void eat(){
        System.out.println("the student is eating,he's from "+className);
    }

}
