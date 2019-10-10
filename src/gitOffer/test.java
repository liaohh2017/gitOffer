package test;

import java.util.*;

public class p{
	

	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        System.out.println(getLenStr(A,A.length(),B,B.length()));
    }
    /*
     * i=0||j=0，dp[i][j]=0;
     * A[i]=B[j]，dp[i][j]=dp[i-1][j-1]+1
     * A[i]!=B[j],dp[i][j]=max(dp[i-1][j],dp[i][j-1])
     */
    public static String getLenStr(String A,int m,String B,int n){
        if(m==0||n==0||A==null||B==null){
            return "-1";
        }
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=n;i++){
            dp[0][i]=0;
        }
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(A.charAt(i-1)==B.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if(dp[i][j]>max){
                        max=dp[i][j];
                        index=i-1;
                    }
                }else{
                    dp[i][j]=0;
                }
            }
        }
        if(max==0){
            return "-1";
        }else{
            int startIndex = index-max+1;
            return A.substring(startIndex,index+1);
        }
        
    }


}

