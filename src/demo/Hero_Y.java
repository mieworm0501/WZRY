package demo;

public class Hero_Y extends BasicHero
{
	public Hero_Y()
	{
		Name = 'Y';
		HP = 20;
		MP = 5;
		EXP = 0;
		Position[0] = 1;
		Position[1] = 9;
	}
	void getinfor()
	{
		System.out.println("гЂал"+Name+"HP = "+HP+"/20 ; MP ="+MP+"/5 ; EXP ="+EXP+"/60 ;");
	}
}