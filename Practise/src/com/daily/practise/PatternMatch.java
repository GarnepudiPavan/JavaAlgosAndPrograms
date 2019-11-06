package Practise.src.com.daily.practise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PatternMatch {

    Map<String, Integer> patternMatch = new LinkedHashMap<String, Integer> ();

    public void patterMatchStringChar(String values) {
        int count = 1;
        String temp;
        System.out.println ( "Length of String is" + " " + values.length () );
        for (int i = 0; i < values.length (); i++) {
            temp = String.valueOf ( values.charAt ( i ) );

            if (patternMatch.containsKey ( temp )) {
                patternMatch.put ( temp , patternMatch.get ( temp ) + 1 );
            } else {
                patternMatch.put ( temp , count );
            }
            //i = i+length;
        }
        for (Map.Entry<String, Integer> valuesFromMap : patternMatch.entrySet ()) {
            System.out.println ( "Key and values from map" + " " + "Key" + " " + valuesFromMap.getKey () + " " + "value" + " " + valuesFromMap.getValue () );
        }
    }

    public void patterMatchSubString(String values , int charLen) {
        int count = 1;

        //int length = charLen;
        int limit = values.length () / charLen;
        String array[] = new String[limit];
        int startIndex = 0;
        int endIndex = charLen;
        for (int a = 0; a < array.length; a++) {

            array[a] = values.substring ( startIndex , endIndex );
            System.out.println ( "Array of String while insertion is" + " " + array[a] );
            if (endIndex < values.length () - 1) {
                startIndex = startIndex + charLen;
                endIndex = startIndex + charLen;
            } else {
                break;
            }
        }
        for (String arrayValues : array) {
            System.out.println ( "Array of String is" + " " + arrayValues );
        }
        for (int i = 0; i < limit; i++) {

            if (patternMatch.containsKey ( array[i] )) { //String.valueOf(values.charAt(i))
                patternMatch.put ( array[i] , patternMatch.get ( array[i] ) + 1 );
            } else {
                patternMatch.put ( array[i] , count );
            }
            //i = i+length;
        }
        for (Map.Entry<String, Integer> valuesFromMap : patternMatch.entrySet ()) {
            System.out.println ( "Key and values from map" + " " + "Key" + " " + valuesFromMap.getKey () + " " + "value" + " " + valuesFromMap.getValue () );
        }
    }


    public static void main(String args[]) {
        PatternMatch obj = new PatternMatch ();
        obj.patterMatchStringChar ( "AABAABBA" );
        obj.patterMatchSubString ( "AABAABBA" , 2 );
    }


}
