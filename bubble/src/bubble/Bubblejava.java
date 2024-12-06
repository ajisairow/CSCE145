package bubble;

public class Bubblejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,2,1,3,5};
		
		boolean hasSwapped = true;
		
		while(hasSwapped)
		{
			hasSwapped = false;
			
		for(int i = 0; i < array.length - 1; i++)
		{
			if(array[i] > array[i+1])
			{
				hasSwapped =  true;
			
				int temp = array[1];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}

	}
	for(int i = 0; i < array.length; i++);
}
}