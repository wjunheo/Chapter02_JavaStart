package Ch02_variable;

public class PrintfExample {
 public static void main(String[] args) {
	 System.out.printf("�̸�:%s\n", "���ڹ�");// �ַ� ���ڿ� �����ٰ� �Է�
	 System.out.printf("����:%d\n", 27);
	 System.out.printf("����:%d\n", 27);
	 System.out.printf("����:%f\n", 186.5);
	 
	 int value = 123;
	 
	 System.out.printf("��ǰ�� ����: %d\n", value);
	 System.out.printf("��ǰ�� ����: %6d\n", value);
	 System.out.printf("��ǰ�� ����: %-6d\n", value);
	 System.out.printf("��ǰ�� ����: %06d\n", value);
	 
	 double area = 3.141592 * 10 * 10;
	 System.out.printf("�������� %d�� ���� ����: %010.2f\n", 10 , area);
	 String name = "ȫ�浿";
	 String job = "����";
	 System.out.printf("%6d | %-10s |%10s\n", 1, name, job);;
 }
}

