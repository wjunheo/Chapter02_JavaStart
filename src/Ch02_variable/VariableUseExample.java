package Ch02_variable;

public class VariableUseExample {

	public static void main(String[] args) {
       int hour = 3;
       int minute = 5;
 //      System.out.println(hour + "시간" + minute +"분");
//                         3      텍스트 시간  5   텍스트 분
//                    문자열: "3"+"시간" 3시간    
 
       int totalMiniute = (hour*60) + minute;
       System.out.println("총" + totalMiniute + "분");
	}

}
