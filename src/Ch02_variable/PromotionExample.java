package Ch02_variable;

public class PromotionExample {
	public static void main(String[] args) {
		
//		타입(자료형) 변환?
//		자동 (묵시적) : 자바는 30( int)인트로 인식하는 과정은 컴파일러가 
//		강제 (명시적)
//		값 허용범위가 큰 타입 = 작은타입 
		
	 
		System.out.println(65);
		
		
		
//		byte(1) short(2)  int(4)  long(8) float(4) long (8) 
//		        char(2)   float(4) 
//		(maoir) = (menor) converter automaticamente
		int  iv = 99999999;
		long lv = 999999999999999_99L; // sem L leria em int 
		float fv = 99999999999999_99999999999999999999.0f; // sem f leria em double
//		"값손실" 발생 여부
	
		System.out.println((int)5.7 );// 정수만 반영 뒤에 소수점 떼어버림
		
		
		
		
		
		
	}
}
