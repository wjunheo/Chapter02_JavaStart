package Ch02_variable;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
//		실무에서 많이 쓰이는 강제 타입 변환
//		"문자열"---->숫자
//		숫자---> "문자열"
		
		int v1 = Integer.parseInt("10");
		
		String str ="100";
//		int    var = 100;
		
//		str = str + 1;
//		var = var + 1;
		System.out.println(str);
//		System.out.println(var);
		
//		var = Integer.parseInt(str);
//		System.out.println(var + 1);	
		
/*		String number = "1234";
				System.out.println(number + 17);
				
		int var = Integer.parseInt(number) + 1;
		System.out.println(var+ 17);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println(Byte.MAX_VALUE);
*/		
//		int high = Integer.MIN_VALUE;
		
		int value1 =Integer.parseInt("10") + 1;
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1:" +value1 );
		System.out.println("value2:" +value2 );
		System.out.println("value3:" +value3);

		String str1 = String.valueOf(10) + 1;
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		System.out.println("str1:" + str1);
		System.out.println("str2:" + str2);
		System.out.println("str3:" + str3);
	}

}
