import java.util.*;
class thread1 implements Runnable
{
  int n;
  thread1(int m){
     n=m;
  }
  public void run()
  {
     System.out.println("************fibonacci Series************");
     int i=0,a=1,b=0,c=0;
     while(i<n)
     {
      System.out.println(c);
      c=a+b;
      a=b;
      b=c;
      i++;
        
     }
  }
}
class thread2 implements Runnable 
{
    int n;
  thread2(int m){
     n=m;
  }
 public void run()
{
   
   int count=1;
   System.out.println("************Even Numbers************");
   for(int i=2;count<=n;i++)
   {
      if(i%2==0)
      {
        System.out.println(i);
        count++;
      }
   }
}
}
public class prgrm_17
{
    public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the no of terms you want ");
           int n=sc.nextInt();
          thread1 t1=new thread1(n);
          Thread T1=new Thread(t1);
          T1.start(); 
          thread2 t2=new thread2(n);
          Thread T2=new Thread(t2);
          T2.start(); 
    }
}