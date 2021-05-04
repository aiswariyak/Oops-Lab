class Product 
   {
    int pcode;
    String pname;
    int price;
    Product(int c,String name,int p)
         {
           pcode=c;
           pname=name;
           price=p;
         }
   void disp()
         {
           System.out.println("product code:"+ pcode);
           System.out.println("product name:"+ pname);
           System.out.println("product price:"+ price);
         }
    public static void main(String[] args)
        {
          int min=0;
          Product p1=new Product(2342,"milky bar",120);
          Product p2=new Product(1221,"dairy milk",140);
          Product p3=new Product(4531,"kitkat",130);
          if(p1.price<p2.price)
            {
               if(p1.price<p3.price)
                  {
                    min=p1.price;
                  }
               else
                  {
                    min=p3.price;
                  }    
            }
          else if(p2.price<p3.price)
            {
             min=p2.price;  
            }   
         System.out.println("product having lowest price is:");
         if(p1.price==min)
            p1.disp();
         else if(p2.price==min)
            p2.disp();
         if(p3.price==min)
            p3.disp();
        }
    

   }