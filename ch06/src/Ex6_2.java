
public class Ex6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv4 t1=new Tv4();
		Tv4 t2=new Tv4();
		
		System.out.println("t1�� channel����"+t1.channel+"�Դϴ�.");
		System.out.println("t2�� channel����"+t2.channel+"�Դϴ�.");
		
		t1.channel=7;		// channel�� ���� 7���Ѵ�.
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		t2=t1;		// �������� t1�� ���� t2�� ����
		System.out.println("t1�� channel1 ����"+t1.channel+"�Դϴ�.");
		System.out.println("t2�� channel2 ����"+t2.channel+"�Դϴ�.");

	}

}