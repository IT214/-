package com.sxt.game;

import java.util.Scanner;

public class Player extends GamePlayer{
	//���������������
	public Player(String name) {
		setName(name);
	}
	public int getInputValue() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" ��ѡ��������� : [0-ʯͷ] ,[1-����],[2-��]");
		//����������Ĳ�����ֵ����ֵ����1-2�Ļ�����δ���
		int value = scanner.nextInt();
		//�������ֵ���������value
		setValue(value);
		return value;
	}
}
