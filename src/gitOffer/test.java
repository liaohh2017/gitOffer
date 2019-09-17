import java.math.BigInteger;
import java.util.*;

import java.util.*;

import java.util.*;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1=sc.next();
        String m1=sc.next();
        BigInteger n=new BigInteger(n1);
        BigInteger m=new BigInteger(m1);
        String s=sc.next();
        BigInteger k=new BigInteger(s);

        if(n.multiply(m).compareTo(k)<=0){
            System.out.println(0);
        }
        boolean flag=false;
       int num=0;

        while(!flag){
            num+=1;
            HashMap<Integer,Integer> map=new HashMap<>();
            for (int i = 0; i <=num; i++) {
                map.put(i,num-i);
            }
            for (int i = 0; i <=num/2 ; i++) {
                BigInteger a=new BigInteger(String.valueOf(i));
                BigInteger b=new BigInteger(String.valueOf(map.get(i)));
                if(((n.subtract(a)).multiply(m.subtract(b))).compareTo(k)<=0||((n.subtract(b)).multiply(m.subtract(a)).compareTo(k)<=0)){
                    System.out.println(num);
                    flag=true;
                    break;

                }else {
                    continue;
                }
            }

        }

    }
}
