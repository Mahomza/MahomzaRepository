package mahomza.com;

import java.util.ArrayList;


public class Lesson2 {

	public static void main(String[] args) {
		
		String[] a ={"825/1161","1092/1041"};
		reduceFraction (a);

	}

	
	public static String[] reduceFraction(String[] fractions)
	{
	
		String[] fraction =null;
		//StringBuffer sb=new StringBuffer();
	   ArrayList<String> list = new ArrayList<String>();
	   
	   for (String x : fractions)
		{
			fraction = x.split("/");
			
			if(fraction.length == 2)
			{
					int a= Integer.valueOf(fraction[0]);
					int b= Integer.valueOf(fraction[1]);
					
					int c=0;
					
					if (a > b)
					{
						c = b;
					}else
					{
						c = a;
					}
					
					while (c > 0)
					{
						if ( a % c == 0 && b % c ==0)
						{
							break;
						}
						c--;
						
					}
					
					//sb.append(a/c + "/" + b/c);
					list.add(a/c + "/" + b/c);
					
			}
			
		}
		
		int y = list.size();
		String[] resultsFraction= new String[y];
		
		for (int i =0; i < list.size();i++)
		{
			resultsFraction[i] = list.get(i);
			System.out.println(resultsFraction[i]);
		}
		
		
		return resultsFraction;
	}
}
