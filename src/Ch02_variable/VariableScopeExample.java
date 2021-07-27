package Ch02_variable;

public class VariableScopeExample {
	public static void main(String[] args) {
//     자료형
//   int-> char 
		int var2= 65;
		char var1 = 65;
		char var3 = 'A'; // 67
		
		int    d1 = 3;
		double d2 = 3;
		
		
		// 클래스 - 사용자 지정 자료형
		// 자료형 
				
		System.out.println((char)var1);
		System.out.println(var2);
        System.out.println((char)(var3 + 2));
		
	}
}

