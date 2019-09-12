package test;

import java.util.Scanner;
import java.util.Stack;


public class Welcome {

    public static String completeParentese(String str) {
        Stack<String> optrStack = new Stack<>();
        Stack<String> dataStack = new Stack<>();
        String pre="";
        for (int i = 0; i < str.length(); i++) {
        	
            if (isDigit(str.charAt(i))) {
//            	int temp=i;
                // 处理数字的情况
//            	while(temp<str.length()&&isDigit(str.charAt(temp))){
            		pre += String.valueOf(str.charAt(i));
//            		temp++;
//            	}
            	if(!isDigit(str.charAt(i+1))){
            		dataStack.push(String.valueOf(pre));
            		pre="";
            	}
                
//                i=temp;
                
            } else if (isOpeartor(str.charAt(i))) {
                // 处理操作符的情况
                optrStack.push(String.valueOf(str.charAt(i)));
            } else {
                // 处理右括号的情况
                String d2 = dataStack.pop();
                String d1 = dataStack.pop();
                String opt = optrStack.pop();
                String exstr = "(" + d1 + opt + d2 + ")";
                dataStack.push(exstr);
            }
        }

        while (optrStack.size() > 0) {
            String opt = optrStack.pop();
            String d2 = dataStack.pop();
            String d1 = dataStack.pop();
            String exstr = "(" + d1 + opt + d2 + ")";
            dataStack.push(exstr);
        }

        return dataStack.pop();
    }

    private static boolean isOpeartor(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	String str = in.nextLine();
//        String str = "1+21)*3-4)*5-6)))";
        String res = completeParentese(str);
        System.out.println(res);
    }
}
