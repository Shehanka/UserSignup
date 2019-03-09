package com.docker.UserSignup.util;

public class Rot13 {

	public static String rot13(String password) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < password.length(); i++) {
		       char c = password.charAt(i);
		       if       (c >= 'a' && c <= 'm') c += 13;
		       else if  (c >= 'A' && c <= 'M') c += 13;
		       else if  (c >= 'n' && c <= 'z') c -= 13;
		       else if  (c >= 'N' && c <= 'Z') c -= 13;
		       sb.append(c);
		   }
		   return sb.toString();
	}
}