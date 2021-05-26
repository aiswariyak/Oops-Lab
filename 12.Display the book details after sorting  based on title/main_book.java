import java.util.*;
class book{ 
    String isbn;
    String title;
    String author;
    int price;
    String publisher;
    book(String i,String t,String a,int p,String pu){
         isbn=i;
         title=t;
         author=a;
         price=p;
         publisher=pu;
    }
    void disp(){
         System.out.println("ISBN:    "+isbn);
         System.out.println("TITLE:    "+title);
         System.out.println("AUTHOR:    "+author);
         System.out.println("PRICE:    "+price);
         System.out.println("PUBLISHER:    "+publisher);
    }
    
}
public class main_book{
      public static void main(String[] args){
             int i;
             String temp[]=new String[5];
             Scanner sc=new Scanner(System.in);
             book b[]=new book[5];
             for(i=0;i<5;i++){
                 System.out.println("enter details of "+(i+1)+" book");
                 System.out.println("ISBN: ");
                 String is=sc.nextLine();
                 System.out.println("TITLE: ");
                 String t=sc.nextLine();
                 System.out.println("AUTHOR: ");
                 String a=sc.nextLine();
                 System.out.println("PRICE: ");
                 int p=sc.nextInt(); 
                 sc.nextLine();
                 System.out.println("PUBLISHER: ");
                 String pu=sc.nextLine();
                 b[i]=new book(is,t,a,p,pu);
            }
            for(i=0;i<5;i++){
              temp[i]=b[i].title;
            }
            System.out.println("********************************Book details after sorting based on title************************** ");
            System.out.println();
            Arrays.sort(temp);
            for(i=0;i<5;i++){
                for(int j=0;j<5;j++){
                  if(temp[i]==b[j].title){
                      System.out.println("!!!!!!!!!!!!!!!!!DETAILS OF BOOK"+ (i+1));
                      b[j].disp();
                  }
                }
            } 
      }

}