package demo;

public class BasicHero implements getPosition,getIfmove,getName,changePosition,Moved,Attacked,getHurt,getIfwork,getIfattack {
	int HP;			//血量
	int MP;			//蓝量
	int EXP;		//经验
	char Name;		//名字，用大小写字母表示
	int []Position = new int [2];	//位置，坐标
	int ifmove = 1;	//是否可移动
	int ifattack = 1;	//是否可攻击
	int ifturn = 1;	//是否为它的回合
	int ifalive = 1;	//是否死亡
	
	public void ChangeP(int x,int y)	//改变位置
	{
		Position[0] = x;
		Position[1] = y;
	}
	public int []GetP()		//返回当前位置
	{
		return Position;
	}
	void ifHeroDie()		//是否死亡
	{
		if(HP<=0)	ifalive = 0;
	}
	public int ifwork()		//是否存活
	{
		if(ifalive==0)	return 0;
		else	return 1;
	}
	int ifMP()			//是否有蓝
	{
		if(MP<=0)	return 0;
		else	return 1;
	}
	public int getifmove()
	{
		return ifmove;
	}
	public int getifattack()
	{
		return ifattack;
	}
	public void moved()		//已经移动
	{
		ifmove = 0;
	}
	public void attacked()		//已经攻击
	{
		ifattack = 0;
	}
	void reset()		//初始化攻击和移动
	{
		ifmove = 1;
		ifattack = 1;
	}
	public char getname()
	{
		return Name;
	}
	public void gethurt(char how)
	{
		if(ifwork()==1)
		{
			if(how=='F')
			{
				HP=HP-2;
				System.out.println("英雄"+Name+"受到2点伤害，剩下 "+HP+" HP");
			}
			if(how=='M')
			{
				HP=HP-3;
				System.out.println("英雄"+Name+"受到3点伤害，剩下 "+HP+" HP");
			}
			if(how=='T')
			{
				HP=HP-4;
				System.out.println("英雄"+Name+"受到4点伤害，剩下 "+HP+" HP");
			}
			ifHeroDie();
			if(ifwork()==0)
			{
				System.out.println("英雄"+Name+"死亡");
			}
		}
		else
		{
			
		}
	}
}

