import java.util.*;
class Employee{
   int eNo;
   String eName;
   int eSalary;
   Employee(int n,String name,int sal){
      eNo=n;
      eName=name;
      eSalary=sal;
  }
  int search(int k){
      if(eNo==k)
        return 1;
      else
        return 0;
  }     
  void disp(){
      System.out.println("employee No: "+eNo);
      System.out.println("employee Name: "+eName);
      System.out.println("employee Salary: "+eSalary);
  }
   
}

public class main_employee {
   public static void main(String[] args){
      int i,temp=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the total no of employees");
      int n=sc.nextInt();
      Employee e[]=new Employee[n];
      for(i=0;i<n;i++){
         System.out.println("enter the employee no:");
         int en=sc.nextInt();
         System.out.println("enter the employee name:");
         String name=sc.next();
         System.out.println("enter the employee salary:");
         int sal=sc.nextInt();
         e[i]=new Employee(en,name,sal);
      }
      System.out.println("enter the employee Number which you want to search:");
      int key=sc.nextInt();
      for(Employee j:e){
         temp=j.search(key);
         if(temp==1){ 
            System.out.println("employee with employee number " +key+" is present in employee class");
            System.out.println("details of employee having eNo= "+key);
            j.disp();
            break;
         }
      }
      if(temp==0)
        System.out.println("employee with employee number " +key+" is  not present in employee class");      
   }
    
}
