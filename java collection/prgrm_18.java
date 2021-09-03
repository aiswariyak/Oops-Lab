import java.util.*;
public class prgrm_18{
   public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("*********************LIST OF STRINGS***************");
          ArrayList<String> a1=new ArrayList<String>(); 
          int c;
          System.out.println("1.ADD ITEM\n2.ADD ELEMENT AT A SPECIFIED INDEX\n3.GET AN ELEMENT AT A SPECIFIED INDEX\n4.REMOVE AN ELEMENT IN A SPECIFIED INDEX\n5.CHANGE AN EXISTING ELEMENT TO NEW ELEMENT\n6.SIZE OF THE LIST\n7.PRINT THE LIST OF STRINGS\n8.SORT THE LIST\n9.EXIT POINT");
          do{
              System.out.println("enter your choice");
              c=Integer.parseInt(sc.nextLine());
              switch(c){
                 case 1:
                   System.out.println("enter the element to insert");
                   String s=sc.nextLine();
                   a1.add(s);
                   System.out.println("list after insertion:");
                   System.out.println(a1);
                   break;
                 case 2:
                   System.out.println("enter the element to insert");
                   String str=sc.nextLine();
                   System.out.println("enter the index");
                   int in=Integer.parseInt(sc.nextLine());
                   a1.add(in,str);
                   System.out.println("list after insertion:");
                   System.out.println(a1);
                   break;
                case 3:
                   System.out.println("enter the index");
                   int ind=sc.nextInt();
                    System.out.println(a1.get(ind));
                   break;
                case 4:
                   System.out.println("enter the index");
                   int i=sc.nextInt();
                   a1.remove(i);
                   System.out.println("list after deletion:");
                   System.out.println(a1);
                   break;
                case 5:
                   System.out.println("enter the new element");
                   String st=sc.nextLine();
                   System.out.println("enter the index");
                   int key=sc.nextInt();
                   a1.set(key,st);
                   System.out.println("list after modification:");
                   System.out.println(a1);
                   break;
                case 6:
                   System.out.println("size of the list");
                   System.out.println(a1.size());
                   break;
                case 7:
                   System.out.println("**********************list of strings*************************");
                   for(String j:a1)
                      System.out.println(j);
                   break;      
                case 8:
                   System.out.println("list of string after sorting");
                   Collections.sort(a1);
                   System.out.println(a1);
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