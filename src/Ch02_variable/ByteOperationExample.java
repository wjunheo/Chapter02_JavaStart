package Ch02_variable;

public class ByteOperationExample {

	public static void main(String[] args) {
		// 정수 연산에서의 자동타입변환
		
		byte x = 100 , y = 29;
		//byte result = x + y;// 10 20  숫자를 넣으면되는거는 값손실이 없기때문인데 미지수를 넣으면 어떤값이 올지 모르니까 바이트로계산안함
		//바이트를 인트로 바꿔서 값손실을 최소화
//		int result = x + y; 
		byte result = (byte)(x + y); // 강제 형변환(값손실이 있든없든)
//	se  byte result =(byte)x + y; x만 바이트적용이라 괄호를 침
		
		System.out.println(result);
		
		
		
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte a = 10;
		byte b = 20;
		int result2 = a + b;
		System.out.println(result2);
		
		
		
	}

}
