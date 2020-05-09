package com.sxt.game;
/**
 * 用于定义游戏中手势比较的接口
 *如果playerValue胜，computerValue 返回1，相同返回0，否则返回-1
 *int compare(int playerValue ,int computerValue)
 *自定义子类实现该接口GameComparatorImpl
 */
public interface GameComparator {
	
		/**
		 * 用手势比较的方法
		 * @param value1	玩家输入的手势值
		 * @param value2	电脑输入的手势值
		 * @return	如果		value1克制了value2返回1 value1=value2 返回0 否则返回 -1
		 */
		int compare(int value1,int value2);
}
//TODO 该子类还没有实现
//实现该规范的子类
class GameComparatorImpl implements  GameComparator{
	public int compare(int value1 ,int value2) {
		if(value1==value2) {
			return 0;
		}else {
			if(value1==Constant.STONE) {//石头
				if(value2==Constant.SISSORS) {//剪刀
					return 1;
				}else {//布
					return -1;
				}
			}else  if(value1==Constant.SISSORS) {//剪刀
				if(value2==Constant.STONE) {//石头
					return -1;
				}else {
						return 1;
					}
			}else {//布
				if(value2==Constant.PAPER) {//布
					return 1;
				}else {
					return -1;
				}
			}
		}
	}
}
