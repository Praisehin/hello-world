package com.zhengjiaxin.utils;

public class StringUtil {

	public static String toHtml(String text) {
		
		return text;
	}
	
	public static boolean isPhone(String number) {
		
		String reg_number = "/^1\\d[10]$/";
		
		if(number.length()!=11) {
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean isEmail(String number) {
		
		String reg_number = "/^1\\d[10]$/";
		
		if(number.length()!=11) {
			return false;
		}else {
			return true;
		}
	}
}
