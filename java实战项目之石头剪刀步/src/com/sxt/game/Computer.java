package com.sxt.game;

import com.sxt.util.MyUtil.MyUtil;

public class Computer extends GamePlayer {
	public Computer(String name) {
		setName(name);
	}
	public int getInputValue() {
		//�����Ի�õ����ֵ�������value
		setValue(MyUtil.getRandomNumber(Constant.STONE,Constant.PAPER+1 ));
		return getValue();
	}
}
