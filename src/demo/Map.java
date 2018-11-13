package demo;

public class Map extends BasicMap 
{
	int []MidP = {0,0};
	Hero_A A = new Hero_A();
	Hero_B B = new Hero_B();
	Hero_Z Z = new Hero_Z();
	Hero_Y Y = new Hero_Y();
	getPosition gP;
	getIfmove gIm;
	getName gN;
	changePosition cP;
	Moved Mov;
	Attacked Att;
	getHurt gH;
	getIfwork gIw;
	getIfattack gIa;
	GetMP gM;
	UseMP uM;
	public Map()
	{
		ReMap();
		GetHeroP();
	}
	
	void GetHeroP()				//初始化英雄位置
	{
		MidP = A.GetP();
		map[MidP[0]][MidP[1]][0]='A';
		MidP = B.GetP();
		map[MidP[0]][MidP[1]][0]='B';
		MidP = Z.GetP();
		map[MidP[0]][MidP[1]][0]='Z';
		MidP = Y.GetP();
		map[MidP[0]][MidP[1]][0]='Y';
	}
	
	int ChangeP(char one,int x,int y)		//移动英雄位置
	{
		if(x>5||y>9)
			System.out.println("未成功移动，请重新输入");
		else
		{
			if((one<'A'||one>'E')&&(one<'V'||one>'Z'))
			{
				System.out.println("场上无此英雄，请输入其他指令");
				return 0;
			}
			if(one=='A')
			{gP = A;gIm = A;gN = A;cP = A;Mov = A;}
			if(one=='B')
			{gP = B;gIm = B;gN = B;cP = B;Mov = B;}
			if(one=='Z')
			{gP = Z;gIm = Z;gN = Z;cP = Z;Mov = Z;}
			if(one=='Y')
			{gP = Y;gIm = Y;gN = Y;cP = Y;Mov = Y;}
			MidP = gP.GetP();
			if(gIm.getifmove()==1)
			{
				if(Math.abs(x-MidP[0])>3||Math.abs(y-MidP[1])>3)
					System.out.println("未成功移动，请重新输入");
				else
				{
					if(map[x][y][0]=='0')
					{
						map[x][y][0]=gN.getname();
						map[MidP[0]][MidP[1]][0]='0';
						cP.ChangeP(x, y);
						Mov.moved();
					}
					else	System.out.println("未成功移动，请重新输入");
				}
			}
			else	System.out.println("该英雄已经移动过了，请输入其他指令");
		}
		return 0;
	}
	
	void attackT(char where,int []Mid)
	{
		if(where=='W')
		{
			if((MidP[0]-1)>=0)
			{
				map[MidP[0]-1][MidP[1]][1]='T';
				Show();
				getH();
				map[MidP[0]-1][MidP[1]][1]='0';
			}
		}
		else
		if(where=='A')
		{
			if((MidP[1]-1)>=0)
			{
				map[MidP[0]][MidP[1]-1][1]='T';
				Show();
				getH();
				map[MidP[0]][MidP[1]-1][1]='0';
			}
		}
		else
		if(where=='S')
		{
			if((MidP[0]+1)<=5)
			{
				map[MidP[0]+1][MidP[1]][1]='T';
				Show();
				getH();
				map[MidP[0]+1][MidP[1]][1]='0';
			}
		}
		else
		if(where=='D')
		{
			if((MidP[1]+1)<=9)
			{
				map[MidP[0]][MidP[1]+1][1]='T';
				Show();
				getH();
				map[MidP[0]][MidP[1]+1][1]='0';
			}
		}
		else
		{
			System.out.println("攻击方向选取错误，请重新输入");
		}
	}
	
	void attackF(char where,int []MidP)
	{
		if(where=='W')
		{
			attackFW(MidP);
		}
		else
		if(where=='A')
		{
			attackFA(MidP);
		}
		else
		if(where=='S')
		{
			attackFS(MidP);
		}
		else
		if(where=='D')
		{
			attackFD(MidP);
		}
		else
		{
			System.out.println("攻击方向选取错误，请重新输入");
		}
	}
	
	void attackFW(int []MidP)
	{
		if((MidP[0]-1)>=0)
		{
			map[MidP[0]-1][MidP[1]][1]='F';
			Show();
			getH();
			map[MidP[0]-1][MidP[1]][1]='0';
			if(MidP[0]-2>=0)
			{
				map[MidP[0]-2][MidP[1]][1]='F';
				if(MidP[1]-1>=0)	map[MidP[0]-2][MidP[1]-1][1]='F';
				if(MidP[1]+1<=9)	map[MidP[0]-2][MidP[1]+1][1]='F';
				Show();
				getH();
				map[MidP[0]-2][MidP[1]][1]='0';
				if(MidP[1]-1>=0)	map[MidP[0]-2][MidP[1]-1][1]='0';
				if(MidP[1]+1<=9)	map[MidP[0]-2][MidP[1]+1][1]='0';
				if(MidP[0]-3>=0)
				{
					map[MidP[0]-3][MidP[1]][1]='F';
					if(MidP[1]-1>=0)	map[MidP[0]-3][MidP[1]-1][1]='F';
					if(MidP[1]+1<=9)	map[MidP[0]-3][MidP[1]+1][1]='F';
					if(MidP[1]-2>=0)	map[MidP[0]-3][MidP[1]-2][1]='F';
					if(MidP[1]+2<=9)	map[MidP[0]-3][MidP[1]+2][1]='F';
					Show();
					getH();
					map[MidP[0]-3][MidP[1]][1]='0';
					if(MidP[1]-1>=0)	map[MidP[0]-3][MidP[1]-1][1]='0';
					if(MidP[1]+1<=9)	map[MidP[0]-3][MidP[1]+1][1]='0';
					if(MidP[1]-2>=0)	map[MidP[0]-3][MidP[1]-2][1]='0';
					if(MidP[1]+2<=9)	map[MidP[0]-3][MidP[1]+2][1]='0';
				}
			}
		}
	}
	
	void attackFA(int []MidP)
	{
		if((MidP[1]-1)>=0)
		{
			map[MidP[0]][MidP[1]-1][1]='F';
			Show();
			getH();
			map[MidP[0]][MidP[1]-1][1]='0';
			if(MidP[1]-2>=0)
			{
				map[MidP[0]][MidP[1]-2][1]='F';
				if(MidP[0]+1<=5)	map[MidP[0]+1][MidP[1]-2][1]='F';
				if(MidP[0]-1>=0)	map[MidP[0]-1][MidP[1]-2][1]='F';
				Show();
				getH();
				map[MidP[0]][MidP[1]-2][1]='0';
				if(MidP[0]+1<=5)	map[MidP[0]+1][MidP[1]-2][1]='0';
				if(MidP[0]-1>=0)	map[MidP[0]-1][MidP[1]-2][1]='0';
				if(MidP[1]-3>=0)
				{
					map[MidP[0]][MidP[1]-3][1]='F';
					if(MidP[0]+1<=5)	map[MidP[0]+1][MidP[1]-3][1]='F';
					if(MidP[0]-1>=0)	map[MidP[0]-1][MidP[1]-3][1]='F';
					if(MidP[0]+2<=5)	map[MidP[0]+2][MidP[1]-3][1]='F';
					if(MidP[0]-2>=0)	map[MidP[0]-2][MidP[1]-3][1]='F';
					Show();
					getH();
					map[MidP[0]][MidP[1]-3][1]='0';
					if(MidP[0]+1<=5)	map[MidP[0]+1][MidP[1]-3][1]='0';
					if(MidP[0]-1>=0)	map[MidP[0]-1][MidP[1]-3][1]='0';
					if(MidP[0]+2<=5)	map[MidP[0]+2][MidP[1]-3][1]='0';
					if(MidP[0]-2>=0)	map[MidP[0]-2][MidP[1]-3][1]='0';
				}
			}
		}
	}
	
	void attackFS(int []MidP)
	{
		if((MidP[0]+1)<=5)
		{
			map[MidP[0]+1][MidP[1]][1]='F';
			Show();
			getH();
			map[MidP[0]+1][MidP[1]][1]='0';
			if(MidP[0]+2<=5)
			{
				map[MidP[0]+2][MidP[1]][1]='F';
				if(MidP[1]-1>=0)	map[MidP[0]+2][MidP[1]-1][1]='F';
				if(MidP[1]+1<=9)	map[MidP[0]+2][MidP[1]+1][1]='F';
				Show();
				getH();
				map[MidP[0]+2][MidP[1]][1]='0';
				if(MidP[1]-1>=0)	map[MidP[0]+2][MidP[1]-1][1]='0';
				if(MidP[1]+1<=9)	map[MidP[0]+2][MidP[1]+1][1]='0';
				if(MidP[0]+3<=5)
				{
					map[MidP[0]+3][MidP[1]][1]='F';
					if(MidP[1]-1>=0)	map[MidP[0]+3][MidP[1]-1][1]='F';
					if(MidP[1]+1<=9)	map[MidP[0]+3][MidP[1]+1][1]='F';
					if(MidP[1]-2>=0)	map[MidP[0]+3][MidP[1]-2][1]='F';
					if(MidP[1]+2<=9)	map[MidP[0]+3][MidP[1]+2][1]='F';
					Show();
					getH();
					map[MidP[0]+3][MidP[1]][1]='0';
					if(MidP[1]-1>=0)	map[MidP[0]+3][MidP[1]-1][1]='0';
					if(MidP[1]+1<=9)	map[MidP[0]+3][MidP[1]+1][1]='0';
					if(MidP[1]-2>=0)	map[MidP[0]+3][MidP[1]-2][1]='0';
					if(MidP[1]+2<=9)	map[MidP[0]+3][MidP[1]+2][1]='0';
				}
			}
		}
	}
	
	void attackFD(int []MidP)
	{
		if((MidP[1]+1)<=9)
		{
			map[MidP[0]][MidP[1]+1][1]='F';
			Show();
			getH();
			map[MidP[0]][MidP[1]+1][1]='0';
			if(MidP[1]+2<=9)
			{
				map[MidP[0]][MidP[1]+2][1]='F';
				if(MidP[0]+1<=5)	map[MidP[0]+1][MidP[1]+2][1]='F';
				if(MidP[0]-1>=0)	map[MidP[0]-1][MidP[1]+2][1]='F';
				Show();
				getH();
				map[MidP[0]][MidP[1]+2][1]='0';
				if(MidP[0]+1<=5)	map[MidP[0]+1][MidP[1]+2][1]='0';
				if(MidP[0]-1>=0)	map[MidP[0]-1][MidP[1]+2][1]='0';
				if(MidP[1]+3<=9)
				{
					map[MidP[0]][MidP[1]+3][1]='F';
					if(MidP[0]+1<=5)	map[MidP[0]+1][MidP[1]+3][1]='F';
					if(MidP[0]-1>=0)	map[MidP[0]-1][MidP[1]+3][1]='F';
					if(MidP[0]+2<=5)	map[MidP[0]+2][MidP[1]+3][1]='F';
					if(MidP[0]-2>=0)	map[MidP[0]-2][MidP[1]+3][1]='F';
					Show();
					getH();
					map[MidP[0]][MidP[1]+3][1]='0';
					if(MidP[0]+1<=5)	map[MidP[0]+1][MidP[1]+3][1]='0';
					if(MidP[0]-1>=0)	map[MidP[0]-1][MidP[1]+3][1]='0';
					if(MidP[0]+2<=5)	map[MidP[0]+2][MidP[1]+3][1]='0';
					if(MidP[0]-2>=0)	map[MidP[0]-2][MidP[1]+3][1]='0';
				}
			}
		}
	}
	
	void attackM(int []MidP)
	{
		if((MidP[1]+1)<=9)
		{
			map[MidP[0]][MidP[1]+1][1]='M';
			if(MidP[0]+1<=5)	map[MidP[0]+1][MidP[1]+1][1]='M';
			if(MidP[0]-1>=0)	map[MidP[0]-1][MidP[1]+1][1]='M';
		}
		if(MidP[1]-1>=0)
		{
			map[MidP[0]][MidP[1]-1][1]='M';
			if(MidP[0]+1<=5)	map[MidP[0]+1][MidP[1]-1][1]='M';
			if(MidP[0]-1>=0)	map[MidP[0]-1][MidP[1]-1][1]='M';
		}
		if((MidP[0]+1)<=5)	map[MidP[0]+1][MidP[1]][1]='M';
		if((MidP[0]-1)>=0)	map[MidP[0]-1][MidP[1]][1]='M';
		Show();
		getH();
		if((MidP[1]+1)<=9)
		{
			map[MidP[0]][MidP[1]+1][1]='0';
			if(MidP[0]+1<=5)	map[MidP[0]+1][MidP[1]+1][1]='0';
			if(MidP[0]-1>=0)	map[MidP[0]-1][MidP[1]+1][1]='0';
		}
		if(MidP[1]-1>=0)
		{
			map[MidP[0]][MidP[1]-1][1]='0';
			if(MidP[0]+1<=5)	map[MidP[0]+1][MidP[1]-1][1]='0';
			if(MidP[0]-1>=0)	map[MidP[0]-1][MidP[1]-1][1]='0';
		}
		if((MidP[0]+1)<=5)	map[MidP[0]+1][MidP[1]][1]='0';
		if((MidP[0]-1)>=0)	map[MidP[0]-1][MidP[1]][1]='0';
	}
	
	int subAttack(char one,char how,char where)		//英雄攻击
	{
		if((one<'A'||one>'E')&&(one<'V'||one>'Z'))
		{
			System.out.println("场上无此英雄，请输入其他指令");
			return 0;
		}
		if(one=='A')
		{gP = A;Att = A;gIa = A;gM = A;uM = A;}
		if(one=='B')
		{gP = B;Att = B;gIa = B;gM = B;uM = B;}
		if(one=='Z')
		{gP = Z;Att = Z;gIa = Z;gM = Z;uM = Z;}
		if(one=='Y')
		{gP = Y;Att = Y;gIa = Y;gM = Y;uM = Y;}
		MidP = gP.GetP();
		if(gIa.getifattack()==0)
		{System.out.println("该英雄已经攻击过了，请输入其他指令");return 0;}
		if(how!='F'&&how!='T'&&how!='M')
		{System.out.println("无此攻击技能，请输入其他指令");return 0;}
		if(where!='W'&&where!='A'&&where!='S'&&where!='D')
		{System.out.println("攻击方向有误，请输入其他指令");return 0;}
		if(how=='T')
		{
			attackT(where,MidP);
			Att.attacked();
			ifHeroalive();
		}
		if(how=='F')
		{
			if(gM.getMP()==0)
			{System.out.println("该英雄MP不足，请输入其他指令");return 0;}
			attackF(where,MidP);
			Att.attacked();
			ifHeroalive();
			uM.useMP();
		}
		if(how=='M')
		{
			if(gM.getMP()==0)
			{System.out.println("该英雄MP不足，请输入其他指令");return 0;}
			attackM(MidP);
			Att.attacked();
			ifHeroalive();
			uM.useMP();
		}
		A.getinfor();B.getinfor();Z.getinfor();Y.getinfor();return 0;
	}
	
	void getH()
	{
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(map[i][j][1]=='T')
				{
					if(map[i][j][0]=='A')	
					{gH = A;gIw = A;gH.gethurt('T');}
					if(map[i][j][0]=='B')	
					{gH = B;gIw = B;gH.gethurt('T');}
					if(map[i][j][0]=='Z')
					{gH = Z;gIw = Z;gH.gethurt('T');}
					if(map[i][j][0]=='Y')
					{gH = Y;gIw = Y;gH.gethurt('T');}
				}
				if(map[i][j][1]=='F')
				{
					if(map[i][j][0]=='A')	
					{gH = A;gIw = A;gH.gethurt('F');}
					if(map[i][j][0]=='B')	
					{gH = B;gIw = B;gH.gethurt('F');}
					if(map[i][j][0]=='Z')
					{gH = Z;gIw = Z;gH.gethurt('F');}
					if(map[i][j][0]=='Y')
					{gH = Y;gIw = Y;gH.gethurt('F');}
				}
				if(map[i][j][1]=='M')
				{
					if(map[i][j][0]=='A')	
					{gH = A;gIw = A;gH.gethurt('M');}
					if(map[i][j][0]=='B')	
					{gH = B;gIw = B;gH.gethurt('M');}
					if(map[i][j][0]=='Z')
					{gH = Z;gIw = Z;gH.gethurt('M');}
					if(map[i][j][0]=='Y')
					{gH = Y;gIw = Y;gH.gethurt('M');}
				}
				
			}
		}
	}
	
	void ifHeroalive()
	{
		int []Po = {0,0};
		if(A.ifwork()==0)
		{
			Po = A.GetP();
			map[Po[0]][Po[1]][0] = '#';
		}
		if(B.ifwork()==0)
		{
			Po = B.GetP();
			map[Po[0]][Po[1]][0] = '#';
		}
		if(Z.ifwork()==0)
		{
			Po = Z.GetP();
			map[Po[0]][Po[1]][0] = '#';
		}
		if(Y.ifwork()==0)
		{
			Po = Y.GetP();
			map[Po[0]][Po[1]][0] = '#';
		}
	}
	
	void resetHero()	//回合结束，重置英雄移动和攻击
	{
		A.reset();
		B.reset();
		Y.reset();
		Z.reset();
		A.addEXP();
		B.addEXP();
		Z.addEXP();
		Y.addEXP();
		A.getinfor();
		B.getinfor();
		Z.getinfor();
		Y.getinfor();
	}
}