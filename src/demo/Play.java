package demo;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

//exit	停止运行
//end	结束回合
//attack sub (W|A|S|D) 技能名（F指火焰，T指普通攻击，M指回旋斩） sub向(上|左|下|右)攻击
//move sub x y	移动sub到x行y列(每次移动不能超过以自身为中心7x7的范围)

public class Play {
	public static String txt2String(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
	
	
	public static void main (String[] args) throws Exception
	{
		
		File file = new File("D:/workplace/command.txt");
		//BufferedReader AAA = new BufferedReader(new FileReader(file)); 
		Scanner scan = new Scanner(file);
		
		int TIME = 1;
		int x=0;
		int y=0;
		char sub;	//主语
		String command = new String();
		char skill;	//技能
		char arrow; //攻击方向
		Map start = new Map();
		while(true)
		{
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
		scan.close();
	}
}