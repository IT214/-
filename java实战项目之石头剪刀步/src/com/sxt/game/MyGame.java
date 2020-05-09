package com.sxt.game;
/**
 * ��Ϸ�ĺ����࣬���е���Ϸ�Ĳ����ߣ��Ͳ���Ĺ��̣������ٴ�ִ��
 */
public class MyGame implements GameInterface {
	//2����Ϸ�����ߣ�һ������
	private GamePlayer player;
	private GamePlayer computer;
	
	private GameComparator comparator;
	
	//����ǰ��Ϸ�ľ���
	private int count=1;
	@Override
	public void initGame(){
		player = new Player(" ФϦ��");
		computer = new Computer(" Ф����");
		
		comparator = new GameComparatorImpl();
	}
	
	public void starGame() {
		//ѭ����ִ��һ����һ���غ�
		//while���ڲ�ȷ�����ٴ�
		while(true) {
			System.out.println("****************************************** �ڡ�  " + count + "�� �ֿ�ʼ��************************************");
//		�����ѡ��һ������
			player .getInputValue();
//		�õ������һ������
			computer.getInputValue();
//		�����ӡ��Һ͵���ѡ�������
			player.show();
			computer.show();
//		ʹ�ñȽ�������Ƚ��������ѡ�����ֵ
			int compare =  comparator .compare (player.getValue(),computer.getValue());
//		���ݲ����жϵĽ�����޸Ķ�Ӧ��ҵ���ֵ������ӡ���ֵĽ�������һ���ӵ�ǰ�ȷ�
			compareModify(compare);
			showGameInfo(compare);
			
			System.out.println("****************************************** �ڡ�  " + count + "�� �ֽ�����************************************\n");
			count++;
//		�ж��Ƿ���Խ�����Ϸ���Ƿ�����Ҵﵽ������ʤ��
			if(player.isWin() || computer.isWin())
				break;//ѭ������
		}
	}
	
	/**
	 * ���ݱȽϵĽ�����޸���ҵ�ֵ
	 */
	private void compareModify(int compare) {
		if(compare ==1) {//���ʤ��
			player.setwinCount(player.getwinCount()+1);
		}else if(compare==-1){
			computer.setwinCount(computer.getwinCount()+1);
		}
	}
	
	/**
	 * ���ݱȽϵĽ�������Ϣ�����Ƚϵ�ǰ���ܱȷ�
	 */
	private void showGameInfo(int compare) {
		switch(compare) {
		case 1://���ʤ��
			System.out.println("���� : " +player.getName() + " \t ʤ���� �� ");
			break;
		case 0://ƽ��
			System.out.println("���� : ƽ��" );
			break;
		case -1://����ʤ��
			System.out.println("���� : " +computer.getName() + " \t ʤ���� �� ");
			break;
		}
		//�ܱȷ�
		System.out.println("��ǰ��Ϸ�ܱȷ�Ϊ ��  " + player.getName() + "  VS " + computer.getName()  + " \t " + player.getwinCount() + " VS " + computer.getwinCount());
	}
	public void endGame() {
		System.out.println( "��Ϸ���� ");
		if(player.isWin()) {
			System.out.println(  player.isWin()  ? player.getName() : computer.getName()+ "\t ʤ���� ");
			System.out.println( "�����Ϸ�ܱȷ�Ϊ : " + player.getwinCount() + " VS " + computer.getwinCount());
		}
	}
}
