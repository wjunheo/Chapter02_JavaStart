package Ch02_variable;

public class VariableUseExample {

	public static void main(String[] args) {
       int hour = 3;
       int minute = 5;
 //      System.out.println(hour + "�ð�" + minute +"��");
//                         3      �ؽ�Ʈ �ð�  5   �ؽ�Ʈ ��
//                    ���ڿ�: "3"+"�ð�" 3�ð�    
 
       int totalMiniute = (hour*60) + minute;
       System.out.println("��" + totalMiniute + "��");
	}

}
