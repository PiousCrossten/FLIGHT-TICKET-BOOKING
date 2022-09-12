import java.awt.Color;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.*;
public abstract class Simple_flight extends JFrame implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame F=new JFrame("FLIGHT BOOKING SERVER");
		  F.setBackground(Color.gray);
		     Container c;
		     JLabel title;
		     JLabel name;
			 JLabel Adhaar;
			 JLabel Num;
			 JLabel add;
			 JTextArea tadd;
			 
			 JLabel gender;
		     JComboBox gender1;
			 JTextField Name1;
			 JTextField Adhaar1;
			 JTextField Num1;
			 JButton Sub;
			 JButton reset;
			 JTextField tname;
			 JCheckBox term;
			 
			 //JCOMBO BOX ITEMS
			 			 
			 String dates[]
						= { "1", "2", "3", "4", "5",
							"6", "7", "8", "9", "10",
							"11", "12", "13", "14", "15",
							"16", "17", "18", "19", "20",
							"21", "22", "23", "24", "25",
							"26", "27", "28", "29", "30",
							"31" };
			 String months[]
						= { "Jan", "feb", "Mar", "Apr",
							"May", "Jun", "July", "Aug",
							"Sup", "Oct", "Nov", "Dec" };		 
			 String years[]
						= { "2022","2023"};
			 
			 String gender2[]
					 = {"MALE","FEMALE"};
			 

			 //Title
			  title=new JLabel("FLIGHT BOOKING SERVER");
			  title.setFont(new Font("Arial",Font.ITALIC,20));
			  title.setSize(800,30);
			  title.setLocation(120,30);
			  F.add(title);
			  //NAME
			  name = new JLabel("Name:");
			  name.setFont(new Font("Arial", Font.ITALIC, 20));
			  name.setSize(100, 20);
			  name.setLocation(105, 100);
			  F.add(name);
				
			  tname = new JTextField();
			  tname.setFont(new Font("Arial", Font.ITALIC, 15));
			  tname.setSize(190, 25);
			  tname.setLocation(170, 100);
			  F.add(tname);
			  
			  Num = new JLabel("Mobile No:");
			  Num.setFont(new Font("Arial", Font.ITALIC, 20));
			  Num.setSize(100, 20);
			  Num.setLocation(70, 150);
			  F.add(Num);

			  Num1 = new JTextField();
			  Num1.setFont(new Font("Arial", Font.ITALIC, 15));
			  Num1.setSize(150, 20);
			  Num1.setLocation(170, 150);
			  F.add(Num1);
			  
			  Adhaar = new JLabel("ADHAAR NUMBER:");
			  Adhaar.setFont(new Font("Arial", Font.ITALIC, 17));
			  Adhaar.setSize(180, 20);
			  Adhaar.setLocation(10, 200);
			  F.add(Adhaar);
			  
			  Adhaar1 = new JTextField();
			  Adhaar1.setFont(new Font("Arial", Font.ITALIC, 15));
			  Adhaar1.setSize(150, 20);
			  Adhaar1.setLocation(170, 200);
			  F.add(Adhaar1);

			    gender = new JLabel("Gender:");
			    gender.setFont(new Font("Arial", Font.ITALIC, 20));
			    gender.setSize(100, 20);
			    gender.setLocation(80, 250);
			    F.add(gender);
				
			    gender1 = new JComboBox(gender2);
			    gender1.setFont(new Font("Arial", Font.ITALIC, 15));
			    gender1.setSize(120, 20);
			    gender1.setLocation(170, 250);
			    F.add(gender1);
			  
			    add = new JLabel("Address:");
				add.setFont(new Font("Arial", Font.ITALIC, 20));
				add.setSize(100, 20);
				add.setLocation(70, 300);
				F.add(add);
				

                tadd = new JTextArea();
				tadd.setFont(new Font("Arial", Font.ITALIC, 15));
				tadd.setSize(200, 75);
				tadd.setLocation(170, 300);
				tadd.setLineWrap(true);
				F.add(tadd);
				
				term = new JCheckBox("Accept Terms And Conditions.");
				term.setFont(new Font("Arial", Font.ITALIC, 15));
				term.setSize(250, 20);
				term.setLocation(170, 400);
				F.add(term);
			  
			  
			  
				
			 
			  
			  //Submit 
			  Sub=new JButton("SUBMIT");
			  Sub.setFont(new Font("Arial",Font.ITALIC,20));
			  Sub.setSize(160,30);
			  Sub.setLocation(70,600);
			  F.add(Sub);
			  //TEACHER
			  reset=new JButton("RESET");
			  reset.setFont(new Font("Arial",Font.ITALIC,20));
			  reset.setSize(160,30);
			  reset.setLocation(250,600);
			  F.add(reset);
			  
		      //FRAME
			  F.setSize(500,800);
			  F.setLayout(null);
			  F.setVisible(true);
			  reset.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) 
				{
					if (e.getSource() == reset) {
						String def = "";
						tname.setText(def);
						reset.setText(def);
						((JComboBox) gender1).setSelectedIndex(0);
						
				}
				  
			  
				} });
			  Sub.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println("");
					if (e.getSource() == Sub);
					  JFrame f = new JFrame("FLIGHT BOOKING ");
					  JLabel type;
					  JLabel title2;
					  JLabel Dep;
					  JLabel Date;
					  JLabel Arr;
					  JButton sub;
					  JLabel price;
					  JLabel sam;
					  JLabel tim;
					  JComboBox type2;
					  JComboBox Time;
					  JComboBox date;
					  JComboBox month;
					  JComboBox year;
					  JComboBox price1;
					  JTextField dep1;
					  JTextField Arr1;
					  JComboBox Dep1;
						 F.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
						 
						 String type3[]
								 = {"DOMESTIC","INTERNATIONAL"};
						 
						 String price3[]
									= {"10,000-15,000","15000-25000","30000-45000",
											"50000-80000","85000-100000"};
							String dates[]
									= { "1", "2", "3", "4", "5",
										"6", "7", "8", "9", "10",
										"11", "12", "13", "14", "15",
										"16", "17", "18", "19", "20",
										"21", "22", "23", "24", "25",
										"26", "27", "28", "29", "30",
										"31" };
								String months[]
									= { "Jan", "feb", "Mar", "Apr",
										"May", "Jun", "July", "Aug",
										"Sup", "Oct", "Nov", "Dec" };
								 String years[]
									= { "2022","2023"};
								 String Time1[]
											= {"12AM-2AM","2AM-4AM","4AM-6AM",
												"6AM-9AM","9AM-12PM","12PM-2PM",
												"2PM-4PM","4PM-6PM","6PM-8PM","8PM-10PM"
												,"10PM-12PM"};
						 //TITLE
						  title2=new JLabel("FLIGHT DETAILS");
						  title2.setFont(new Font("Arial",Font.ITALIC,20));
						  title2.setSize(800,30);
						  title2.setLocation(120,30);
						  f.add(title2);
						  
						  
						  //type
						  type = new JLabel("TYPE :");
						  type.setFont(new Font("Arial", Font.ITALIC, 20));
						  type.setSize(100, 15);
						  type.setLocation(105, 100);
						  f.add(type);
						
						  
						  Dep1 = new JComboBox(type3);
						  Dep1.setFont(new Font("Arial", Font.ITALIC, 15));
						  Dep1.setSize(145,22 );
						  Dep1.setLocation(190, 100);
						  f.add(Dep1);
						  
						  price = new JLabel("PRICE RANGE :");
						  price.setFont(new Font("Arial", Font.ITALIC, 17));
						  price.setSize(130, 15);
						  price.setLocation(45, 150);
						  f.add(price);
						  
						  price1 = new JComboBox<Object>(price3);
						  price1.setFont(new Font("Arial", Font.ITALIC, 15));
						  price1.setSize(145,22 );
						  price1.setLocation(190, 150);
						  f.add(price1);
						  
						  sub=new JButton("BOOK A FLIGHT");
						  sub.setFont(new Font("Arial",Font.ITALIC,20));
						  sub.setSize(250,30);
						  sub.setLocation(100,400);
						  f.add(sub);
						  
						  Date = new JLabel("DATE OF TRAVEL :");
						  Date.setFont(new Font("Arial", Font.ITALIC, 18));
						  Date.setSize(175, 15);
						  Date.setLocation(15, 200);
						  f.add(Date);
						  		  
						  date = new JComboBox(dates);
						  date.setFont(new Font("Arial", Font.ITALIC, 15));
						  date.setSize(50, 20);
						  date.setLocation(200, 200);
						  f.add(date);

						  month = new JComboBox(months);
						  month.setFont(new Font("Arial", Font.ITALIC, 15));
						  month.setSize(60, 20);
						  month.setLocation(250, 200);
						  f.add(month);

						  year = new JComboBox(years);
						  year.setFont(new Font("Arial", Font.ITALIC, 15));
						  year.setSize(60, 20);
						  year.setLocation(320, 200);
						  f.add(year);
						  
						  tim = new JLabel("TIME OF FLIGHT :");
						  tim.setFont(new Font("Arial", Font.ITALIC, 17));
						  tim.setSize(150, 15);
						  tim.setLocation(40, 250);
						  f.add(tim);
						  
						  Time = new JComboBox(Time1);
						  Time.setFont(new Font("Arial", Font.ITALIC, 17));
						  Time.setSize(130, 20);
						  Time.setLocation(190, 250);
						  f.add(Time);
						  
						  Dep = new JLabel("From :");
						  Dep.setFont(new Font("Arial", Font.ITALIC, 17));
						  Dep.setSize(130, 15);
						  Dep.setLocation(45, 300);
						  f.add(Dep);
						  
						  dep1 = new JTextField();
						  dep1.setFont(new Font("Arial", Font.ITALIC, 17));
						  dep1.setSize(150,25);
						  dep1.setLocation(190, 300);
						  f.add(dep1);
						  
						  Arr = new JLabel("TO :");
						  Arr.setFont(new Font("Arial", Font.ITALIC, 17));
						  Arr.setSize(130, 15);
						  Arr.setLocation(45, 350);
						  f.add(Arr);
						  
						  Arr1 = new JTextField();
						  Arr1.setFont(new Font("Arial", Font.ITALIC, 17));
						  Arr1.setSize(150,25);
						  Arr1.setLocation(190, 350);
						  f.add(Arr1);
						  
						  
						  sam = new JLabel("TO :");
						  sam.setFont(new Font("Arial", Font.ITALIC, 17));
						  sam.setSize(130, 15);
						  sam.setLocation(45, 350);
						  f.add(sam);
						
						 
						  
						  
						 
						
						 		  
						  f.setVisible(true);
						  f.setSize(500,800);
						  f.setLayout(null);
						  
						  
						  sub.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								if (e.getSource() == Sub);
								  JFrame W = new JFrame("TICKET");
								  f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
								  JTextArea tadd1;
								  JLabel title3;
								  JLabel Res;
								  JButton Print;
								  JLabel sam2;
								  Random rand = new Random();
								  int FLI_NUM = rand.nextInt(1000000);
								  tadd1 = new JTextArea();
									tadd1.setFont(new Font("Arial", Font.ITALIC, 15));
									tadd1.setSize(400, 400);
									tadd1.setLocation(50, 100);
									tadd1.setLineWrap(true);
									W.add(tadd1);
									
									title3=new JLabel("TICKET");
									  title3.setFont(new Font("Arial",Font.ITALIC,20));
									  title3.setSize(800,30);
									  title3.setLocation(120,30);
									  W.add(title3);
									  
									Res=new JLabel("FLIGHT BOOKED SUCCESFULLY");
									Res.setFont(new Font("Arial",Font.ITALIC,20));
									  Res.setSize(335,30);
									 Res.setLocation(70,600);
									  W.add(Res);
										  
									 Print=new JButton("PRINT THE TICKECT");
									 Print.setFont(new Font("Arial",Font.ITALIC,20));
									 Print.setSize(290,30);
									 Print.setLocation(100,700);
									  W.add(Print);
									  
									  sam2=new JLabel("PRINT THE TICKECT");
										 sam2.setFont(new Font("Arial",Font.ITALIC,20));
										 sam2.setSize(800,30);
										 sam2.setLocation(210,550);
										  W.add(sam2);
									  
									  
									
									  
									
									
									String data
									= "Your TICKET:\n--------------------------\n"
								    +"Name : "
									+ tname.getText() + "\n"
									+ "Mobile : "
									+ Num1.getText() + "\n"
								    +"ADHAAR NUMBER : "
									+Adhaar1.getText()+"\n";
									
									String data1
									="DATE OF FLIGHT : "
											+ (String)date.getSelectedItem()
											+ "/" + (String)month.getSelectedItem()
											+ "/" + (String)year.getSelectedItem()
											+ "\n"
											+"TIME OF FLIGHT :"
											+Time.getSelectedItem() 
											+"\n";
									String data3
									="AIRLINES NAME : AIR ASIA "
									   +"\n"
								    +"RANGE OF TRAVEL :"
									+Dep1.getSelectedItem()
									+"\n"
									+"FROM :"
									+dep1.getText() + "\n"
									+"TO :"
									+Arr1.getText()+"\n"
									+"TICKET NUMBER :"
									+FLI_NUM+"\n"
									+"PRICE OF TICKET : "
									+price1.getSelectedItem()+"\n"
									+"MONEY WILL BE COLLECTED AT THE VERIFICATION CETER AT THE AIRPORT"+"\n";
									tadd1.setText(data + data1 + data3);
									tadd1.setEditable(false);								
									W.setVisible(true);
									W.setSize(500,800);
									W.setLayout(null);
								
							}
							  
						  });
						 
				}
				  
			  });
			 		 
	}
	
}
			  
			 