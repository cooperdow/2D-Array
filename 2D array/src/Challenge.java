import java.util.Scanner;
public class Challenge {
public static void main(String[] args)
	{
	//numberList();
	//schoolName();
	boxNumbers();
	}
	public static void numberList()
		{
		int numberList[][]={{10,20},{30,40},{50,60}};
		System.out.println(numberList[2][1]);
		}
	public static void schoolName()
		{
		String schoolName[][]=new String[4][3];
			{
			for(int i=0; i<schoolName.length; i++)
				{
				for(int j=0; j<schoolName[0].length; j++)
					{
					System.out.print(schoolName[i][j]="MHS ");
					}
				System.out.println();
				}
			}
		}
	public static void boxNumbers()
		{
		int boxNumbers[][]=new int[3][3];
		int counter=1;
			{
			for(int i=0; i<boxNumbers.length; i++)
				{
				for(int j=0; j<boxNumbers[0].length; j++)
					{
					boxNumbers[i][j]=counter;					
					System.out.print(counter + " ");
					counter++;
					}
				System.out.println();		
				}
			}
		}
	}
