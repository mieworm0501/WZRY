package demo;

import java.util.Scanner;

//exit	ֹͣ����
//end	�����غ�
//attack ��������Fָ���棬Tָ����Aָ��ͨ������
//move x y	�ƶ�����x��y��

public class Play {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int TIME = 1;
		int x=0;
		int y=0;
		String command = new String();
		Map start = new Map();
		while(true)
		{
			System.out.println("��"+TIME+"�غ�");
			start.Show();
			System.out.print("���������ָ�");
			command = scan.next();
			if(command.equals("end"))
			{
				TIME++;
			}
			if(command.equals("exit"))
			{
				System.out.println("��Ϸ����");
				break;
			}
			if(command.equals("move"))
			{
				x = scan.nextInt();
				y = scan.nextInt();
				start.ChangeP(x, y);
				start.Show();
			}
		}
		
	}
}