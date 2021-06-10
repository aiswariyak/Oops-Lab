interface sports{
       public double s_score=20.5;
       void disp();
}
interface student {
       double a_score=85.8;
       void disp();
              
}
class result  implements sports,student{
        public void disp(){
             System.out.println("******************TOTAL MARKS**********************");
             System.out.println("ACADEMIC SCORE:     "+a_score);
             System.out.println("SPORTS SCORE:     "+s_score);   
     }
}
public class main_multiple_inheritance{
       public static void main(String[] args){
             result r=new result();
             r.disp();   
       }

}
