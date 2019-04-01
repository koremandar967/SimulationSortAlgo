package com.sorting.algo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TextFieldClass extends MainPage implements ActionListener,WindowListener{

	public Button back;
	public Panel canvas;
	public boolean textField;
	private Panel frame;
	static int count=1;
	public int array[] = {8,2,6,1,5,-1};
	
	private TextField box1,box2,box3,box4,box5,box6;
	private TextField box1_1,box1_2,box1_3,box1_4,box1_5,box1_6;
	private TextField box2_1,box2_2,box2_3,box2_4,box2_5,box2_6;
	private TextField box3_1,box3_2,box3_3,box3_4,box3_5,box3_6;
	private TextField box4_1,box4_2,box4_3,box4_4,box4_5,box4_6;
	private TextField box5_1,box5_2,box5_3,box5_4,box5_5,box5_6;
	private TextField box6_1,box6_2,box6_3,box6_4,box6_5,box6_6;
	
	
	public TextFieldClass() throws HeadlessException {
		super();
		
		frame = new Panel();

		box1 = new TextField(3);
		box1.setBounds(75,50,20,25);
		box2 = new TextField(3);
		box2.setBounds(150,50,20,25);
		box3 = new TextField(3);
		box3.setBounds(225,50,20,25);
		box4 = new TextField(3);
		box4.setBounds(300,50,20,25);
		box5 = new TextField(3);
		box5.setBounds(375,50,20,25);
		box6 = new TextField(3);
		box6.setBounds(450,50,20,25);
		
		box1_1 = new TextField(3);
		box1_1.setBounds(75,125,20,25);
		box1_2 = new TextField(3);
		box1_2.setBounds(150,125,20,25);
		box1_3 = new TextField(3);
		box1_3.setBounds(225,125,20,25);
		box1_4 = new TextField(3);
		box1_4.setBounds(300,125,20,25);
		box1_5 = new TextField(3);
		box1_5.setBounds(375,125,20,25);
		box1_6 = new TextField(3);
		box1_6.setBounds(450,125,20,25);
		
		box2_1 = new TextField(3);
		box2_1.setBounds(75,175,20,25);
		box2_2 = new TextField(3);
		box2_2.setBounds(150,175,20,25);
		box2_3 = new TextField(3);
		box2_3.setBounds(225,175,20,25);
		box2_4 = new TextField(3);
		box2_4.setBounds(300,175,20,25);
		box2_5 = new TextField(3);
		box2_5.setBounds(375,175,20,25);
		box2_6 = new TextField(3);
		box2_6.setBounds(450,175,20,25);
		
		box3_1 = new TextField(3);
		box3_1.setBounds(75,225,20,25);
		box3_2 = new TextField(3);
		box3_2.setBounds(150,225,20,25);
		box3_3 = new TextField(3);
		box3_3.setBounds(225,225,20,25);
		box3_4 = new TextField(3);
		box3_4.setBounds(300,225,20,25);
		box3_5 = new TextField(3);
		box3_5.setBounds(375,225,20,25);
		box3_6 = new TextField(3);
		box3_6.setBounds(450,225,20,25);
		
		box4_1 = new TextField(3);
		box4_1.setBounds(75,275,20,25);
		box4_2 = new TextField(3);
		box4_2.setBounds(150,275,20,25);
		box4_3 = new TextField(3);
		box4_3.setBounds(225,275,20,25);
		box4_4 = new TextField(3);
		box4_4.setBounds(300,275,20,25);
		box4_5 = new TextField(3);
		box4_5.setBounds(375,275,20,25);
		box4_6 = new TextField(3);
		box4_6.setBounds(450,275,20,25);
		
		box5_1 = new TextField(3);
		box5_1.setBounds(75,325,20,25);
		box5_2 = new TextField(3);
		box5_2.setBounds(150,325,20,25);
		box5_3 = new TextField(3);
		box5_3.setBounds(225,325,20,25);
		box5_4 = new TextField(3);
		box5_4.setBounds(300,325,20,25);
		box5_5 = new TextField(3);
		box5_5.setBounds(375,325,20,25);
		box5_6 = new TextField(3);
		box5_6.setBounds(450,325,20,25);
		
		box6_1 = new TextField(3);
		box6_1.setBounds(75,375,20,25);
		box6_2 = new TextField(3);
		box6_2.setBounds(150,375,20,25);
		box6_3 = new TextField(3);
		box6_3.setBounds(225,375,20,25);
		box6_4 = new TextField(3);
		box6_4.setBounds(300,375,20,25);
		box6_5 = new TextField(3);
		box6_5.setBounds(375,375,20,25);
		box6_6 = new TextField(3);
		box6_6.setBounds(450,375,20,25);
		
		add(box1);add(box2);add(box3);add(box4);add(box5);add(box6);
		add(box1_1);add(box1_2);add(box1_3);add(box1_4);add(box1_5);add(box1_6);
		add(box2_1);add(box2_2);add(box2_3);add(box2_4);add(box2_5);add(box2_6);
		add(box3_1);add(box3_2);add(box3_3);add(box3_4);add(box3_5);add(box3_6);
		add(box4_1);add(box4_2);add(box4_3);add(box4_4);add(box4_5);add(box4_6);
		add(box5_1);add(box5_2);add(box5_3);add(box5_4);add(box5_5);add(box5_6);
		add(box6_1);add(box6_2);add(box6_3);add(box6_4);add(box6_5);add(box6_6);
		
		back = new Button("back");

		setLayout(new BorderLayout());
		canvas = new Panel();
		canvas.add(back);
		
		add(canvas,BorderLayout.SOUTH);

		back.addActionListener(this);
        textField = true;
		setVisible(textField);
		
		setSize(500,500);

		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==back)
		{
			
			setVisible(false);
		}
		
		
	}
	
	
	public void clearColor()
	{
		box1.setBackground(Color.white);
		box2.setBackground(Color.white);
		box3.setBackground(Color.white);
		box4.setBackground(Color.white);
		box5.setBackground(Color.white);
		box6.setBackground(Color.white);
	}	
	public void display(int i,int j)
	{
		box1.setText(""+array[0]);
		box2.setText(""+array[1]);
		box3.setText(""+array[2]);
		box4.setText(""+array[3]);
		box5.setText(""+array[4]);
		box6.setText(""+array[5]);
		if(i==0 || j==0)
		{
			box1.setBackground(Color.red);
		}
		if(i==1 || j==1)
		{
			box2.setBackground(Color.red);
		}
		if(i==2 || j==2)
		{
			box3.setBackground(Color.red);
		}
		if(i==3 || j==3)
		{
			box4.setBackground(Color.red);
		}
		if(i==4 || j==4)
		{
			box5.setBackground(Color.red);
		}
		if(i==5 || j==5)
		{
			box6.setBackground(Color.red);
		}
		
	}
	public void display1()
	{
		box1_1.setText(""+array[0]);
		box1_2.setText(""+array[1]);
		box1_3.setText(""+array[2]);
		box1_4.setText(""+array[3]);
		box1_5.setText(""+array[4]);
		box1_6.setText(""+array[5]);
	}
	public void display2()
	{
		box2_1.setText(""+array[0]);
		box2_2.setText(""+array[1]);
		box2_3.setText(""+array[2]);
		box2_4.setText(""+array[3]);
		box2_5.setText(""+array[4]);
		box2_6.setText(""+array[5]);
	}
	public void display3()
	{
		box3_1.setText(""+array[0]);
		box3_2.setText(""+array[1]);
		box3_3.setText(""+array[2]);
		box3_4.setText(""+array[3]);
		box3_5.setText(""+array[4]);
		box3_6.setText(""+array[5]);
	}
	public void display4()
	{
		box4_1.setText(""+array[0]);
		box4_2.setText(""+array[1]);
		box4_3.setText(""+array[2]);
		box4_4.setText(""+array[3]);
		box4_5.setText(""+array[4]);
		box4_6.setText(""+array[5]);
	}
	public void display5()
	{
		box5_1.setText(""+array[0]);
		box5_2.setText(""+array[1]);
		box5_3.setText(""+array[2]);
		box5_4.setText(""+array[3]);
		box5_5.setText(""+array[4]);
		box5_6.setText(""+array[5]);
	}
	public void display6()
	{
		box6_1.setText(""+array[0]);
		box6_2.setText(""+array[1]);
		box6_3.setText(""+array[2]);
		box6_4.setText(""+array[3]);
		box6_5.setText(""+array[4]);
		box6_6.setText(""+array[5]);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
			dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
