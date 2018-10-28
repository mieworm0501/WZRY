package demo;

public class Hero_A extends BasicHero
{
	public Hero_A()		//≥ı ºªØ”¢–€A
	{
		Name = 'A';
		HP = 10;
		MP = 10;
		EXP = 0;
		Position[0] = 0;
		Position[1] = 0;
	}
	void getinfor()
	{
		System.out.println("”¢–€"+Name+"HP = "+HP+"/10 ; MP ="+MP+"/10 ; EXP ="+EXP+"/60 ;");
	}
}
