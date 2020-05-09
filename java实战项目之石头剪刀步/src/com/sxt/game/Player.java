package com.sxt.game;

import java.util.Scanner;

public class Player extends GamePlayer{
	//给玩家设立个名字
	public Player(String name) {
		setName(name);
	}
	public int getInputValue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 请选择你的手势 : [0-石头] ,[1-剪刀],[2-布]");
		//如果玩家输入的不是数值，数值不在1-2的话，如何处理
		int value = scanner.nextInt();
		//将输入的值赋给父类的value
		setValue(value);
		return value;
	}
}
