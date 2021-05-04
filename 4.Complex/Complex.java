public class Complex
  {
    int a;
    int b;
    Complex(int c,int d)
      {
        a=c;
        b=d;
      }
    void display(int a, int b)
      {
        System.out.println(a +" +"+b+"i");
        
      }
     void sum(Complex c1,Complex c2)
       {
         int real,img;
         real=c1.a+c2.a;
         img=c1.b+c2.b;
         System.out.println("SUM IS:");
         display(real,img); 
       }
    public static void main(String[] args)
       { 
         Complex c1=new Complex(4,6);
         Complex c2=new Complex(3,1);
         c1.sum(c1,c2);
       } 
 }