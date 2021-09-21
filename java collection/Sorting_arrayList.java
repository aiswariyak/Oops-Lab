import java.util.*;
public class Sorting_arrayList
{
    public static void main(String args[])
    {
        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(10);
        a1.add(12);
        a1.add(200);
        a1.add(39);
        Collections.sort(a1);
        System.out.println("ASCENDING ORDER : "+a1);
        Collections.reverse(a1);
        System.out.println("DESCENDING ORDER : "+a1);
        Comparator<Integer> com=new Comp();
        Collections.sort(a1,com);
        System.out.println("BASED ON LAST DIGIT :"+a1);    
    }
}
