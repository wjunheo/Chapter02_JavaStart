package Ch02_variable;

public class StringConcatExample {

	public static void main(String[] args) {
		int v = 10 + 2 +8;
		System.out.println("v:" + v);
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1:" +str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2:" +str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3:" + str3);
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4:" +str4);
	}

}
