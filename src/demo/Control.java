package demo;

import java.util.Scanner;

public class Control implements Runnable{
	Scanner scan = new Scanner(System.in);
	int TIME = 1;
	int x=0;
	int y=0;
	char sub;	//主语
	String command = new String();
	char skill;	//技能
	char arrow; //攻击方向
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
			System.out.println("第"+TIME+"回合");
			start.Show();
			System.out.println("请输入你的指令：");
			command = scan.next();
			if(command.equals("end"))
			{
				TIME++;
				start.resetHero();
				
				continue;
			}
			if(command.equals("exit"))
			{
				System.out.println("游戏结束");
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
			
			
			System.out.println("错误指令，请重新输入.");
		}
	}
}
