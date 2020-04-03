import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
// This code is originally written by MOHD UMAR(Master-Tech271, umar17605);
public class ProgressBarOnClickButton extends JFrame{
	static JProgressBar jb;
	static JButton btn;
	static int i=0,num=0;
	static Container con;
	JPanel header;
	JPanel content;
	JPanel content1;
	JPanel footer;
	JLabel elapsed;
	JLabel remaining;
	JLabel elapsedtime;
	JLabel remainingtime;
	JLabel temp;
	public ProgressBarOnClickButton() {  
		this.setResizable(false);
		this.setSize(500, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		con = this.getContentPane();
		con.setLayout(new BorderLayout());
		jb=new JProgressBar(0,100);    
		jb.setSize(160,30);         
		jb.setValue(0);    
		jb.setStringPainted(true);    
		header = new JPanel();
		con.add(header, BorderLayout.PAGE_START);
		header.add(jb);
		content = new JPanel();
		con.add(content, BorderLayout.CENTER);
		content.setLayout(new BorderLayout());
		content1 = new JPanel();
		content.add(content1, BorderLayout.PAGE_START);
		btn = new JButton("Start");
		btn.setSize(100, 50);
		content1.add(btn);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btn) {
					while(i<=2000){       
						 try {
							  Thread.sleep(150);
		                        jb.paintImmediately(0, 0, 200, 200);
		                        jb.setValue(i);
		                        i++;
						  }	  catch(Exception ee){ 
						  }
	 }
  }
}
		});
	//footer
		footer = new JPanel();
		content.add(footer, BorderLayout.CENTER);
		footer.setLayout(new GridLayout(2, 2, 0, 0));
		elapsed = new JLabel("Elapsed Time : ");
		elapsedtime = new JLabel("");
		remainingtime = new JLabel("");
		remaining = new JLabel("Remaining Time : ");

		footer.add(elapsed);
		footer.add(elapsedtime);
		footer.add(remaining);
		footer.add(remainingtime);
		
}    
	public static void iterate(){    
		
		}  
		public static void main(String[] args) {    
			ProgressBarOnClickButton m=new ProgressBarOnClickButton();   
			m.setLocationRelativeTo(null);  
		    m.setVisible(true);  
		}
	}

