import java.util.*;
class Employee{
      protected int empid;
      protected String name;
      protected int salary;
      protected String address;
      Employee(int id,String n,int s,String a){
              empid=id;
              name=n;
              salary=s;
              address=a;
      }
}
class Teacher extends Employee{
      String dept;
      String subjects;
      Teacher(int id,String n,int s,String a,String d,String sub){
             super(id,n,s,a);
             dept=d;
             subjects=sub;
      
     }
     void disp(){
             System.out.println(); 
             System.out.println("****************************DETAILS OF TEACHER***********************");
             System.out.println("Employee Id:   "+empid);
             System.out.println(" Name:   "+name);
             System.out.println("Salary:   "+salary);
             System.out.println("Address:   "+address);
             System.out.println(":Department   "+dept);
             System.out.println("Subjects Taught:   "+subjects);
             System.out.println();
     }
     
}    
public class main_inheritance{
      public static void main(String[] args){
             Scanner sc=new Scanner(System.in); 
             System.out.println("Enter The Total No Of Teachers:");
             int n=sc.nextInt();
             sc.nextLine();
             Teacher t[]=new Teacher[n];
             for(int i=0;i<n;i++){
                     System.out.println("enter Employee id:");
                     int id=sc.nextInt();
                     sc.nextLine();                     
                     System.out.println("enter Employee name:");
                     String nam=sc.nextLine();
                     System.out.println("enter Employee salary:");
                     int s=sc.nextInt();
                     sc.nextLine();
                     System.out.println("enter Employee address:");
                     String a=sc.nextLine();
                     System.out.println("enter the Department:");
                     String d=sc.nextLine();
                     System.out.println("enter the Subjects taught");
                     String sub=sc.nextLine();
                     t[i]=new Teacher(id,nam,s,a,d,sub);
            }
            for(Teacher i:t){
                     i.disp();
            }     
      }       
}