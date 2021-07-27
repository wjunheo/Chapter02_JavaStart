package Ch02_variable;

public class OperationsPomotionExample {

	public static void main(String[] args) {
		byte bv1 =10;
		byte bv2 =20;
//		byte bv3 = bv1 + bv2;
		int iv1 = bv1 + bv2;
		System.out.println(iv1);
		
		char cv1 = 'A';
		char cv2 = 1;
//		char cv3 = cv1 + cv2;
		int iv2 =cv1 + cv2;
		System.out.println("유니코드=" + iv2);
		System.out.println("출력문자=" + (char)iv2);
		
		int iv3 = 10;
		int iv4 = iv3/4;
		System.out.println(iv4);
		
		int iv5 = 10;
//		int iv6 = 10/ 4.0;
		double dv = iv5 / 4.0;
		System.out.println(dv);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
		
	}

}
