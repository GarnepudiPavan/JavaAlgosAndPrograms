package com.daily.java;

import java.util.ArrayList;
import java.util.Collections;

public class StringCombinations {
	private static String a;
	private ArrayList<String> temp = new ArrayList<String>();

	public void combString() {
		int n = a.length() - 1;
		for (int i = 0; i <= n; i++) {
			//temp.add(new String(a.charAt(i) + ""));
			System.out.println("Combinations are"+" "+a.charAt(i) );
		}
		for (int i = 0; i <= n; i++) {

			for (int j = 0; j <=n-1; j++) {
				/*if (a.charAt(i) != a.charAt(j + 1))
					temp.add(a.charAt(i) + "" + a.charAt(j + 1));

			}*/
				System.out.println("Combinations are"+" "+a.charAt(i)+ "" + a.charAt(j + 1) );
				/*if(j<2){
				System.out.println("Combinations are"+" "+a.charAt(i)+ "" + a.charAt(j + 1)+ "" + a.charAt(j + 2) );
			}*/
			}
		}
	}

	public void combine() { combine( 0 ); }
    private void combine(int start ){
    	StringBuffer output = new StringBuffer();
        for( int i = start; i < a.length(); ++i ){
            output.append( a.charAt(i) );
            System.out.println( output );
            if ( i < a.length() )
            combine( i + 1);
            output.setLength( output.length() - 1 );
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCombinations obj1 = new StringCombinations();
		obj1.a = "abcde";
		obj1.combString();
		Collections.sort(obj1.temp);
		for (String s : obj1.temp) {
			System.out.println("String combinations are" + " " + s);
		}
		//obj1.combine(0);
	}

}
