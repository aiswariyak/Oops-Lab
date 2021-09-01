import java.util.*;
class thread1 extends Thread{
   public void run(){
      for(int i=1;i<=10;i++){
          System.out.println("5 * "+i+" = "+(5*i));
      }
   }
}
class thread2 extends Thread{
    public void run(){
       int count=0;
       int flag=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the count of prime numbers");
       int n=sc.nextInt();
       for(int i=2;count<n;i++)
       {
           flag=0;
           for(int j=2;j<=i/2;j++){
                 if(i%j==0)
                  {
                     flag=1;
                     break;
                  }
           }
           if(flag==0){
               System.out.println(i);
               count++;  
           }
       }
    }
}
public class prgrm_16{
    public static void main(String args[]){
              thread1 t1=new thread1();
              t1.start();
              thread2 t2=new thread2();
              t2.start();
    }
}