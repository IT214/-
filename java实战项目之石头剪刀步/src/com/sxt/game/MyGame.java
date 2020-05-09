package com.sxt.game;
/**
 * 游戏的核心类，所有的游戏的参与者，和参与的过程，都将再次执行
 */
public class MyGame implements GameInterface {
	//2个游戏参与者，一个裁判
	private GamePlayer player;
	private GamePlayer computer;
	
	private GameComparator comparator;
	
	//代表当前游戏的局数
	private int count=1;
	@Override
	public void initGame(){
		player = new Player(" 肖夕梦");
		computer = new Computer(" 肖智鹏");
		
		comparator = new GameComparatorImpl();
	}
	
	public void starGame() {
		//循环里执行一个是一个回合
		//while用于不确定多少次
		while(true) {
			System.out.println("****************************************** 第【  " + count + "】 局开始了************************************");
//		让玩家选择一个手势
			player .getInputValue();
//		让电脑随机一个手势
			computer.getInputValue();
//		输出打印玩家和电脑选择的手势
			player.show();
			computer.show();
//		使用比较器对象比较两个玩家选择的数值
			int compare =  comparator .compare (player.getValue(),computer.getValue());
//		根据裁判判断的结果，修改对应玩家的数值，并打印本局的结果，输出一下子当前比分
			compareModify(compare);
			showGameInfo(compare);
			
			System.out.println("****************************************** 第【  " + count + "】 局结束了************************************\n");
			count++;
//		判断是否可以结束游戏，是否有玩家达到了三次胜利
			if(player.isWin() || computer.isWin())
				break;//循环结束
		}
	}
	
	/**
	 * 根据比较的结果，修改玩家的值
	 */
	private void compareModify(int compare) {
		if(compare ==1) {//玩家胜利
			player.setwinCount(player.getwinCount()+1);
		}else if(compare==-1){
			computer.setwinCount(computer.getwinCount()+1);
		}
	}
	
	/**
	 * 根据比较的结果输出信息，并比较当前的总比份
	 */
	private void showGameInfo(int compare) {
		switch(compare) {
		case 1://玩家胜利
			System.out.println("本局 : " +player.getName() + " \t 胜利了 ！ ");
			break;
		case 0://平局
			System.out.println("本局 : 平局" );
			break;
		case -1://电脑胜利
			System.out.println("本局 : " +computer.getName() + " \t 胜利了 ！ ");
			break;
		}
		//总比分
		System.out.println("当前游戏总比分为 ：  " + player.getName() + "  VS " + computer.getName()  + " \t " + player.getwinCount() + " VS " + computer.getwinCount());
	}
	public void endGame() {
		System.out.println( "游戏结束 ");
		if(player.isWin()) {
			System.out.println(  player.isWin()  ? player.getName() : computer.getName()+ "\t 胜利了 ");
			System.out.println( "最后游戏总比分为 : " + player.getwinCount() + " VS " + computer.getwinCount());
		}
	}
}
