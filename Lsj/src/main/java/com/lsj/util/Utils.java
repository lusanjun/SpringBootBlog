package com.lsj.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Utils {


	public static String Md5(String source){
		MessageDigest messageDigest = null;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException ignored) {
		}
		byte[] encode = messageDigest.digest(source.getBytes());
		StringBuilder hexString = new StringBuilder();
		for (byte anEncode : encode) {
			String hex = Integer.toHexString(0xff & anEncode);
			if (hex.length() == 1) {
				hexString.append('0');
			}
			hexString.append(hex);
		}
		return hexString.toString();
	}
}
