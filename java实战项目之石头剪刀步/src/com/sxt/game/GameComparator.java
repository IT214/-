package com.sxt.game;
/**
 * ���ڶ�����Ϸ�����ƱȽϵĽӿ�
 *���playerValueʤ��computerValue ����1����ͬ����0�����򷵻�-1
 *int compare(int playerValue ,int computerValue)
 *�Զ�������ʵ�ָýӿ�GameComparatorImpl
 */
public interface GameComparator {
	
		/**
		 * �����ƱȽϵķ���
		 * @param value1	������������ֵ
		 * @param value2	�������������ֵ
		 * @return	���		value1������value2����1 value1=value2 ����0 ���򷵻� -1
		 */
		int compare(int value1,int value2);
}
//TODO �����໹û��ʵ��
//ʵ�ָù淶������
class GameComparatorImpl implements  GameComparator{
	public int compare(int value1 ,int value2) {
		if(value1==value2) {
			return 0;
		}else {
			if(value1==Constant.STONE) {//ʯͷ
				if(value2==Constant.SISSORS) {//����
					return 1;
				}else {//��
					return -1;
				}
			}else  if(value1==Constant.SISSORS) {//����
				if(value2==Constant.STONE) {//ʯͷ
					return -1;
				}else {
						return 1;
					}
			}else {//��
				if(value2==Constant.PAPER) {//��
					return 1;
				}else {
					return -1;
				}
			}
		}
	}
}
