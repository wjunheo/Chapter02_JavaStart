package Ch02_variable;

public class CastingExample {

	public static void main(String[] args) {
//		����(�����)����ȯ
//		:~ �ؼ��ϴ� ����� ��ȯ...
		
		System.out.println((char)65);
//		���� = ū 
//		Ȯ��(Promtion) : int ----> double �ս�(x) �ڵ�
//		���(Demotion) : double ----> int �ս�(o) ����..0.5---> 0�̵Ǿ����
	
		int iv = 127;
		iv = 1000000;

		byte bv = (byte)iv;
		double dv = 3.14;
		iv = (int)dv;
		
		System.out.println(iv);
	System.out.println(bv);
	
//	"781001-0000000" ���ڿ��� ���� ���ڸ� ����ȭ�Ҷ� 
//	int number =(int)"7810010000000";
	
	System.out.println("781001-0000000");//���ڿ�
	
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
