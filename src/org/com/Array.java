package org.com;


import java.util.ArrayList;
import java.util.List;

public class Array {
	public static void main(String[] args) {

		List<Integer> cj =new ArrayList();
		
		cj.add(10);
		cj.add(20);
		cj.add(30);
		cj.add(40);
		cj.add(50);
		cj.add(10);
		cj.add(10);
		for (int i = 0; i < cj.size(); i++) {
			System.out.println(cj);
			
		}
		
	}
}
