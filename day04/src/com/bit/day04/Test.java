package com.bit.day04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strings = new String[3];
		String[] answers = new String[3];
		
		strings[0] = sc.next();
		strings[1] = sc.next();
		strings[2] = sc.next();
		
		int n = sc.nextInt();
		
		sc.close();
		
		ArrayList<Integer> list1 = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			list1.add((int)(strings[i].charAt(n)));
			//System.out.print("test" + strings[i].charAt(n));
		}
		
		Collections.sort(list1);
		
		System.out.print("\n");

		int count = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j<3; j++) {
				if((char)list1.get(i).intValue() == strings[j].charAt(n)) {
					answers[count] = strings[j];
					count++;
				}
			}
		}
		for(int i = 0; i< 3; i++) {
			System.out.println(answers[i]);
		}
	}
}
