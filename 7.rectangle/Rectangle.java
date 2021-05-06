public class Rectangle
   {
     double width;
     double length;
     double area;
     String color;
     Rectangle(double w,double l,String c)
       {
        width=w;
        length=l;
        color=c;
       }
    void Area()
       { 
         area=length*width;
         System.out.println("The area of the rectangle with length "+length+" and width "+width+" is:  "+area);
       }
    void compare(Rectangle b)
       {
        double a1=area;
        double a2=b.area;
        String c1=color;
        String c2=b.color;
        if(a1==a2 && c1==c2)
           {
              System.out.println("Matching rectangles");
           }
        else
           {
              System.out.println("Non matching rectangles");
           }
       }
      
   
      public static void main(String[] args)
          {
            Rectangle r1=new Rectangle(22.6,34.6,"red");
            Rectangle r2=new Rectangle(33.7,29.6,"red");
            r1.Area();
            r2.Area();
            r1.compare(r2);
          }
    }