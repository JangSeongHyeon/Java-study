
public class OperatorEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c='a';		//
		for(int i=0;i<26;i++) {				// ��{} ���� ������ 26�� �ݺ��Ѵ�.
			System.out.print(c++);		// 'a'���� 26���� ���ڸ� ����Ѵ�.
		}
		System.out.println(); 		// �ٹٲ��� �Ѵ�.
		
		c='A';
		for(int i=0;i<26;i++) {			// �� {}���� ������ 26�� �ݺ��Ѵ�.
			System.out.print(c++);	// 'A'���� 26���� ������ ����Ѵ�.
		}
		System.out.println();
		
		c='0';
		for(int i=0;i<10;i++) {			// ��{ }���� ������ 10�� �ݺ��Ѵ�.
			System.out.print(c++);		// '0'���� 10���� ���ڸ� ����Ѵ�.
		}
		System.out.println();
		

	}

}
