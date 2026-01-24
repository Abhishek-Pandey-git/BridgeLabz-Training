package com.junit;



public class StringUtils {
	public String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	public boolean isPalindrom(String str) {
		if(str.equals(reverse(str))) {
			return true;
		}
		return false;
	}
	
	public String toUpperCase(String str) {
		StringBuilder ans=new StringBuilder("");
		
		for(int i=0;i<str.length();i++) {
			ans.append(Character.toUpperCase(str.charAt(i)));
		}
		
		return ans.toString();
		
	}
}

