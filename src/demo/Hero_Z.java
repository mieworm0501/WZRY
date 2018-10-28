package demo;

public class Hero_Z extends BasicHero
{
	public Hero_Z()
	{
		Name = 'Z';
		HP = 10;
		MP = 10;
		EXP = 0;
		Position[0] = 0;
		Position[1] = 9;
	}
	void getinfor()
	{
		System.out.println("гЂал"+Name+"HP = "+HP+"/10 ; MP ="+MP+"/10; EXP ="+EXP+"/50 ;");
	}
}