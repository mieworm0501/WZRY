package demo;

public class Hero_B extends BasicHero implements Runnable
{
	public Hero_B()
	{
		Name = 'B';
		HP = 20;
		MP = 5;
		EXP = 0;
		Position[0] = 3;
		Position[1] = 3;
		LastP[0] = Position[0];
		LastP[1] = Position[1];
	}
	void getinfor()
	{
		System.out.println("гЂал"+Name+"HP = "+HP+"/20 ; MP ="+MP+"/5 ; EXP ="+EXP+"/60 ;");
	}
	public void run() {}
	/*public void run()
	{
		int Step = 0;
		while(ifwork()==1)
		{
			synchronized(this)
			{
				Step = (int) ((Math.random()*2.9)-1.5);
				if(Position[0]+Step>=0&&Position[0]<=5)	
				{
					LastP[0] = Position[0];
					Position[0]=Position[0]+Step;
				}
				Step = (int) ((Math.random()*2.9)-1.5);
				if(Position[1]+Step>=0&&Position[1]<=9)	
				{
					LastP[1] = Position[1];
					Position[1]=Position[1]+Step;
				}
				notifyAll();
				try {wait();} 
				catch (InterruptedException e) {}
			}
			
		}
	}*/
}
