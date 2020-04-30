package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double divide(double a, double b) throws CustomException{
		if(b==0.0) {
			throw new CustomException();
		}
		return a/b;
	}
	public static String reverseString(String s) {
		String zarg="";
		if(s==zarg) {
			throw new IllegalStateException();
		}
		for (int i = 0; i < s.length(); i++) {
			zarg=zarg+s.charAt(s.length()-(i+1));
		}
		return zarg;
	}
}
