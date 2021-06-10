import java.util.*;
interface temp 
{
   void area();
   void perimeter();
}
class circle implements temp{
   float r;
   circle(float rad){
          r=rad;  
   }
   public void area(){  
          System.out.println("Area of circle with radius"+r+" :   " +3.14*r*r);
   }  
   public void perimeter(){
          System.out.println("Perimeter of circle with radius"+r+" :   " +2*3.14*r);
   }
    
}
class rectangle implements temp{ 
  int l;
  int w;
  rectangle(int len,int wid){
           l=len;
           w=wid;
  }
  public void area(){
           System.out.println("Area of rectangle having length "+l+"  and width "+w+" :   " +(l*w));
  }
  public void perimeter(){
           System.out.println("Area of rectangle having length "+l+"  and width "+w+" :   " +(2*(l+w)));
  }
}
public class main_area_and_perimeter{
          public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               int ch,n,n1;
               do
               {
               System.out.println("enter your choice:\n1.rectangle\n2.circle\n3.exit");
               ch=sc.nextInt();
               switch(ch){
                     case 1:
                          
                          System.out.println("enter the length");
                          int l=sc.nextInt();
                          sc.nextLine();
                          System.out.println("enter the width");
                          int w=sc.nextInt();
                          sc.nextLine();
                          rectangle r1=new rectangle(l,w);
                          do{
                          System.out.println("area/perimeter?\n1.area\n2.perimeter\n3.exit");
                          n=sc.nextInt();
                          switch(n){
                                 case 1:
                                    r1.area();
                                    break;
                                 case 2:
                                    r1.perimeter();
                                    break;
                                 case 3:
                                    System.out.println("exit from rectangle:");
                                    break;
                                  default:
                                    System.out.println("enter a valied choice");
                          }
                          }while(n!=3);
                          break;
     
                    case 2:
                          System.out.println("enter the radius:");
                          float r=sc.nextFloat();
                          circle c=new circle(r);
                          do{        
                          System.out.println("area/perimeter?\n1.area\n2.perimeter\n3.exit");
                          n1=sc.nextInt();
                          switch(n1){
                                 case 1:
                                    c.area();
                                    break;
                                 case 2:
                                    c.perimeter();
                                    break;
                                 case 3:
                                    System.out.println("exit from circle:");
                                    break;
                                  default:
                                    System.out.println("enter a valied choice");
                          }
                          }while(n1!=3);
                          break;
                    case 3:
                           System.out.println("exit point:");
                           break;
                    default:
                    System.out.println("enter a valied choice");

                   
               }
            }while(ch!=3); 
          }
}