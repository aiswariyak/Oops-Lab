import java.awt.*;
import java.awt.event.*;
class prgrm_20 implements ActionListener
{
	TextField t1,t2,t3,t4;
	Label l1,l2,l3,l4;
	Frame f;
        prgrm_20()
	{
		f=new Frame();
		f.setSize(600,600);
		f.setLayout(null);
		f.setTitle("program to find largest of 3 numbers");
		f.setVisible(true);
		l1=new Label("Enter the first number :");
		t1=new TextField("");
		l2=new Label("Enter the second number :");
		t2=new TextField("");
		l3=new Label("Enter the third number :");
                t3=new TextField("");
		l4=new Label("Result");
		t4=new TextField("");
		Button b=new Button("submit");
		l1.setBounds(50,50,80,30);
		t1.setBounds(200,50,80,30);
		l2.setBounds(50,200,80,30);
		t2.setBounds(200,200,80,30);
		l3.setBounds(50,300,80,30);
		t3.setBounds(200,300,80,30);
		l4.setBounds(50,400,80,30);
		t4.setBounds(200,400,80,30);
		t4.setEnabled(false);
		b.setBounds(350,500,80,30);
		b.addActionListener(this);
		f.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent we){
 	System.exit(0);
	}
	});
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(b);
	}
	  public void actionPerformed(ActionEvent e)
	  {
	  	String s1=t1.getText();
	  	String s2=t2.getText();
	  	String s3=t3.getText();
		int a1,a2,a3,c;
		a1=Integer.parseInt(s1);
		a2=Integer.parseInt(s2);
	 	a3=Integer.parseInt(s3);
		if(a1>a2 && a1>a3)
			c=a1;
 		else if(a2>a1 && a2>a3)
			c=a2;
		else
			c=a3;
		t4.setText(Integer.toString(c));
	}
	 public static void main(String[] args)
	  {
	       prgrm_20 n=new prgrm_20();
	  }
}