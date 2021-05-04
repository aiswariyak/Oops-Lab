public class Employee
  {
    int emp_id;
    String name;
    int m_sal;
    void read(int id,String n,int s)
      {
         emp_id=id;
         name=n;
         m_sal=s;
      }
    void display()
      {
         System.out.println("employee id:"+ emp_id);
         System.out.println("employee name:"+ name);
         System.out.println("employee monthly salary:"+ m_sal);
      }
    public static void main(String[] args)
      {
         Employee e1=new Employee();
         e1.read(1,"raj",250);
         Employee e2=new Employee();
         e2.read(2,"akhil",300);
         System.out.println("yearly salary of "+ e1.name + " is " +(e1.m_sal)*12);
         System.out.println("yearly salary of "+ e2.name + " is " +(e2.m_sal)*12);
      }
  }
