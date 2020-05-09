package com.sxt.util.MyUtil;

public class MyUtil {
	private  MyUtil() {}
	
	public static  int getRandomNumber(int min,int max) {
		System.out.println(" min = " + min);
		System.out.println(" max = " + max);
		return (int )(Math.random()*(max-min)+min);
	}
}
