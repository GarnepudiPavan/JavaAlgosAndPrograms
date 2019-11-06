package Practise.src.com.daily.practise;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.LinkedHashMap;
import java.util.Map;

public class OperatorsTest {

    /**
     * Below method accepts numerical value of 3 digits as string and target number to be evaluated to. It then
     * generates all permutations of operators in 4X3 matrix. 4 X 3 is reached based on 1_2_3 two places to be filled with 4 operators
     * without repetition i.e 4 in first space and 3 in second space. This gives us 4X3 = 12 ways of using operators. Then we will convert the
     * expression using ScriptEngine to mathematical expression and same pattern and output to a HashMap. Method returns an Object array
     * with values of boolean if target number is evaluated then operator pattern and the given target num itself.
     * @param values
     * @param targetNum
     * @return
     * @throws ScriptException
     */
    public Object[] operatorsMethod(String values , int targetNum) throws ScriptException {
        String num[] = new String[values.length ()];

        int count = 0;
        for (int i = 0; i < values.length (); i++) {
            num[i] = String.valueOf ( values.charAt ( i ) );
        }
        //* + - /

        String arrayOperators[] = {"/" , "*" , "+" , "-"};
        String pattern[][] = new String[arrayOperators.length][arrayOperators.length - 1];
        int k = 0;
        for (int i = 0; i <= arrayOperators.length - 1; i++) {
            for (int j = 0; j <= arrayOperators.length - 2; j++) {

                pattern[i][j] = num[0] + arrayOperators[i] + num[1] + arrayOperators[j + 1] + num[2];
                if ((i == 1 && j == 0) || (i == 2 && j == 1) || (i == 3 && j == 2)) {
                    pattern[i][j] = num[0] + arrayOperators[i] + num[1] + arrayOperators[0] + num[2];
                }
                System.out.print ( pattern[i][j] + " " );
                count++;
            }
            System.out.println ( "" );
        }


/**
 * Using inbuilt JavaScript Engine provided from JDK1.6 to convert permutation of operands to mathematical expression and evaluate it
 */

        ScriptEngineManager mgr = new ScriptEngineManager ();
        ScriptEngine engine = mgr.getEngineByName ( "JavaScript" );


        Map<String, Double> temp = new LinkedHashMap<String, Double> ();
        String value = null;
        Object[] returnVal = new Object[0];
        int index = 0;
        for (int i = 0; i <= pattern.length - 1; i++) {
            for (int j = 0; j <= pattern.length - 2; j++) {

                System.out.println ( "Evaluating string to Numeric expression" + " " + pattern[i][j] + " " + engine.eval ( pattern[i][j] ) );
                if (index == count) {
                    break;
                } else if (index < count) {
                    value = engine.eval ( pattern[i][j] ).toString ();
                    temp.put ( pattern[i][j] , Double.valueOf ( value ) );
                    index++;
                }
            }
        }
        boolean isFound = false;
        for (Map.Entry<String, Double> patternValues : temp.entrySet ()) {

            if (patternValues.getValue () == targetNum) {
                isFound = true;
                returnVal = new Object[]{isFound , patternValues.getKey () , patternValues.getValue ()};
            }else{
                returnVal = new Object[]{isFound , "pattern not present" , targetNum};
            }
        }
        return returnVal;
    }

    public static void main(String args[]) throws ScriptException {
        OperatorsTest obj = new OperatorsTest ();
        Object result[] = obj.operatorsMethod ( "105" , 15 );
        System.out.println ( "Pattern found is" + " " + result[0].toString () + " " + "and value is" + " " + result[1] + " " + "for given target" + " " + result[2] );


    }
}
