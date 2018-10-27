package demo;

public class Map extends BasicMap
{
	int []MidP = {0,0};
	Hero_A A = new Hero_A();
	Hero_B B = new Hero_B();
	Hero_Z Z = new Hero_Z();
	Hero_Y Y = new Hero_Y();
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
	
	void ChangeP(char one,int x,int y)		//移动英雄位置
	{
		if(x>5||y>9)
		{
			System.out.println("未成功移动，请重新输入");
		}
		else
		{
			if(one=='A')
			{
				MidP = A.GetP();
				if(A.ifmove==1)
				{
					if(Math.abs(x-MidP[0])>3||Math.abs(y-MidP[1])>3)
						System.out.println("未成功移动，请重新输入");
					else
					{
						if(map[x][y][0]=='0')
						{
							map[x][y][0]='A';
							map[MidP[0]][MidP[1]][0]='0';
							A.ChangeP(x, y);
							A.moved();
						}
						else	System.out.println("未成功移动，请重新输入");
					}
				}
				else
				{
					System.out.println("该英雄已经移动过了，请输入其他指令");
				}
			}
			if(one=='B')
			{
				MidP = B.GetP();
				if(B.ifmove==1)
				{
					if(Math.abs(x-MidP[0])>3||Math.abs(y-MidP[1])>3)
						System.out.println("未成功移动，请重新输入");
					else
					{
						if(map[x][y][0]=='0')
						{
							map[x][y][0]='B';
							map[MidP[0]][MidP[1]][0]='0';
							B.ChangeP(x, y);
							B.moved();
						}
						else	System.out.println("未成功移动，请重新输入");
					}
				}
				else
				{
					System.out.println("该英雄已经移动过了，请输入其他指令");
				}
			}
			if(one=='Z')
			{
				MidP = Z.GetP();
				if(Z.ifmove==1)
				{
					if(Math.abs(x-MidP[0])>3||Math.abs(y-MidP[1])>3)
						System.out.println("未成功移动，请重新输入");
					else
					{
						if(map[x][y][0]=='0')
						{
							map[x][y][0]='Z';
							map[MidP[0]][MidP[1]][0]='0';
							Z.ChangeP(x, y);
							Z.moved();
						}
						else	System.out.println("未成功移动，请重新输入");
					}
				}
				else
				{
					System.out.println("该英雄已经移动过了，请输入其他指令");
				}
			}
			if(one=='Y')
			{
				MidP = Y.GetP();
				if(Y.ifmove==1)
				{
					if(Math.abs(x-MidP[0])>3||Math.abs(y-MidP[1])>3)
						System.out.println("未成功移动，请重新输入");
					else
					{
						if(map[x][y][0]=='0')
						{
							map[x][y][0]='Y';
							map[MidP[0]][MidP[1]][0]='0';
							Y.ChangeP(x, y);
							Y.moved();
						}
						else	System.out.println("未成功移动，请重新输入");
					}
				}
				else
				{
					System.out.println("该英雄已经移动过了，请输入其他指令");
				}
			}
			if((one<'A'||one>'E')&&(one<'V'||one>'Z'))
			{
				System.out.println("场上无此英雄，请输入其他指令");
			}
		}
	}
	
	void subAttack(char one,char how,char where)
	{
		if(one=='A')
		{
			MidP = A.GetP();
			if(how=='T')
			{
				if(where=='W')
				{
					if((MidP[0]-1)>=0)
					{
						map[MidP[0]-1][MidP[1]][1]='T';
						Show();
						map[MidP[0]-1][MidP[1]][1]='0';
						Show();
					}
				}
				else
				if(where=='A')
				{
					if((MidP[1]-1)>=0)
					{
						map[MidP[0]][MidP[1]-1][1]='T';
						Show();
						map[MidP[0]][MidP[1]-1][1]='0';
						Show();
					}
				}
				else
				if(where=='S')
				{
					if((MidP[0]+1)<=5)
					{
						map[MidP[0]+1][MidP[1]][1]='T';
						Show();
						map[MidP[0]+1][MidP[1]][1]='0';
						Show();
					}
				}
				else
				if(where=='D')
				{
					if((MidP[1]+1)<=9)
					{
						map[MidP[0]][MidP[1]+1][1]='T';
						Show();
						map[MidP[0]][MidP[1]+1][1]='0';
						Show();
					}
				}
				else
				{
					System.out.println("攻击方向选取错误，请重新输入");
				}
			}
			if(how=='F')
			{
				if(where=='W')
				{
					map[MidP[0]-1][MidP[1]][1]='F';
					Show();
					map[MidP[0]-1][MidP[1]][1]='0';
					
					Show();
				}
				else
				if(where=='A')
				{
					map[MidP[0]][MidP[1]-1][1]='T';
					Show();
					map[MidP[0]][MidP[1]-1][1]='0';
					Show();
				}
				else
				if(where=='S')
				{
					map[MidP[0]+1][MidP[1]][1]='T';
					Show();
					map[MidP[0]+1][MidP[1]][1]='0';
					Show();
				}
				else
				if(where=='D')
				{
					map[MidP[0]][MidP[1]+1][1]='T';
					Show();
					map[MidP[0]][MidP[1]+1][1]='0';
					Show();
				}
				else
				{
					System.out.println("攻击方向选取错误，请重新输入");
				}
			}
		}
	}
	
	void resetHero()	//回合结束，重置英雄移动和攻击
	{
		A.reset();
		B.reset();
		Y.reset();
		Z.reset();
	}
}