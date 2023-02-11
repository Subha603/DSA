package prostatic;

public class Human
{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    /*---------------this keyword in static ---------------- */
    static void massage()
    {
        System.out.println("Hello World");
        //System.out.println(this.age);/*gives error cant use this over here */
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        /*the propertis that are related to object but that are common
        to all object of the class (like the population example)we declerar those
        as static
         */
       // this .population+=1;
        /*whenever you Accessing static variable ,Modifing static variable,declearing static variable
        do not do by the object name or reference variable
        you used the class name.
         */
        /*Static variable do not dependes on the object */
        /*you  can creat static method and varriable */
        Human.population+=1;
    }
}
