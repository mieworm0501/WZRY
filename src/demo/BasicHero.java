package demo;

public class BasicHero {
	int HP;			//血量
	int MP;			//蓝量
	int EXP;		//经验
	char Name;		//名字，用大小写字母表示
	int []Position = new int [2];	//位置，坐标
	int ifmove = 1;	//是否可移动
	int ifattack = 1;	//是否可攻击
	int ifturn = 1;	//是否为它的回合
	int ifalive = 1;
	
	void ifHeroDie()
	{
		if(HP<=0)	ifalive = 0;
	}
	int ifMP()
	{
		if(MP<=0)	return 0;
		else	return 1;
	}
}

