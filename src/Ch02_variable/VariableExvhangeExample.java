package Ch02_variable;

public class VariableExvhangeExample {
  public static void main(String[] args) {
	  
	  int x = 3; //5
	  int y = 5; //3
	  
	
	  
		  // x:3, y :5
	  //why no x = y; // 5 x : 5
	  // y = x; //5 y:5
	  
	  int temp = x; // por isso usa temp//3
	  x = y;
	  y = temp;
	  System.out.println("y=x, x의 값: " + x);
	  System.out.println("y=x, y의 값: " + y);
	  System.out.println("x: "+x+", y:" +y);
	
}
}
