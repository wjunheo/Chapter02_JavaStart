package Ch02_variable;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String inputData;
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된문자열:\"" + inputData + "\"");
			if(inputData.contentEquals("q")) {
				break;
			
				
			}
			System.out.println("종료");
		}
		
	}

}
