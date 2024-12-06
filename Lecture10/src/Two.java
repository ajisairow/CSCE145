package Lecture 10;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 arrays of size 2 stored in array
		int[][] array = new int [2][3];
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				array[i][j] = i+j;
			}
		}
		
		for(int i = 0; i < array[i].length; i++)
		{
				for(int j = 0; j < array[i].length; j++)
				{
					System.out.println(array[i][j]);
				}
		}
		//i=0
			//j = 0
				//array[0][0] = i+j;
				//j = 1
					//array[0][1] = i+j;
				//j = 2
					//...
			//i = 1
				//j = 0 
					//...
				//j = 1
					//...
				//j = 2
					//...
	}
}