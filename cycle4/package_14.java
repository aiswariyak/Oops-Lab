import java.util.*;
import arithmetic.*;
public class package_14 implements addition{
       public int add(int a,int b){
          return(a+b);
        }
      public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the first number");
            int a=sc.nextInt();
          
            System.out.println("enter the second number");
            int b=sc.nextInt();
            package_14 a1=new package_14();
            System.out.println("\naddition of two numbers\n");
            System.out.println(a1.add(a,b));
            substraction s=new substraction();
            System.out.println("\nsubstraction of two numbers\n");
            System.out.println(s.sub(a,b));
            multiplication m=new multiplication();
            System.out.println("\nmultiplication of two numbers\n");
            System.out.println(m.mul(a,b));
            division d=new division();
            System.out.println("\ndivision of two numbers\n");
            System.out.println(d.div(a,b));
      }
}