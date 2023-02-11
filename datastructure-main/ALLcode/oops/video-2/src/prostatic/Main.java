package prostatic;

public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human(22, "kunal", 1000, false);
//        Human rahul = new Human(34, "rahul", 15000, true);
//        Human Arpit=new Human(32,"subh",40,true);
//        //System.out.println(kunal.population);
//       // System.out.println(rahul.population);
//        System.out.println(Arpit.population);
            /*you can not call the non static method in static so greeting gives error*/
    //  greeting();
      //you cant use this because it requrires an instance
        //but the function you are using it  does not depend on instance

           /*It gives error because greeting  is non-static method*/
    /*Which is not static belong to an object */
       

    }
   
    static void fun()
    {
        //you cannot access non static stuff without referencing their instances in a
        //static context
        /*----------------hence here I am referencing it-----------------*/
        
        Main obj=new Main();
        obj.greeting();
    }
/*we know that somthing which is not static,belongs to an object */
   void greeting ()
   {
       System.out.println("Hello World");
   }


   

}

