package demo;

public class Map extends BasicMap
{
	int []MidP = {0,0};
	Hero_A A = new Hero_A();
	public Map()
	{
		ReMap();
		GetHeroP();
	}
	void GetHeroP()
	{
		MidP = A.GetP();
		map[MidP[0]][MidP[1]][0]='A';
	}
	void ChangeP(int x,int y)
	{
		MidP = A.GetP();
		if(map[x][y][0]=='0')
		{
			map[x][y][0]='A';
			map[MidP[0]][MidP[1]][0]='0';
			A.ChangeP(x, y);
		}
	}
}