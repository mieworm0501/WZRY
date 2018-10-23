package demo;

import java.util.Scanner;

//exit	停止运行
//end	结束回合
//attack 技能名（F指火焰，T指毒，A指普通攻击）
//move x y	移动到（x，y）

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
			System.out.println("第"+TIME+"回合");
			start.Show();
			System.out.print("请输入你的指令：");
			command = scan.next();
			if(command.equals("end"))
			{
				TIME++;
			}
			if(command.equals("exit"))
			{
				System.out.println("游戏结束");
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