package ch09.resolve07.answer03;

public class ArrayUtility {
	public static double[] intToDouble(int[] source) {
		int len = source.length;
		double[] dest = new double[len];
		for(int i=0;i<len;i++) {
			dest[i] = (double)source[i];
		}
		return dest;
	}
	public static int[] doubleToInt(double[] source) {
		int len = source.length;
		int[] dest = new int[len];
		for(int i=0;i<len;i++) {
			dest[i] = (int)source[i];
		}
		return dest;
	}
}
