package Practise.src.com.daily.practise;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.LinkedHashMap;
import java.util.Map;

public class OperatorsTest {

    String num[];
    Map<String, Double> temp = new LinkedHashMap<String, Double> ();
    String value = null;
    Object[] returnVal = new Object[0];
    boolean isFound = false;

    /**
     * Using inbuilt JavaScript Engine provided from JDK1.6 to convert permutation of operands to mathematical expression and evaluate it
     */

    ScriptEngineManager mgr = new ScriptEngineManager ();
    ScriptEngine engine = mgr.getEngineByName ( "JavaScript" );

    /**
     * Below method accepts numerical value of 3 digits as string and target number to be evaluated to. It then
     * generates all permutations of operators in 4X3 matrix. 4 X 3 is reached based on 1_2_3 two places to be filled with 4 operators
     * without repetition i.e 4 in first space and 3 in second space. This gives us 4X3 = 12 ways of using operators. Then we will convert the
     * expression using ScriptEngine to mathematical expression and same pattern and output to a HashMap. Method returns an Object array
     * with values of boolean if target number is evaluated then operator pattern and the given target num itself.
     *
     * @param values
     * @param targetNum
     * @return
     * @throws ScriptException
     */
    public Object[] operatorsMethod(String values , int targetNum , boolean repetition) throws ScriptException {

        num = new String[values.length ()];
        for (int i = 0; i < values.length (); i++) {
            num[i] = String.valueOf ( values.charAt ( i ) );
        }
        //* + - /
        if (!repetition) {
            withoutRepetition ( num );
        } else {
            withRepetition ( num );

        }

        for (Map.Entry<String, Double> patternValues : temp.entrySet ()) {

            System.out.println ( "Pattern Key " + " " + patternValues.getKey () + " " + "Patten Value" + " " + patternValues.getValue () );
            if (patternValues.getValue () == targetNum) {
                isFound = true;
                returnVal = new Object[]{isFound , patternValues.getKey () , patternValues.getValue ()};
                break;
            } else if (patternValues.getValue () != targetNum) {
                returnVal = new Object[]{isFound , "No matching pattern exists" , targetNum};
            }
        }
        return returnVal;
    }

    private void withoutRepetition(String[] num) throws ScriptException {
        String arrayOperators[] = {"/" , "*" , "+" , "-"};
        String pattern[][] = new String[arrayOperators.length][arrayOperators.length - 1];//1st place 4 operators and second place 3

        for (int i = 0; i <= arrayOperators.length - 1; i++) {
            for (int j = 0; j <= arrayOperators.length - 2; j++) {

                pattern[i][j] = num[0] + arrayOperators[i] + num[1] + arrayOperators[j + 1] + num[2];
                if ((i == 1 && j == 0) || (i == 2 && j == 1) || (i == 3 && j == 2)) {
                    pattern[i][j] = num[0] + arrayOperators[i] + num[1] + arrayOperators[0] + num[2];
                }
                System.out.print ( pattern[i][j] + " " );

                value = engine.eval ( pattern[i][j] ).toString ();
                temp.put ( pattern[i][j] , Double.valueOf ( value ) );
            }
            System.out.println ( "" );
        }
    }

    private void withRepetition(String[] num) throws ScriptException {
        String arrayOperators[] = {"/" , "*" , "+" , "-"};
        String pattern[][] = new String[arrayOperators.length][arrayOperators.length];//1st place 4 operators and second place 4
        for (int i = 0; i < arrayOperators.length; i++) {
            for (int j = 0; j < arrayOperators.length; j++) {

                pattern[i][j] = num[0] + arrayOperators[i] + num[1] + arrayOperators[j] + num[2];

                System.out.print ( pattern[i][j] + " " );

                value = engine.eval ( pattern[i][j] ).toString ();
                temp.put ( pattern[i][j] , Double.valueOf ( value ) );
            }
            System.out.println ( "" );
        }
    }

    public static void main(String args[]) throws ScriptException {
        OperatorsTest obj = new OperatorsTest ();
        Object result[] = obj.operatorsMethod ( "105" , 5 , true );
        System.out.println ( "Pattern found is" + " " + result[0].toString () + " " + "and value is" + " " + result[1].toString () + " " + "for given target" + " " + result[2].toString () );
    }
}