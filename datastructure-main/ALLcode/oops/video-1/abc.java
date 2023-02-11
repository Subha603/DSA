
public class abc {

  public static void main(String[] args) {
    /* store 5 roll no */
    // int[] number = new int[5];
    // /* store 5 names */
    // String[] names = new String[5];
    // /* data of the 5 students:{roll no,name,marks} */
    // int[] rno = new int[5];
    // String[] name = new String[5];
    // float[] marks = new float[5];
    // Student[] students = new Student[5];

    // Student11 kunal=new Student11(1,"Subha",76f);

    // kunal.greeting();
    // kunal.changeName("subahjit_Kunsu");
    // kunal.rno=1;
    // kunal.name="Kunal Kuwsaha";
    // kunal.marks=98;
    // System.out.println(kunal.rno);
    // System.out.println(kunal.name);
    // System.out.println(kunal.marks);
    // }
   Student12 kunal=new Student12();
    Student12 one = new Student12(kunal);
  
    // Student12 two = one;
    // one.name = "kundu";
    // System.out.println(two.name);

  }
}

  class Student12 {
    int rno;
    String name;
    float marks;
    // void greeting()
    // {
    // System.out.println("My Name is "+name);
    // }
    // void changeName(String Name)
    // {
    // name=Name;
    // }
    // Student11(int Rollno,String Name,Float Marks)
    // {
    // this.rno=Rollno;
    // this.name=Name;
    // this.marks=Marks;
    // }
    Student12(){

    }
    Student12(Student12 other){
      rno=other.rno;
      name=other.name;
      marks=other.marks;

    }

    Student12(int rno,String name,float marks){
      this.rno=rno;
      this.name=name;
      this.marks=marks;

    }

    //  Student11(){
    //   this.name=name;
    //  }
  

  }

