package Ch02_variable;

public class ByteOperationExample {

	public static void main(String[] args) {
		// ���� ���꿡���� �ڵ�Ÿ�Ժ�ȯ
		
		byte x = 100 , y = 29;
		//byte result = x + y;// 10 20  ���ڸ� ������Ǵ°Ŵ� ���ս��� ���⶧���ε� �������� ������ ����� ���� �𸣴ϱ� ����Ʈ�ΰ�����
		//����Ʈ�� ��Ʈ�� �ٲ㼭 ���ս��� �ּ�ȭ
//		int result = x + y; 
		byte result = (byte)(x + y); // ���� ����ȯ(���ս��� �ֵ����)
//	se  byte result =(byte)x + y; x�� ����Ʈ�����̶� ��ȣ�� ħ
		
		System.out.println(result);
		
		
		
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte a = 10;
		byte b = 20;
		int result2 = a + b;
		System.out.println(result2);
		
		
		
	}

}
