package _02_gotta_catchem_all;

public class CustomException extends Exception{
public static String reverseString(String s) {
	String zarg="";
	for (int i = 0; i < s.length(); i++) {
		zarg=zarg+s.charAt(s.length()-(i+1));
	}
	return zarg;
}
}
