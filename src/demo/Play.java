package demo;

import java.util.Scanner;

//exit	ֹͣ����
//end	�����غ�
//attack sub (W|A|S|D) ��������Fָ���棬Tָ��ͨ������Mָ����ն�� sub��(��|��|��|��)����
//move sub x y	�ƶ�sub��x��y��(ÿ���ƶ����ܳ���������Ϊ����7x7�ķ�Χ)

public class Play {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int TIME = 1;
		int x=0;
		int y=0;
		char sub;	//����
		String command = new String();
		char skill;	//����
		char arrow; //��������
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
				start.resetHero();
				
				continue;
			}
			if(command.equals("exit"))
			{
				System.out.println("��Ϸ����");
				break;
			}
			if(command.equals("move"))
			{
				sub = scan.next().charAt(0);
				x = scan.nextInt();
				y = scan.nextInt();
				start.ChangeP(sub,x,y);
				
				continue;
			}
			if(command.equals("attack"))
			{
				sub = scan.next().charAt(0);
				skill = scan.next().charAt(0);
				arrow = scan.next().charAt(0);
				start.subAttack(sub, skill, arrow);
				continue;
			}
			
			
			System.out.println("����ָ�����������.");
		}
		scan.close();
	}
}