package com.sorting.algo;

import java.awt.HeadlessException;
import java.awt.event.ActionListener;

public class SelectionSortClass extends TextFieldClass implements Runnable, ActionListener {

	Thread selection;

	public SelectionSortClass() throws HeadlessException {
		super();
		selection = new Thread(this);
		selection.start();
		back.addActionListener(this);
	}

	public int minimum(int first, int last) {
		int min_ele, min_index = first;
		min_ele = array[first];
		for (int i = first + 1; i <= last; i++) {
			display(first, i);
			try {
				selection.sleep(2500);
			} catch (Exception e) {
				System.out.println(e);
			}
			if (array[i] < min_ele) {
				min_ele = array[i];
				min_index = i;
			}
			display(first, i);
			try {
				selection.sleep(2500);
			} catch (Exception e) {
				System.out.println(e);
			}
			clearColor();
		}
		return (min_index);
	}

	@Override
	public void run() {

		int pass, min_index, temp;
		for (pass = 1; pass <= 6 - 1; pass++) {

			min_index = minimum(pass - 1, 5);
			temp = array[pass - 1];
			array[pass - 1] = array[min_index];
			array[min_index] = temp;
			display(pass, min_index);
			try {
				selection.sleep(2500);
			} catch (Exception e) {
				System.out.println(e);
			}
			clearColor();
			try {
				selection.sleep(2500);
			} catch (Exception e) {
				System.out.println(e);
			}

			if (pass == 1) {
				display1();
			} else if (pass == 2) {
				display2();
			} else if (pass == 3) {
				display3();
			} else if (pass == 4) {
				display4();
			} else if (pass == 5) {
				display5();
			} else if (pass == 6) {
				display6();
			}
		}

	}

}
