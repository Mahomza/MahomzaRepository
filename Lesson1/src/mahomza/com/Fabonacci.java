package mahomza.com;

public class Fabonacci {

	//Author: Alex Mahomana
public static void  main (String[] args)
{
	String results = fibonacci(10);	
	//Print Fibonacci numbers
	System.out.println(results);
}

public static String fibonacci(int num)
{
	StringBuffer sb=new StringBuffer();
	int a =0;
	int b =1;
	int calc=0;
	//append value of A
	sb.append(a +",");
	//append value of B
	sb.append(b);
	
	for (int i =1 ; i<num; i++)
	{
		
		calc = a+b;
		//append value of A + B
		sb.append(","+calc);
		//re-assign value of B to A variable
		a=b;
		//re-assign value of A+B to B variable
		b=calc;
	}
	
	return  sb.toString();
}
}
