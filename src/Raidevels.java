import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;


public class Raidevels extends JApplet implements ActionListener{

		
	private static final long serialVersionUID = 1L;
		JLabel l0=new JLabel("Raid Level Implementaion",JLabel.CENTER);
		JLabel l1=new JLabel("Raid 0",JLabel.CENTER);
		JLabel l2=new JLabel("Raid 1",JLabel.CENTER);
		JLabel l3=new JLabel("Raid 2",JLabel.CENTER);
		JLabel l4=new JLabel("Raid 3",JLabel.CENTER);
		JLabel l5=new JLabel("Raid 4",JLabel.CENTER);
		JLabel l6=new JLabel("Raid 5",JLabel.CENTER);
		JLabel l7=new JLabel("Raid 6",JLabel.CENTER);
		JLabel l8=new JLabel();
		
		JPanel panel=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		JPanel panel5=new JPanel();
		public void init()
	    {
	        
			this.setSize(new Dimension(800,600));
			makeGUI();
	    }
		
		public void makeGUI()
		{


	        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
	        panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));
	        panel2.setPreferredSize(new Dimension(600,600));
	        Font myFont1 = new Font("TimesRoman", Font.BOLD, 20);
	        Font myFont2 = new Font("TimesRoman", Font.BOLD, 20);
	        Font myFont3 = new Font("TimesRoman", Font.BOLD, 20);
	        Font myFont4 = new Font("TimesRoman", Font.BOLD, 20);
	      
	        
	        
	        l1.setFont(myFont1);
	        l2.setFont(myFont2);
	        l3.setFont(myFont1);
	        l4.setFont(myFont2);
	        l5.setFont(myFont3);
	        l6.setFont(myFont4);
	        l7.setFont(myFont4);
	        
	        
	        panel.add(l1);
	        ImageIcon ic = new ImageIcon("2.png");
	        JButton jb = new JButton(ic);
	        jb.setActionCommand("Raid0");
	        jb.addActionListener(this);
	        jb.setSize(50,50);
	        panel.add(jb);
	        
	        panel.add(l2);
	        ImageIcon ic2 = new ImageIcon("3.png");
	        JButton jb2 = new JButton(ic2);
	        jb2.setActionCommand("Raid1");
	        jb2.addActionListener(this);
	        jb2.setSize(50,50);
	        panel.add(jb2);
	        
	        
	        panel.add(l4);
	        ImageIcon ic4 = new ImageIcon("5.png");
	        JButton jb4 = new JButton(ic4);
	        jb4.setActionCommand("Raid3");
	        jb4.addActionListener(this);
	        jb4.setSize(50,50);
	        panel.add(jb4);
	        
	        
	        panel3.add(l5);
	        ImageIcon ic5 = new ImageIcon("6.png");
	        JButton jb5 = new JButton(ic5);
	        jb5.setActionCommand("Raid4");
	        jb5.addActionListener(this);
	        jb5.setSize(50,50);
	        panel3.add(jb5);
	        
	        panel3.add(l6);
	        ImageIcon ic6 = new ImageIcon("7.png");
	        JButton jb6 = new JButton(ic6);
	        jb6.setActionCommand("Raid5");
	        jb6.addActionListener(this);
	        jb6.setSize(50,50);
	        panel3.add(jb6);
	        
	        panel3.add(l7);
	        ImageIcon ic7 = new ImageIcon("8.png");
	        JButton jb7 = new JButton(ic7);
	        jb7.setActionCommand("Raid6");
	        jb7.addActionListener(this);
	        jb7.setSize(50,50);
	        panel3.add(jb7);
	        
	        Font myFont = new Font("TimesRoman", Font.BOLD, 50);
	        panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
	        l0.setBackground(Color.white);
	        l0.setFont(myFont);
	        panel4.setAlignmentX(CENTER_ALIGNMENT);
	        panel4.setLayout(new FlowLayout());
	        panel2.add(l0);
	        panel5.add(l8);
	        l8.setText("");
	        panel4.add(panel);
	        panel4.add(Box.createRigidArea(new Dimension(40,0)));
	        panel4.add(panel3);
	        panel2.add(panel4);
	        panel2.add(panel5);
	        add(panel2);
		}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
				
		String str=ae.getActionCommand();
		
		if("Raid0".equals(str))
		{
			String ip=JOptionPane.showInputDialog(null,"RAID 0 (also known as a stripe set or striped volume) splits (stripes)"+System.lineSeparator()+" data evenly across two or more disks, without parity information, redundancy, or fault tolerance."+System.lineSeparator()+System.lineSeparator()+"Enter a Line of Text with '_' as space ");
			try{
				int count=1;
				new File("D:/AndroidWorkspace/Raid/bin/"+str).mkdir();
				FileWriter fr1=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk1.txt");
				FileWriter fr2=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk2.txt");
				;
				for(String ip1:ip.split(" "))
				{
					if(count%2==1)
					{
						fr1.write(ip1+System.lineSeparator());
					}
					else
					{
						fr2.write(ip1+System.lineSeparator());
					}
					count++;
				}
				fr1.close();
				fr2.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if("Raid1".equals(str))
		{
			int n;
			try{
			String in=JOptionPane.showInputDialog(null,"RAID 1 consists of an exact copy (or mirror)"+System.lineSeparator()+" of a set of data on two or more disks; a classic RAID 1"+System.lineSeparator()+" mirrored pair contains two disks."+System.lineSeparator()+System.lineSeparator()+"Enter Number of Data");
			new File("D:/AndroidWorkspace/Raid/bin/"+str).mkdir();
			FileWriter frr1=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk1.txt");
			FileWriter frr2=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Mirror.txt");
			n=Integer.parseInt(in);
			for(int i=0;i<n;i++)
			{
				
				String a=JOptionPane.showInputDialog(null,"Enter "+i+" Data");
				frr1.write(a+System.lineSeparator());
				frr2.write(a+System.lineSeparator());
			}
			frr1.close();
			frr2.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if("Raid3".equals(str))
		{
			int n,c=0;
			try{
			new File("D:/AndroidWorkspace/Raid/bin/"+str).mkdir();
			FileWriter fr11=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk1.txt");
			FileWriter fr12=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk2.txt");
			FileWriter fr13=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk3.txt");
			FileWriter fr14=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Parity.txt");
			String ne="";
			String na=JOptionPane.showInputDialog(null,"RAID 3, which is rarely used in practice, consists of byte-level striping with a dedicated parity disk."+System.lineSeparator()+System.lineSeparator()+"Enter No of Stripes of Data");
			n=Integer.parseInt(na);
			for(int i=0;i<n;i++)
			{
			String aa=JOptionPane.showInputDialog(null,"Enter Text to Be Stripped ");
			
				for(String inn:aa.split(" "))
				{
					if(c%3==0)
					{
						fr11.write(inn+System.lineSeparator());
						fr14.write(ne+System.lineSeparator());
						ne="";
					}
					else if(c%3==1)
					{
						fr12.write(inn+System.lineSeparator());
					}
					else if(c%3==2)
					{
						fr13.write(inn+System.lineSeparator());
					}
					c++;
					ne=ne+inn;
				}
			}
			fr14.write(ne+System.lineSeparator());
			fr11.close();
			fr12.close();
			fr13.close();
			fr14.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		else if("Raid4".equals(str))
		{
			int n,c=0;
			try{
			new File("D:/AndroidWorkspace/Raid/bin/"+str).mkdir();
			FileWriter fr111=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk1.txt");
			FileWriter fr122=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk2.txt");
			FileWriter fr133=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk3.txt");
			FileWriter fr144=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Parity.txt");
			String ne="";
			String na=JOptionPane.showInputDialog(null,"RAID 4 consists of block-level striping with a dedicated parity disk."+System.lineSeparator()+" As a result of its layout, RAID 4 provides good performance of"+System.lineSeparator()+" random reads, while the performance of random writes is low"+System.lineSeparator()+" due to the need to write all parity data to a single disk"+System.lineSeparator()+System.lineSeparator()+".Enter No of Stripes of Data");
			n=Integer.parseInt(na);
			for(int i=0;i<n;i++)
			{
			String aa=JOptionPane.showInputDialog(null,"Enter Text to Be Stripped ");
			
				for(String inn:aa.split(" "))
				{
					if(c%3==0)
					{
						fr111.write(inn+System.lineSeparator());
					}
					else if(c%3==1)
					{
						fr122.write(inn+System.lineSeparator());
					}
					else if(c%3==2)
					{
						fr133.write(inn+System.lineSeparator());
					}
					c++;
				}
				fr144.write(aa+System.lineSeparator());
			}
			fr111.close();
			fr122.close();
			fr133.close();
			fr144.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if("Raid5".equals(str))
		{
			int n,c=0;
			try{
			new File("D:/AndroidWorkspace/Raid/bin/"+str).mkdir();
			FileWriter frr11=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk1.txt");
			FileWriter frr12=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk2.txt");
			FileWriter frr13=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk3.txt");
			FileWriter frr14=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk4.txt");
			String ne="";
			String na=JOptionPane.showInputDialog(null,"RAID 5 consists of block-level striping with distributed parity."+System.lineSeparator()+" Unlike in RAID 4, parity information is distributed among the drives."+System.lineSeparator()+" It requires that all drives but one be present to operate."+System.lineSeparator()+" Upon failure of a single drive, subsequent reads can be calculated from "+System.lineSeparator()+"the distributed parity such that no data is lost."+System.lineSeparator()+System.lineSeparator()+"Enter No of Stripes of Data");
			n=Integer.parseInt(na);
			int b=4;
			int c1=0;
			for(int i=0;i<n;i++)
			{
			String aa=JOptionPane.showInputDialog(null,"Enter Text to Be Stripped ");
					if(c==4)
					{
						c=0;
					}
					if(c==0)	
					{
						for(String inn:aa.split(" "))
						{
							if(c1%3==0)
							{
								frr11.write(inn+System.lineSeparator());
							}
							else if(c1%3==1)
							{
								frr12.write(inn+System.lineSeparator());
							}
							else if(c1%3==2)
							{
								frr13.write(inn+System.lineSeparator());
							}
							
							c1++;
						}
						frr14.write(aa+System.lineSeparator());
					}
					else if(c==1)
					{
						for(String inn:aa.split(" "))
						{
							if(c1%3==0)
							{
								frr11.write(inn+System.lineSeparator());
							}
							else if(c1%3==1)
							{
								frr12.write(inn+System.lineSeparator());
							}
							else if(c1%3==2)
							{
								frr13.write(aa+System.lineSeparator());
								frr14.write(inn+System.lineSeparator());
							}
							c1++;
						}
						
					}
					else if(c==2)
					{
						for(String inn:aa.split(" "))
						{
							if(c1%3==0)
							{
								frr11.write(inn+System.lineSeparator());
							}
							else if(c1%3==1)
							{
								frr12.write(aa+System.lineSeparator());
								frr13.write(inn+System.lineSeparator());
							}
							else if(c1%3==2)
							{
								
								frr14.write(inn+System.lineSeparator());
							}
							c1++;
						}
						
					}
					else if(c==3)
					{
						for(String inn:aa.split(" "))
						{
							if(c1%3==0)
							{
								frr11.write(aa+System.lineSeparator());
								frr12.write(inn+System.lineSeparator());
							}
							else if(c1%3==1)
							{
								
								frr13.write(inn+System.lineSeparator());
							}
							else if(c1%3==2)
							{
								
								frr14.write(inn+System.lineSeparator());
							}
							c1++;
						}
					}
				c++;
			}
			frr11.close();
			frr12.close();
			frr13.close();
			frr14.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if("Raid6".equals(str))
		{
			int n,c=0;
			try{
			new File("D:/AndroidWorkspace/Raid/bin/"+str).mkdir();
			FileWriter frre11=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk1.txt");
			FileWriter frre12=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk2.txt");
			FileWriter frre13=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk3.txt");
			FileWriter frre14=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk4.txt");
			FileWriter frre15=new FileWriter("D:/AndroidWorkspace/Raid/bin/"+str+"/Disk5.txt");
			String ne="";
			String na=JOptionPane.showInputDialog(null,"RAID 6 extends RAID 5 by adding another parity block; thus,"+System.lineSeparator()+" it uses block-level striping with two parity blocks"+System.lineSeparator()+" distributed across all member disks."+System.lineSeparator()+System.lineSeparator()+"Enter No of Stripes of Data");
			n=Integer.parseInt(na);
			int b=4;
			int c1=0;
			for(int i=0;i<n;i++)
			{
			String aa=JOptionPane.showInputDialog(null,"Enter Text to Be Stripped ");
					if(c==4)
					{
						c=0;
					}
					if(c==0)	
					{
						for(String inn:aa.split(" "))
						{
							if(c1%3==0)
							{
								frre11.write(inn+System.lineSeparator());
							}
							else if(c1%3==1)
							{
								frre12.write(inn+System.lineSeparator());
							}
							else if(c1%3==2)
							{
								frre13.write(inn+System.lineSeparator());
							}
							
							c1++;
						}
						frre14.write(aa+System.lineSeparator());
						frre15.write(aa+System.lineSeparator());
					}
					else if(c==1)
					{
						for(String inn:aa.split(" "))
						{
							if(c1%3==0)
							{
								frre11.write(inn+System.lineSeparator());
							}
							else if(c1%3==1)
							{
								frre12.write(inn+System.lineSeparator());
							}
							else if(c1%3==2)
							{
								frre13.write(aa+System.lineSeparator());
								frre14.write(aa+System.lineSeparator());
								frre15.write(inn+System.lineSeparator());
								
							}
							c1++;
						}
						
					}
					else if(c==2)
					{
						for(String inn:aa.split(" "))
						{
							if(c1%3==0)
							{
								frre11.write(inn+System.lineSeparator());
							}
							else if(c1%3==1)
							{
								frre12.write(aa+System.lineSeparator());
								frre13.write(aa+System.lineSeparator());
								frre14.write(inn+System.lineSeparator());
							}
							else if(c1%3==2)
							{
								
								frre15.write(inn+System.lineSeparator());
							}
							c1++;
						}
						
					}
					else if(c==3)
					{
						for(String inn:aa.split(" "))
						{
							if(c1%3==0)
							{
								frre11.write(aa+System.lineSeparator());
								frre12.write(aa+System.lineSeparator());
								frre13.write(inn+System.lineSeparator());
							}
							else if(c1%3==1)
							{
								
								frre14.write(inn+System.lineSeparator());
							}
							else if(c1%3==2)
							{
								
								frre15.write(inn+System.lineSeparator());
							}
							c1++;
						}
					}
				c++;
			}
			frre11.close();
			frre12.close();
			frre13.close();
			frre14.close();
			frre15.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "RAID Level Not Found");
		}
	}
}
