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
	/*public static String txt2String(File file){
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