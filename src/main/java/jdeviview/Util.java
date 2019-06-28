package jdeviview;

import java.util.StringJoiner;

public class Util {
	public static void printArr(String [] strArr) {
		StringJoiner sj = new StringJoiner(",", "[", "]");
		for (String s: strArr) {
			sj.add(s);
		}
		System.out.println(sj.toString());
	}
}
