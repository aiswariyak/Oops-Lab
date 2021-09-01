import java.util.*;
public class prgrm_15{
public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the total positive numbers needed");
       int n=sc.nextInt();
       float x=n;
       int sum=0;
       int temp;
       float avg;
       System.out.println("enter the numbers");
       for(int i=0;i<n;i++)
       {
            temp=sc.nextInt();
            try           
            {
               if(temp<0){
                  n++;
                  throw new myEx("negative number is not allowed");
                  }
               else
                  sum+=temp;
            }
            catch(myEx e){
                 System.out.println(e);
            }
       }
       avg=sum/x;
       System.out.println("average of " +x+ " numbers:");  
       System.out.println(avg);     
}
}
class myEx extends Exception
{
  myEx(String S){
    super(S);
  }
}