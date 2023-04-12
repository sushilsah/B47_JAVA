package com.tns.treesetuserdefined;

import java.util.Comparator;

public class Marks implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.getMarks()-o2.getMarks();
	}

}
