package Chap13_02;

import java.util.ArrayList;
import java.util.Comparator;

public class Collection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>num = new ArrayList();
		
		for(int i = 10; i >= 1; i--)
			num.add(i);
		
		System.out.println(num);
		
		System.out.print("정렬 전: ");
		for(int i = 0; i < num.size(); i++)
			System.out.print(num.get(i) + " ");
		num.sort(Comparator.naturalOrder());
		
		System.out.println();
		System.out.print("정렬 후: ");
		for(int i = 0; i < num.size(); i++)
			System.out.print(num.get(i) + " ");
		
		

	}

}
