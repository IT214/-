package com.sxt.game;
/**
 *定义游戏的规范
 *定义游戏接口
 *GameInterface
 *initGame()
 *starGame()
 *endGame()
 */
public interface GameInterface {
	/**
	 * 在此对你的游戏进行初始化
	 */
	void initGame();
	
	/**
	 * 再次开始游戏
	 */
	
	void starGame();
	
	/**
	 * 再次结束游戏
	 */
	void endGame();
}
