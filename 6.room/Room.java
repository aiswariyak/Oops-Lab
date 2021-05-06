public class Room
   {
     int roomno;
     String roomtype;
     String roomarea;
     Room()
       {
        roomno=36;
        roomtype="single";
        roomarea="square";
       }
    Room(int n,String t,String a)
       {
         roomno=n;
         roomtype=t;
         roomarea=a;
       }
    void disp()
       { 
         System.out.println("ROOM NO:     "+roomno);
         System.out.println("ROOM TYPE:     "+roomtype);
         System.out.println("ROOM AREA:     "+roomarea);
       }
      
   
      public static void main(String[] args)
          {
            Room r1=new Room();
            Room r2=new Room(45,"double","rectangle");
            r1.disp();
            r2.disp();
          }
    }