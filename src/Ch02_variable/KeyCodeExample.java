package Ch02_variable;


public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
//  [Ű����κ��� �Էµ� ������ ������ �����ϰ� ����ϱ�] 
//	System.in.read();
		int keyCode;
//		//�ݺ���(for... Ƚ�� , while ����)
 		while(true) {		
 			//System.out.println("�ƹ��ų� �Է��� �ּ���:");
			keyCode = System.in.read();
		
			System.out.println("keyCode:" + keyCode);
			
			if(keyCode == 113) {
				break;
			}
		}
 		
 		System.out.println("���α׷� ����");
	}

}
