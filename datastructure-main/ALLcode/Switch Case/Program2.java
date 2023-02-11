import java.util.Scanner;

public class Program2 
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int empId=s.nextInt();
       
        String department=s.nextLine();
        switch(empId)
        {
            case 1:
            System.out.println("Subhajit kundu");
            break;
            case 2:
            System.out.println("Subhadip");
            break;
            case 3:
            switch(department)
            {
                
                
                    case "it":
                        System.out.println("It Department");
                         break;
                    case "Managment":
                        System.out.println("Mangment");
                        break;
                        default:
                        System.out.println("No Deparment enter");
                        break;
            }
            default:
            System.out.println("Enter Correct EmpId");
                    
                   
                }   
        

        s.close();
        }
    }    

