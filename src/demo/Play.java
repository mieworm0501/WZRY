package demo;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

//exit	ֹͣ����
//end	�����غ�
//attack sub (W|A|S|D) ��������Fָ���棬Tָ��ͨ������Mָ����ն�� sub��(��|��|��|��)����
//move sub x y	�ƶ�sub��x��y��(ÿ���ƶ����ܳ���������Ϊ����7x7�ķ�Χ)

public class Play {
	public static String txt2String(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//����һ��BufferedReader������ȡ�ļ�
            String s = null;
            while((s = br.readLine())!=null){//ʹ��readLine������һ�ζ�һ��
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
		char sub;	//����
		String command = new String();
		char skill;	//����
		char arrow; //��������
		Map start = new Map();
		while(true)
		{
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
		scan.close();
	}
}