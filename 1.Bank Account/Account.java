class Account
{
int acc_no;
String name;
String acc_type;
int balance;
  Account(int no,String nam,String type,int bal)
       {
          acc_no=no;
          name=nam;
          acc_type=type;
          balance=bal;
       } 
 void credit(int amount)
       { 
          balance+=amount;
       }
 void debit(int amnt)
       {
          if(balance-amnt<=1000)
             {
                System.out.println("not enough balance available");
             }
          else
            {
               balance-=amnt;
            } 
       }
 void balance_check()
       {
          System.out.println("the available balance is:"+balance);
       }
 public static void main(String[] args)
       {
          Account obj1=new Account(674,"aiswarya","savings",20000);
          Account obj2=new Account(456,"aadhav","savings",2000);
          obj1.credit(10000);
          obj2.debit(1000);
          obj1.balance_check();
          obj2.balance_check();
       }
}