import java.io.*;
public class prgrm_21{
	public static void main(String[] args){
		try{
			FileReader fr=new FileReader("prgrm_21.txt");
			BufferedReader br=new BufferedReader(fr);
 			String s=" ";
			File f1=new File("copied.txt");
                        if(f1.createNewFile())
				System.out.println("file created " +f1.getName());
			else
				System.out.println("file already exists");
			FileWriter fw=new FileWriter("copied.txt");
			BufferedWriter bw=new BufferedWriter(fw);	
			while((s=br.readLine())!= null){
				//int a=Integer.parseInt(s);
				bw.write(s);
				bw.newLine();				
			}
			bw.flush();
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}