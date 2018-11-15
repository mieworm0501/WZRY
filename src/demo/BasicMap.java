package demo;

public class BasicMap implements Runnable {
	char [][][]map = new char [6][10][2];
	public BasicMap()
	{
		ReMap();
	}
	void ReMap()
	{
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<10;j++)
			{
				map[i][j][0]='0';
				map[i][j][1]='0';
			}
		}
	}
	void Show()
	{
		for(int weight=0;weight<6;weight++)
		{
			System.out.println(" --- --- --- --- --- --- --- --- --- --- ");
			for(int length=0;length<10;length++)
			{
				System.out.print("|"+map[weight][length][0]+","+map[weight][length][1]);
			}
			System.out.println("| "+weight);
		}
		System.out.println(" --- --- --- --- --- --- --- --- --- --- ");
		System.out.println("  0   1   2   3   4   5   6   7   8   9  ");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}