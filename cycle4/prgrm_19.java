import java.util.*;
public class prgrm_19{
   public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int i=0;
          LinkedList<Integer> l=new LinkedList<Integer>(); 
          System.out.println("enter the total no of elements in linkedlist");
          int n=Integer.parseInt(sc.nextLine());
          while(i<n){
           System.out.println("enter the element to insert");
           int a=Integer.parseInt(sc.nextLine());
           l.add(a);
           i++;      
          }
          System.out.println("list before deletion");
          System.out.println(l);
          int j=0;
          while(j<n){
              l.remove(0);
               j++;
          }
          System.out.println("list after deletion:");
          System.out.println(l);
}
}