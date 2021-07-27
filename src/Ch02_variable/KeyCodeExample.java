package Ch02_variable;


public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
//  [키보드로부터 입력된 내용을 변수에 저장하고 출력하기] 
//	System.in.read();
		int keyCode;
//		//반복문(for... 횟수 , while 조건)
 		while(true) {		
 			//System.out.println("아무거나 입력해 주세요:");
			keyCode = System.in.read();
		
			System.out.println("keyCode:" + keyCode);
			
			if(keyCode == 113) {
				break;
			}
		}
 		
 		System.out.println("프로그램 종료");
	}

}
