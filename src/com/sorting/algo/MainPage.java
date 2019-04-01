package com.sorting.algo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class MainPage extends Frame implements ActionListener {

	public Frame fm1;
    private Button b1,b2,b3; 
    public boolean  Mainpage;
    
    
	public MainPage() throws HeadlessException {
		super();

		   //fm1 = new Frame("Simulation Sorting Algo");
		   b1 = new Button("Bubble sort");
		   b2 = new Button("Insertion sort");
		   b3 = new Button("Selection sort");
		   
		   //Mainpage = true;
		   setVisible(Mainpage);
		   setSize(500,500);
		   setLayout(new FlowLayout());
		   add(b1);
		   add(b2);
		   add(b3);
		   
		   b1.addActionListener(this);
		   b2.addActionListener(this);
		   b3.addActionListener(this);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String st = e.getActionCommand();
		if(st.equals("Bubble sort"))
		{
		   	new BubbleSortClass();
		}
		if(st.equals("Insertion sort"))
		{
		   	new InsertionSortClass();
		}
		if(st.equals("Selection sort"))
		{
			new SelectionSortClass();
		}
	}
	
	
	public static void main(String[] args) {
		
		MainPage obj = new MainPage();
	  	obj.setVisible(true);
	  	obj.setSize(500,500);
		
		
	}

}
