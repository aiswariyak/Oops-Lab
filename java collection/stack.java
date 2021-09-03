import java.util.*;
public class stack{
   public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
         Stack<Integer> s=new Stack<Integer>(); 
          int c;
          System.out.println("1.PUSH\n2.POP\n3.PEEK\n4.STACK SIZE\n5.SEARCH\n6.STACK EMPTY OR NOT\n7.REMOVE AN ELEMENT IN A SPECIFIED INDEX\n8.PRINT THE STACK ELEMENTS\n9.EXIT POINT");
          do{
              System.out.println("enter your choice");
              c=Integer.parseInt(sc.nextLine());
              switch(c){
                 case 1:
                   System.out.println("enter the element to insert");
                   int a=Integer.parseInt(sc.nextLine());
                   s.push(a);
                   System.out.println("stack after insertion:");
                   System.out.println(s);
                   break;
                 case 2:
                   System.out.println("popped item is : "+s.pop());
                   break;
                case 3:
                   System.out.println("top item of the stack is : "+s.peek());
                   break; 
                case 5:
                   System.out.println("enter the element to search");
                   int item=Integer.parseInt(sc.nextLine());
                   int result=s.search(item);
                   if(result!=-1)
                      System.out.println("element  is found ");
                   else
                      System.out.println("element is not found");
                   break;
                case 7:
                   System.out.println("enter the index");
                   int i=Integer.parseInt(sc.nextLine());
                   s.remove(i);
                   System.out.println("stack after deletion:");
                   System.out.println(s);
                   break;
              case 8:
                   System.out.println("stack elements:");
                   for(Integer j :s)
                     System.out.println(j);
                   break;
                case 6:
                   if(s.empty())
                   System.out.println("stack is empty");
                   else
                      System.out.println("stack is not  empty");
                   break;
                case 4:
                   System.out.println("size of stack :  "+s.size());
                   break;      
               
                case 9:
                     System.out.println("exit point");
                     break;
                default:
                     System.out.println("enter a valied choice");
              }
            }while(c!=9);
   }
}