package com.daily.practise;

import java.util.Map;
import java.util.TreeMap;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class EvaluateExpressionPrac {
	String numericVal[] = new String[5];
	String mathExpression[][];
	String mathOperators[] = { "+", "-", "*", "/" };

	public Map<String, String> expressionEval(String numeric, boolean withRepetition) throws NumberFormatException, ScriptException {
		Map<String, String> expression = new TreeMap<String, String>();
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine js = mgr.getEngineByName("JavaScript");
		numericVal = numeric.split("");
		for (String val : numericVal) {
			System.out.println("Entered numeric val is" + " " + val);

		}

		if (!withRepetition) {
			mathExpression = new String[mathOperators.length][mathOperators.length - 1];
			for (int i = 0; i < mathOperators.length; i++) {
				for (int j = 0; j < mathOperators.length - 1; j++) {
					mathExpression[i][j] = numericVal[0] + mathOperators[i] + numericVal[1] + mathOperators[j + 1]
							+ numericVal[2];
					if ((i == 1 && j == 0) || (i == 2 && j == 1) || (i == 3 && j == 2)) {
						mathExpression[i][j] = numericVal[0] + mathOperators[i] + numericVal[1] + mathOperators[0]
								+ numericVal[2];
						
					}expression.put(mathExpression[i][j], js.eval(mathExpression[i][j]).toString());
				}
			}
		} else if (withRepetition) {
			mathExpression = new String[mathOperators.length][mathOperators.length];
			for (int i = 0; i < mathOperators.length; i++) {
				for (int j = 0; j < mathOperators.length; j++) {
					mathExpression[i][j] = numericVal[0] + mathOperators[i] + numericVal[1] + mathOperators[j]
							+ numericVal[2];

					expression.put(mathExpression[i][j], js.eval(mathExpression[i][j]).toString());
				}
			}
		}
return expression;
	}

	public void extractor(String number, boolean val) throws ScriptException {

		Map<String, String> valuesExt = expressionEval(number, val);
		for(Map.Entry<String, String> valEx: valuesExt.entrySet()) {
			System.out.println("Expression evaluated with all permutations of given number"+" "+valEx.getKey()+" "+"="+" "+valEx.getValue());
		}
	}

	public static void main(String[] args) throws ScriptException {
		// TODO Auto-generated method stub
		EvaluateExpressionPrac obj = new EvaluateExpressionPrac();
		obj.extractor("123", false);
	}

}
