import graphics.*;
import java.util.*;
public class package_13 implements graphics.square{
    public float area(float a){

               return(a*a);
    }
      public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the length of rectangle");
            float a=sc.nextFloat();
            System.out.println("enter the width of rectangle");
            float b=sc.nextFloat();
            rectangle r=new rectangle();
            System.out.println("\narea of rectangle\n");
            System.out.println(r.area(a,b));
            System.out.println("enter the length of triangle");
            float c=sc.nextFloat();
            System.out.println("enter the height of triangle");
            double h=sc.nextDouble();
            triangle t=new triangle();
            System.out.println("\narea of triangle\n");
            System.out.println(t.area(c,h));
            System.out.println("enter the radius of circle");
            double rad=sc.nextDouble();
            circle c1=new circle();
            System.out.println("\narea of circle\n");
            System.out.println(c1.area(rad));
            System.out.println("enter the length of square");
            float len=sc.nextFloat();
            package_13 s=new package_13();
            System.out.println("\narea of circle\n");
            System.out.println(s.area(len));
      }
}