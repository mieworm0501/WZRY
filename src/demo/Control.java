package demo;

import java.util.Scanner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.WindowConstants;


public class Control implements Runnable{
	Scanner scan = new Scanner(System.in);
	int TIME = 1;
	int x=0;
	int y=0;
	char sub;	//主语
	String command = new String();
	char skill;	//技能
	char arrow; //攻击方向
	Map starting = new Map();
	public void run()
	{
		JFrame window = new JFrame("WZRY");
	    window.setBounds(400,0,1000,600);
	    window.setVisible(true);
	    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    
	    JMenuBar windowBar = new JMenuBar();
	    windowBar.setOpaque(true);
	    windowBar.setBackground(new Color(100,200,200));
	    windowBar.setPreferredSize(new Dimension(1000,20));
	    
	    JMenu windowM = new JMenu();
	    
	    
	    
	    JLabel windowLabel = new JLabel();
	    windowLabel.setOpaque(true);
	    windowLabel.setBackground(new Color(200,200,100));
	    windowLabel.setPreferredSize(new Dimension(1000,580));
	    
	    window.setJMenuBar(windowBar);
	    window.getContentPane().add(windowLabel,BorderLayout.CENTER);
	    
	    window.pack();
	    
	    window.setVisible(true);
		//Thread MapShow = new Thread(starting);
		//Thread Hero_B_C = new Thread(starting.B);
		//MapShow.start();
		//Hero_B_C.start();
		
		while(true)
		{
			//System.out.println(txt2String(file));
			System.out.println("第"+TIME+"回合");
			starting.Show();
			System.out.println("请输入你的指令：");
			command = scan.next();
			if(command.equals("end"))
			{
				TIME++;
				starting.resetHero();
				
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
				starting.ChangeP(sub,x,y);
				
				continue;
			}
			if(command.equals("attack"))
			{
				sub = scan.next().charAt(0);
				skill = scan.next().charAt(0);
				arrow = scan.next().charAt(0);
				starting.subAttack(sub, skill, arrow);
				continue;
			}
			
			
			System.out.println("错误指令，请重新输入.");
		}
	}
}
