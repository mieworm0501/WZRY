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
	int ifalive = 1;
	
	void ifHeroDie()
	{
		if(HP<=0)	ifalive = 0;
	}
	int ifMP()
	{
		if(MP<=0)	return 0;
		else	return 1;
	}
}

