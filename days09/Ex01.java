package days09;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 1. 거듭제곱(누승,멱,pow) 재귀함수
		// 2 ^ 3 = 2*2*2=8
		// 2 ^-3= 1/2^3 = 1/8 = 실수
		// 밑수 지수
		
		
		// int result = pow(2,3);
		// double result = pow(2, -3);
		// double result = recursivePow(2, 3);
	     double result = recursivePow(2, -3);
		 System.out.println(result);
		

	} // main
   // 1. 거듭제곱 재귀함수
	public static double recursivePow(int n, int m) {
		if (m>1) return n * recursivePow(n, m-1);
		else if(m==1) return n;
		else if (m==0) return 1;
		else return 1/recursivePow(n,-1*m);
	}
	
	
	// 1. 거듭제곱 일반함수
	public static double pow(int n, int m) {
		double result = 1;
		// if (m<0)  int exp = -1*m;
		int exp = Math.abs(m);
		for (int i = 0; i < exp; i++) {
			result*=n;
		}
		return m<0 ? 1/result : result;
	}
    

} // class

