package demo;

public class BasicHero implements getPosition,getIfmove,getName,changePosition,Moved,Attacked,getHurt,getIfwork,getIfattack {
	int HP;			//Ѫ��
	int MP;			//����
	int EXP;		//����
	char Name;		//���֣��ô�Сд��ĸ��ʾ
	int []Position = new int [2];	//λ�ã�����
	int ifmove = 1;	//�Ƿ���ƶ�
	int ifattack = 1;	//�Ƿ�ɹ���
	int ifturn = 1;	//�Ƿ�Ϊ���Ļغ�
	int ifalive = 1;	//�Ƿ�����
	
	public void ChangeP(int x,int y)	//�ı�λ��
	{
		Position[0] = x;
		Position[1] = y;
	}
	public int []GetP()		//���ص�ǰλ��
	{
		return Position;
	}
	void ifHeroDie()		//�Ƿ�����
	{
		if(HP<=0)	ifalive = 0;
	}
	public int ifwork()		//�Ƿ���
	{
		if(ifalive==0)	return 0;
		else	return 1;
	}
	int ifMP()			//�Ƿ�����
	{
		if(MP<=0)	return 0;
		else	return 1;
	}
	public int getifmove()
	{
		return ifmove;
	}
	public int getifattack()
	{
		return ifattack;
	}
	public void moved()		//�Ѿ��ƶ�
	{
		ifmove = 0;
	}
	public void attacked()		//�Ѿ�����
	{
		ifattack = 0;
	}
	void reset()		//��ʼ���������ƶ�
	{
		ifmove = 1;
		ifattack = 1;
	}
	public char getname()
	{
		return Name;
	}
	public void gethurt(char how)
	{
		if(ifwork()==1)
		{
			if(how=='F')
			{
				HP=HP-2;
				System.out.println("Ӣ��"+Name+"�ܵ�2���˺���ʣ�� "+HP+" HP");
			}
			if(how=='M')
			{
				HP=HP-3;
				System.out.println("Ӣ��"+Name+"�ܵ�3���˺���ʣ�� "+HP+" HP");
			}
			if(how=='T')
			{
				HP=HP-4;
				System.out.println("Ӣ��"+Name+"�ܵ�4���˺���ʣ�� "+HP+" HP");
			}
			ifHeroDie();
			if(ifwork()==0)
			{
				System.out.println("Ӣ��"+Name+"����");
			}
		}
		else
		{
			
		}
	}
}

