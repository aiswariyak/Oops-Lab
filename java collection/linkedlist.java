import java.util.*;
public class linkedlist{
   public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          LinkedList<Integer> l=new LinkedList<Integer>(); 
          int c,new_;
          System.out.println("1.ADD ITEM\n2.ADD AT FIRST\n3.ADD AT LAST\n4.APPEND A COLLECTION\n5.GET THE LAST ITEM\n6.GET THE FIRST ITEM\n7.REMOVE AN ELEMENT IN A SPECIFIED INDEX\n8.CHANGE AN EXISTING ELEMENT TO NEW ELEMENT\n9.EXIT POINT");
          do{
              System.out.println("enter your choice");
              c=Integer.parseInt(sc.nextLine());
              switch(c){
                 case 1:
                   System.out.println("enter the element to insert");
                   int a=Integer.parseInt(sc.nextLine());
                   l.add(a);
                   System.out.println("list after insertion:");
                   System.out.println(l);
                   break;
                 case 2:
                   System.out.println("enter the element to insert");
                   int b=Integer.parseInt(sc.nextLine());
                   l.addFirst(b);
                   System.out.println("list after insertion:");
                   System.out.println(l);
                   break;
                case 3:
                    System.out.println("enter the element to insert");
                   int d=Integer.parseInt(sc.nextLine());
                   l.addLast(d);
                   System.out.println("list after insertion:");
                   System.out.println(l);
                   break;
                case 4:
                   LinkedList<Integer> l1=new LinkedList<Integer>();
                   l1.addAll(l);
                   System.out.println("new list");
                   System.out.println(l1);
                   break;
                case 7:
                   System.out.println("enter the index");
                   int i=Integer.parseInt(sc.nextLine());
                   l.remove(i);
                   System.out.println("list after deletion:");
                   System.out.println(l);
                   break;
              case 8:
                   System.out.println("enter the new element");
                   new_=Integer.parseInt(sc.nextLine());
                   System.out.println("enter the index");
                   int key=Integer.parseInt(sc.nextLine());
                   l.set(key,new_);
                   System.out.println("list after modification:");
                   System.out.println(l);
                   break;
                case 6:
                   
                   System.out.println("first item is "+l.getFirst());
                   break;
                case 5:
                   System.out.println("last item is "+l.getLast());
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