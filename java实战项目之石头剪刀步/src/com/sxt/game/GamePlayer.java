package com.sxt.game;
/**
 * 抽象的父类， GamePlayer 抽象的
 * 参与者的名字
 * 实例成员变量		value选择的数值[0-2]
 * 记录游戏参与者胜利的当前场数  winCount
 * 功能 ：  抽象的	获得的数值方法 value 	int getInputValue()
 */
public abstract class GamePlayer {
	private String name;
	//value 的取值范围是0-2
	private int value;
	//当前胜利的最大场数
	private int winCount;
	
	/**
	 * 获得参与者选择的手势的值的方法，子类需要实现
	 * @return
	 */
	public abstract int getInputValue();
	
	public String getName() {
		return  name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value=value;
	}
	public int getwinCount() {
		return winCount;
	}
	public void setwinCount(int winCount) {
		this.winCount=winCount;
	}
	
	/**
	 * 展示玩家选择的手势信息
	 */
	public void  show() {
		System.out.println(name + " \t 选择的手势是 " + Constant.NAMES[value]);
	}
	/**
	 * 判断当前玩家是否胜利,如果胜的数=最大数的数也就是3
	 * @return
	 */
	public boolean isWin() {
		
		 /* if(wincount==Constant.MAX_WIN_COUNT)
		  * 	return true;
		  * else
		  * 	return false;
		 */
		return winCount == Constant.MAX_WIN_COUNT;
	}
}
