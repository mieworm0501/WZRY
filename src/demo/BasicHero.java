package demo;

public class BasicHero {
	int HP;			//Ѫ��
	int MP;			//����
	int EXP;		//����
	char Name;		//���֣��ô�Сд��ĸ��ʾ
	int []Position = new int [2];	//λ�ã�����
	int ifmove = 1;	//�Ƿ���ƶ�
	int ifattack = 1;	//�Ƿ�ɹ���
	int ifturn = 1;	//�Ƿ�Ϊ���Ļغ�
	int ifalive = 1;	//�Ƿ�����
	
	void ChangeP(int x,int y)	//�ı�λ��
	{
		Position[0] = x;
		Position[1] = y;
	}
	int []GetP()		//���ص�ǰλ��
	{
		return Position;
	}
	void ifHeroDie()		//�Ƿ�����
	{
		if(HP<=0)	ifalive = 0;
	}
	int ifwork()		//�Ƿ���
	{
		if(ifalive==0)	return 0;
		else	return 1;
	}
	int ifMP()			//�Ƿ�����
	{
		if(MP<=0)	return 0;
		else	return 1;
	}
	void moved()		//�Ѿ��ƶ�
	{
		ifmove = 0;
	}
	void attacked()		//�Ѿ�����
	{
		ifattack = 0;
	}
	void reset()		//��ʼ���������ƶ�
	{
		ifmove = 1;
		ifattack = 1;
	}
}

