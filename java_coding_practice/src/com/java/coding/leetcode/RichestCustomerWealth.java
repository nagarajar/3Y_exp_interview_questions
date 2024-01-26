package com.java.coding.leetcode;

public class RichestCustomerWealth {
	public static void main(String[] args) {
//		int[][] accounts = {{1,2,3},{3,2,1}};
		int[][] accounts = {{1,5},{7,3},{3,5}};
		System.out.println(maximumWealth(accounts));
		
	}
	
	public static int maximumWealth(int[][] accounts) {
        //int[] sumArr = new int[accounts.length];
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            int b = 0;
            for(int j=0; j<accounts[i].length; j++){
                b+=accounts[i][j];
            }
            //sumArr[i] = b;
            max = Math.max(max, b);
        }
        //System.out.println(Arrays.toString(sumArr));
//        int max = 0;
//        for(int n:sumArr) {
//        	if(n > max) {
//        		max = n;
//        	}
//        }
        return max;
    }
}
