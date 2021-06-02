import java.util.*;
class Person{
      protected String name;
      protected String gender;
      protected String address;
      protected int age;
      Person(String n,String g,String add,int a){
             name=n;
             gender=g;
             address=add;
             age=a;
      }
      void disp(){
            System.out.println("Name:   "+name);
            System.out.println("Gender:   "+gender);
            System.out.println("Address:   "+address);
            System.out.println("Age:   "+age);
      }
   
}
class Employee extends Person{
     protected int empid;
     protected String company_name;
     protected String qualification;
     protected int salary;
     Employee(String n,String g,String add,int a,int id,String cn,String q,int s){
              super(n,g,add,a);
              empid=id;
              company_name=cn;
              qualification=q;
              salary=s;
     }
     void disp(){
            super.disp();
            System.out.println("Employee id:   "+empid);
            System.out.println("Company_name:   "+company_name);
            System.out.println("Qualification:   "+qualification);
            System.out.println("Salary:   "+salary);
      }

}
class Teacher extends Employee{
      String dept;
      String subject;
      int teacherid;
      Teacher(String n,String g,String add,int a,int id,String cn,String q,int s,String d,String sub,int tid){
             super(n,g,add,a,id,cn,q,s);
             dept=d;
             subject=sub;
             teacherid=tid;
      
     }
     void disp(){
             System.out.println(); 
             System.out.println("****************************DETAILS OF TEACHER***********************");
             super.disp();
             System.out.println(":Department   "+dept);
             System.out.println("Subjects Taught:   "+subject);
             System.out.println("Teacher id:   "+teacherid);
             System.out.println();
     }
     
}    
    
public class main_multilevel_inheritance{
      public static void main(String[] args){
             Scanner sc=new Scanner(System.in); 
             System.out.println("Enter The Total No Of Teachers:");
             int n=sc.nextInt();
             sc.nextLine();
             Teacher t[]=new Teacher[n];
             for(int i=0;i<n;i++){
                     System.out.println("enter the name:");
                     String name=sc.nextLine();
                     System.out.println("Gender:");
                     String g=sc.nextLine();
                     System.out.println("Address:");
                     String add=sc.nextLine();
                     System.out.println("Age:");
                     int a=sc.nextInt();
                     sc.nextLine(); 
                     System.out.println("enter Employee id:");
                     int id=sc.nextInt();
                     sc.nextLine();                     
                     System.out.println("enter company name:");
                     String cn=sc.nextLine();
                     System.out.println("enter qualification:");
                     String q=sc.nextLine();
                     System.out.println("enter salary:");
                     int s=sc.nextInt();
                     sc.nextLine();
                     System.out.println("enter the Department:");
                     String d=sc.nextLine();
                     System.out.println("enter the Subject taught");
                     String sub=sc.nextLine();
                     System.out.println("enter the teacher id:");
                     int tid=sc.nextInt();
                     sc.nextLine();
                     t[i]=new Teacher(name,g,add,a,id,cn,q,s,d,sub,tid);
            }
            for(Teacher i:t){
                     i.disp();
            }     
      }       
}
