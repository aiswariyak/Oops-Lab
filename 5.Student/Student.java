public class Student
{
  int rn;
  String name;
  float m1;
  float m2;
  float m3;
  float t;
  void read(int n,String nam,float A,float B,float C)
    {  
       
       rn=n;
       name=nam;
       m1=A;
       m2=B;
       m3=C;
       t=m1+m2+m3;
       }
  void total(Student A,Student B,Student C)
    {
     if(A.t>B.t)
       {
         if(A.t>C.t)
          {
            System.out.println(A.name+" has highest score");
          }
        else
          {
            System.out.println(C.name+" has highest score");
          }
           
       } 
    
    else if(B.t>C.t)
       {
         System.out.println(B.name+" has highest score");
       } 
    else
     {
       System.out.println(C.name+" has highest score");
     }
   }

 public static void main(String[] args)
  {
   Student s1=new Student();
   Student s2=new Student();
   Student s3=new Student();
   s1.read(1,"adhav",25,30,45);
   s2.read(2,"anju",45,40,15);
   s3.read(3,"binil",27,34,50);
   s1.total(s1,s2,s3);
  }
}