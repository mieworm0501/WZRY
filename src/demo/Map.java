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
	
	void GetHeroP()				//��ʼ��Ӣ��λ��
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
	
	void ChangeP(char one,int x,int y)		//�ƶ�Ӣ��λ��
	{
		if(x>5||y>9)
		{
			System.out.println("δ�ɹ��ƶ�������������");
		}
		else
		{
			if(one=='A')
			{
				MidP = A.GetP();
				if(A.ifmove==1)
				{
					if(Math.abs(x-MidP[0])>3||Math.abs(y-MidP[1])>3)
						System.out.println("δ�ɹ��ƶ�������������");
					else
					{
						if(map[x][y][0]=='0')
						{
							map[x][y][0]='A';
							map[MidP[0]][MidP[1]][0]='0';
							A.ChangeP(x, y);
							A.moved();
						}
						else	System.out.println("δ�ɹ��ƶ�������������");
					}
				}
				else
				{
					System.out.println("��Ӣ���Ѿ��ƶ����ˣ�����������ָ��");
				}
			}
			if(one=='B')
			{
				MidP = B.GetP();
				if(B.ifmove==1)
				{
					if(Math.abs(x-MidP[0])>3||Math.abs(y-MidP[1])>3)
						System.out.println("δ�ɹ��ƶ�������������");
					else
					{
						if(map[x][y][0]=='0')
						{
							map[x][y][0]='B';
							map[MidP[0]][MidP[1]][0]='0';
							B.ChangeP(x, y);
							B.moved();
						}
						else	System.out.println("δ�ɹ��ƶ�������������");
					}
				}
				else
				{
					System.out.println("��Ӣ���Ѿ��ƶ����ˣ�����������ָ��");
				}
			}
			if(one=='Z')
			{
				MidP = Z.GetP();
				if(Z.ifmove==1)
				{
					if(Math.abs(x-MidP[0])>3||Math.abs(y-MidP[1])>3)
						System.out.println("δ�ɹ��ƶ�������������");
					else
					{
						if(map[x][y][0]=='0')
						{
							map[x][y][0]='Z';
							map[MidP[0]][MidP[1]][0]='0';
							Z.ChangeP(x, y);
							Z.moved();
						}
						else	System.out.println("δ�ɹ��ƶ�������������");
					}
				}
				else
				{
					System.out.println("��Ӣ���Ѿ��ƶ����ˣ�����������ָ��");
				}
			}
			if(one=='Y')
			{
				MidP = Y.GetP();
				if(Y.ifmove==1)
				{
					if(Math.abs(x-MidP[0])>3||Math.abs(y-MidP[1])>3)
						System.out.println("δ�ɹ��ƶ�������������");
					else
					{
						if(map[x][y][0]=='0')
						{
							map[x][y][0]='Y';
							map[MidP[0]][MidP[1]][0]='0';
							Y.ChangeP(x, y);
							Y.moved();
						}
						else	System.out.println("δ�ɹ��ƶ�������������");
					}
				}
				else
				{
					System.out.println("��Ӣ���Ѿ��ƶ����ˣ�����������ָ��");
				}
			}
			if((one<'A'||one>'E')&&(one<'V'||one>'Z'))
			{
				System.out.println("�����޴�Ӣ�ۣ�����������ָ��");
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
					System.out.println("��������ѡȡ��������������");
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
					System.out.println("��������ѡȡ��������������");
				}
			}
		}
	}
	
	void resetHero()	//�غϽ���������Ӣ���ƶ��͹���
	{
		A.reset();
		B.reset();
		Y.reset();
		Z.reset();
	}
}