package com.sorting.algo;

import java.awt.HeadlessException;
import java.awt.event.ActionListener;

public class InsertionSortClass extends TextFieldClass implements Runnable, ActionListener {

	Thread Insertion;

	public InsertionSortClass() throws HeadlessException {
		super();
		Insertion = new Thread(this);
		Insertion.start();
		back.addActionListener(this);
	}

	@Override
	public void run() {

		int n = array.length;
		for (int j = 1; j < n; j++) {

			int key = array[j];
			int i = j - 1;
			try {
				Insertion.sleep(1500);
			} catch (Exception e) {
				System.out.println(e);
			}
			display(j, i);
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
				display(j, i + 1);
				try {
					Insertion.sleep(2500);
				} catch (Exception e) {
					System.out.println(e);
				}
				clearColor();

			}
			array[i + 1] = key;
			display(j, i + 1);
			try {
				Insertion.sleep(2500);
			} catch (Exception e) {
				System.out.println(e);
			}
			clearColor();
			if (j == 1) {
				display1();
			} else if (j == 2) {
				display2();
			} else if (j == 3) {
				display3();
			} else if (j == 4) {
				display4();
			} else if (j == 5) {
				display5();
			} else if (j == 6) {
				display6();
			}

		}

	}

}
