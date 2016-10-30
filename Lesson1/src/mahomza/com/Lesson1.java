package mahomza.com;

import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        //double s=scan.nextDouble();
        String a;
        String b;
        System.out.println("Enter String A :");
        a = scan.nextLine();
        System.out.println("Enter String B :");
        b = scan.nextLine();

        String rs = mergeStrings(a,b);

      //Test Results
        System.out.println("Results :" +rs);

	}

	
	 public static String mergeStrings(String a, String b)
	    {
	        char[] arrayA=a.toCharArray();
	        char[] arrayB=b.toCharArray();

	        StringBuffer sb=new StringBuffer();
	        int cnt=0;
	        if(arrayA.length > arrayB.length)
	        {
	        	
	            for (char z : arrayB)
	            {
	                if (cnt<arrayA.length)
	                {
	                    sb.append(arrayA[cnt]);
	                    cnt++;
	                }

	                sb.append(z);
	            }

	        }
	        else
	        {
	            for(char z: arrayA)
	            {
	                sb.append(z);
	                
	                if(cnt<arrayB.length)
	                {
	                	System.out.println("COunter : "+ cnt);
	                    sb.append(arrayB[cnt]);
	                    cnt++;
	                }
	            }

	        }
	       return sb.toString();
	    }
}
