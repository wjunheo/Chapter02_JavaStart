package Ch02_variable;

public class PrintfExample {
 public static void main(String[] args) {
	 System.out.printf("이름:%s\n", "김자바");// 주로 문자열 끝에다가 입력
	 System.out.printf("나이:%d\n", 27);
	 System.out.printf("나이:%d\n", 27);
	 System.out.printf("신장:%f\n", 186.5);
	 
	 int value = 123;
	 
	 System.out.printf("상품의 가격: %d\n", value);
	 System.out.printf("상품의 가격: %6d\n", value);
	 System.out.printf("상품의 가격: %-6d\n", value);
	 System.out.printf("상품의 가격: %06d\n", value);
	 
	 double area = 3.141592 * 10 * 10;
	 System.out.printf("반지름이 %d인 원의 넓이: %010.2f\n", 10 , area);
	 String name = "홍길동";
	 String job = "도적";
	 System.out.printf("%6d | %-10s |%10s\n", 1, name, job);;
 }
}

