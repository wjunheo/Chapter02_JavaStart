package Ch02_variable;

public class CastingExample {

	public static void main(String[] args) {
//		강제(명시적)형변환
//		:~ 해석하는 방법을 변환...
		
		System.out.println((char)65);
//		작은 = 큰 
//		확장(Promtion) : int ----> double 손실(x) 자동
//		축소(Demotion) : double ----> int 손실(o) 강제..0.5---> 0이되어버림
	
		int iv = 127;
		iv = 1000000;

		byte bv = (byte)iv;
		double dv = 3.14;
		iv = (int)dv;
		
		System.out.println(iv);
	System.out.println(bv);
	
//	"781001-0000000" 문자열에 박힌 숫자를 숫자화할때 
//	int number =(int)"7810010000000";
	
	System.out.println("781001-0000000");//문자열
	
	int intvalue = 44032;
	char charvalue = (char) intvalue;
	System.out.println(charvalue);
	
	long longvalue =500;
	intvalue = (int) longvalue;
	System.out.println(intvalue);
	
	double doublevalue =3.14;
	intvalue = (int) doublevalue;
	System.out.println(intvalue);
	
	}

}
