package com.sxt.game;
/**
 * ����ĸ��࣬ GamePlayer �����
 * �����ߵ�����
 * ʵ����Ա����		valueѡ�����ֵ[0-2]
 * ��¼��Ϸ������ʤ���ĵ�ǰ����  winCount
 * ���� ��  �����	��õ���ֵ���� value 	int getInputValue()
 */
public abstract class GamePlayer {
	private String name;
	//value ��ȡֵ��Χ��0-2
	private int value;
	//��ǰʤ���������
	private int winCount;
	
	/**
	 * ��ò�����ѡ������Ƶ�ֵ�ķ�����������Ҫʵ��
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
	 * չʾ���ѡ���������Ϣ
	 */
	public void  show() {
		System.out.println(name + " \t ѡ��������� " + Constant.NAMES[value]);
	}
	/**
	 * �жϵ�ǰ����Ƿ�ʤ��,���ʤ����=���������Ҳ����3
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
