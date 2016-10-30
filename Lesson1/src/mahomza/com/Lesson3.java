package mahomza.com;

import java.util.ArrayList;

public class Lesson3 {

	public static void main(String[] args) 
	{
		int[] input={4,55,6,99};
		int[] nums = arrangeNumbers (input);
		
		String results="";
		for (int x : nums)
		{
			results +=x;
		}
		
		System.out.println(results);

	}
	
	public static int[] arrangeNumbers (int[] numbers)
	{
		int c= numbers.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> arrayNums = new ArrayList<Integer>();
		
		for( int x : numbers)
		{
			arrayNums.add(x);
			
		}
		
		
		while(c >0)
		{
			
			int num=arrayNums.get(0);
			
			for(int i : arrayNums)
			{
				
				
				if (num < i)
				{
					num = i;
				}
				
			}
			
			list.add(num);
			arrayNums.remove(arrayNums.indexOf(num));
			c--;
		}
	
	    int [] arrangedNumbers = new int[list.size()];
	    int pos =0;
		for (int x : list)
		{

			arrangedNumbers[pos] = x;
			pos++;
			
		}
	
		return arrangedNumbers;
	}

}
