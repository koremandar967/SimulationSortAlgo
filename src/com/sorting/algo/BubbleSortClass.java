package com.sorting.algo;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BubbleSortClass extends TextFieldClass implements Runnable,ActionListener {

	Thread bubble;
	
	
	
	public BubbleSortClass() throws HeadlessException {
		super();
		bubble = new Thread(this);
		bubble.start();
		back.addActionListener(this);
	}

	public void actoinPerformed(ActionEvent ae)
	{
		String st = ae.getActionCommand();
		if(st.equals("back"))
		{
		   //new BubbleSortClass();
		   setVisible(false); 
		}	
	}


	@Override
	public void run() {
		
		for(int i=0;i<6;i++)
		{
			for(int j=i+1;j<6;j++)
			{
				if(array[i]>=array[j])
				{
					try
					{
						bubble.sleep(1500);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					display(i,j);
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					try
					{
						bubble.sleep(1500);
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					display(i,j);
				}
				
				try
				{
					bubble.sleep(1500);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				clearColor();
			}
			if(i==0)
			{
				display1();
			}
			else
			if(i==1)
			{
				display2();
			}
			else
			if(i==2)
			{
				display3();
			}
			else
			if(i==3)
			{
				display4();
			}
			else
			if(i==4)
			{
				display5();
			}
			else
			if(i==5)
			{
				display6();
			}
			
		}
		
	}

}
