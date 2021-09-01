import graphics.*;
import java.util.*;
public class 13_package{
      public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the length of rectangle");
            float a=sc.nextFloat();
            System.out.println("enter the width of rectangle");
            float b=sc.nextFloat();
            rectangle r=new rectangle();
            r.area(a,b);
      }
}