package com.runescape.util;

public class Misc {

	public static String getPlayTime(int ticks){
		
		long HR = (ticks / 3600);
		String HRPrefix = HR < 10 ? "0" + HR + "" : "" + HR + "";
		
		long MIN = (ticks / 60) - (HR * 60);
		String MINPrefix = MIN < 10 ? "0" + MIN + "" : "" + MIN + "";
		
		long SEC = ticks - (HR * 3600) - (MIN * 60);
		String SECPrefix = SEC < 10 ? "0" + SEC + "" : "" + SEC + "";

		return (HRPrefix + ":" + MINPrefix + ":" + SECPrefix + "");
	}	
}
