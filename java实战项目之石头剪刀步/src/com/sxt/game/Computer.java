package com.sxt.game;

import com.sxt.util.MyUtil.MyUtil;

public class Computer extends GamePlayer {
	public Computer(String name) {
		setName(name);
	}
	public int getInputValue() {
		//将电脑获得的随机值给父类的value
		setValue(MyUtil.getRandomNumber(Constant.STONE,Constant.PAPER+1 ));
		return getValue();
	}
}
