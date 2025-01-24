package Chap13_02;

import java.util.Iterator;
import java.util.TreeMap;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String>cats = new TreeMap<Integer,String>();
		cats.put(7,  "페르시안");
		cats.put(3, "러시안블루");
		System.out.println(cats);
		cats.put(5, "샴");
		System.out.println(cats);
		cats.replace(3,  "래그돌");
		System.out.println(cats);
		cats.remove(5);
		System.out.println(cats);
		System.out.println(cats.size());
		System.out.println(cats.get(7));
		System.out.print("(Key, Value) =");
		Iterator<Integer>keys = cats.keySet().iterator();
		while(keys.hasNext()) {
			int key = keys.next();
			System.out.print(" (" + key + ", " + cats.get(key) + ")");
			}
		}
}
