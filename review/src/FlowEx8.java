import java.util.*;

public class FlowEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����� �ֹι�ȣ�� �Է��ϼ���.(011231-1111222)>");
		
		Scanner scanner=new Scanner(System.in);
		String regNo=scanner.nextLine();
		
		char gender=regNo.charAt(7);	// �Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ����
		
		switch(gender) {
		case '1': case '3':
			System.out.println("����� �����Դϴ�.");
			break;
			
		case '2': case '4':
			System.out.println("����� �����Դϴ�");
			break;
		
		default:
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
		
		

	}

}
