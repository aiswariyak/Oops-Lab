import java.io.*;
public class prgrm_22{
	public static void main(String[] args){
		try{
			FileReader fr=new FileReader("prgrm_22.txt");
			BufferedReader br=new BufferedReader(fr);
 			String s=" ";
			File f1=new File("even.txt");
                        if(f1.createNewFile())
				System.out.println("file created " +f1.getName());
			else
				System.out.println("file already exists");
			File f2=new File("odd.txt");
                        if(f2.createNewFile())
				System.out.println("file created " +f2.getName());
			else
				System.out.println("file already exists");
			FileWriter fw1=new FileWriter("even.txt");
			BufferedWriter bw1=new BufferedWriter(fw1);
			FileWriter fw2=new FileWriter("odd.txt");
			BufferedWriter bw2=new BufferedWriter(fw2);
	
			while((s=br.readLine())!= null){
				int a=Integer.parseInt(s);
				if(a%2==0){
					bw1.write(Integer.toString(a));
					bw1.newLine();		
				}
				else{
					bw2.write(Integer.toString(a));
					bw2.newLine();
				}				
			}
			bw1.flush();
			bw2.flush();			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}