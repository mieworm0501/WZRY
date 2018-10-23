package demo;

public class Hero_A extends BasicHero
{
	public Hero_A()
	{
		Name = 'A';
		HP = 10;
		MP = 10;
		EXP = 0;
		Position[0] = 0;
		Position[1] = 0;
	}
	void ChangeP(int x,int y)
	{
		Position[0] = x;
		Position[1] = y;
	}
	int []GetP()
	{
		return Position;
	}
}
