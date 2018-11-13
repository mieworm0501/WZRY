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
	/*public static String txt2String(File file){
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
    }*/

	
public static void main (String[] args) throws Exception
	{
		
		//File file = new File("D:/workplace/command.txt");
		//BufferedReader AAA = new BufferedReader(new FileReader(file)); 
		//Scanner scan = new Scanner(file);
		Control control = new Control();
		Thread play = new Thread(control);
		play.run();
	}
}