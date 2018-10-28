package demo;

public class Hero_B extends BasicHero
{
	public Hero_B()
	{
		Name = 'B';
		HP = 20;
		MP = 5;
		EXP = 0;
		Position[0] = 1;
		Position[1] = 0;
	}
	void getinfor()
	{
		System.out.println("гЂал"+Name+"HP = "+HP+"/20 ; MP ="+MP+"/5 ; EXP ="+EXP+"/60 ;");
	}
}
