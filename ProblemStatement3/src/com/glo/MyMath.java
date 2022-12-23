package com.glo;

import java.io.*;
	import java.util.*;

	interface PerformOperation {
	    boolean check(int a);
	}

class MyMath {
	    public static boolean checker(PerformOperation p, int num) {
	        return p.check(num);
	    }

	    public static boolean isPrime(int a){
	        for(int i = 2; i <= Math.sqrt(a); i++)
	            if(a % i == 0)
	                return false;
	        return true;
	    }

	    public static PerformOperation isOdd() {
	        return (int a) -> a % 2 != 0;
	    }

	    public static PerformOperation isPrime() {
	        return (int a) -> {
	            if (a < 2) {
	                return false;
	            }
	            for (int i = 2; i <= Math.sqrt(a); i++) {
	                if (a % i == 0) {
	                    return false;
	                }
	            }
	            return true;
	        };
	    }

	    public static PerformOperation isPalindrome() {
	        return (int a) -> {
	            String s = Integer.toString(a);
	            int n = s.length();
	            for (int i = 0; i < n / 2; i++) {
	                if (s.charAt(i) != s.charAt(n - i - 1)) {
	                    return false;
	                }
	            }
	            return true;
	        };
	    }
	}