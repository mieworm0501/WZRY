package demo;

import java.util.Scanner;

public class Control implements Runnable{
	Scanner scan = new Scanner(System.in);
	int TIME = 1;
	int x=0;
	int y=0;
	char sub;	//����
	String command = new String();
	char skill;	//����
	char arrow; //��������
	Map start = new Map();
	int LTime = 10;
	public void run()
	{
		while(true)
		{
			if(LTime<=0)
			{
				try {wait();}
				catch(InterruptedException	e) {}
			}
			//System.out.println(txt2String(file));
			System.out.println("��"+TIME+"�غ�");
			start.Show();
			System.out.println("���������ָ�");
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
	}
}
