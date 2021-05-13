     class cpu{
    cpu(int price){
        System.out.println("price of CPU:"+price);
    }
    class processor{
        int n;
        String manufacturer;
        processor(int N,String m){
            n=N;
            manufacturer=m;
        }
        void disp()
        {
            System.out.println("PROCESSOR:");
            System.out.println("no of cores:  "+n);
            System.out.println("Manufacturer:  "+manufacturer);
        }

    }
    static class RAM{
        String memory;
        String manufacturer_r;
        RAM(String mem,String man){
            memory=mem;
            manufacturer_r=man;
        }
        void display()
        {
            System.out.println("RAM:");
            System.out.println("Memory:  "+memory);
            System.out.println("Manufacturer:  "+manufacturer_r);
        }

    }
}
public class main__cpu {
    public static void main(String[] args){
        cpu c=new cpu(35699);
        cpu.processor p=c.new processor(4,"Intel");
        cpu.RAM r=new cpu.RAM("8gb","Corsair");
        p.disp();
        r.display();
    }

}
